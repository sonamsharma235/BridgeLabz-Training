package com.backend.Json_Data;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.Iterator;

public class PrintJson {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode node =
          mapper.readTree(new File("input.json"));

        Iterator<String> keys = node.fieldNames();

        while(keys.hasNext()) {
            String k = keys.next();
            System.out.println(k + " : " + node.get(k));
        }
    }
}
