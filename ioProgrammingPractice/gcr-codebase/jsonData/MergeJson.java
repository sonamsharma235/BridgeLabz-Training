package com.backend.Json_Data;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;

public class MergeJson {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        ObjectNode obj1 =
          (ObjectNode) mapper.readTree(new File("user1.json"));

        ObjectNode obj2 =
          (ObjectNode) mapper.readTree(new File("user2.json"));

        obj1.setAll(obj2);

        mapper.writeValue(new File("merged.json"), obj1);

        System.out.println("Merged Successfully");
    }
}

