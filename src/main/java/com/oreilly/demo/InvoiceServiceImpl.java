package com.oreilly.demo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class InvoiceServiceImpl implements InvoiceService {
    
    private final InvoiceRepository repository;
    private final ObjectMapper objectMapper;

    InvoiceServiceImpl(InvoiceRepository repository) {
        this.repository = repository;
        objectMapper = new ObjectMapper();
    }

    public Map<Long, String> getCustomerInvoice(Long customerId) throws JsonMappingException, JsonProcessingException {
        List<Invoice> invoices = this.repository.findBycustomerId(customerId);
        Map<Long, String> customerData = new HashMap<>();
        // Iterate over the invoices and add an entry for each invoice associated with the customer. This is needed because we are storing JSON data in the table. It might be worth moving that data to its own table eventually instead of just keeping it as a string.
        invoices.forEach(invoice -> {
            try {
                InvoiceData invoiceData = objectMapper.readValue(invoice.getInvoiceData(), InvoiceData.class);
                customerData.put(invoice.getInvoiceId(), invoiceData.getTenderDetails().getTenderType().toString());
                // We should have a custom expception or some type of customer handler for this situation
            } catch (JsonMappingException e) {
                throw new RuntimeException(e);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);

            }

        });

        return customerData;
    }
 
}
