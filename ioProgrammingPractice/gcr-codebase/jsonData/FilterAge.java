package com.backend.Json_Data;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class FilterAge {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode array =
          mapper.readTree(new File("users.json"));

        for(JsonNode n : array) {
            if(n.get("age").asInt() > 25) {
                System.out.println(n.get("name").asText());
            }
        }
    }
}
