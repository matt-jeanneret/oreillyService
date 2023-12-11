package com.oreilly.demo;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RestController
public class InvoiceController {

    //There should be some sort of authorization layer in this application so that we can control who accesses customer data
    @Autowired
    InvoiceService customerService;

    // Ideally we would have advice or something like that set up to handle the JSON exceptions across the board
    @GetMapping("/Invoice")
    @ResponseBody
    public Map<Long, String> customer(@RequestParam Long customerId) throws JsonMappingException, JsonProcessingException {
        return customerService.getCustomerInvoice(customerId);
    }
}