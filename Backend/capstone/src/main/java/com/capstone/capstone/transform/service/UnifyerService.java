package com.capstone.capstone.transform.service;

import com.capstone.capstone.transform.entities.UnifiedProduct;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;

public class UnifyerService {



    public ArrayList<UnifiedProduct> parser() throws JsonProcessingException {

        ArrayList<UnifiedProduct> temp = new ArrayList<UnifiedProduct>();
        ObjectMapper mapper = new ObjectMapper();

        // De-serialize to an object
        UnifiedProduct product = mapper.readValue("{\"name\": \"Milk\"}", UnifiedProduct.class);

        // Read a single attribute
        JsonNode nameNode = mapper.readTree("{\"name\": \"Milk\"}");

        return temp;
    }

}