package com.oreilly.demo;

import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface InvoiceService {
    public abstract Map<Long, String> getCustomerInvoice(Long customerId) throws JsonMappingException, JsonProcessingException;
}
