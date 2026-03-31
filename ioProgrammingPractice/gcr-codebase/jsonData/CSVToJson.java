package com.backend.Json_Data;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.util.*;

public class CSVToJson {
 public static void main(String[] args)throws Exception {

  BufferedReader br =
    new BufferedReader(new FileReader("data.csv"));

  ObjectMapper mapper = new ObjectMapper();

  String line;
  List<Map<String,String>> list = new ArrayList<>();

  while((line = br.readLine()) != null) {
     String[] p = line.split(",");

     Map<String,String> m = new HashMap<>();
     m.put("name", p[0]);
     m.put("age", p[1]);

     list.add(m);
  }

  mapper.writeValue(new File("data.json"), list);
 }
}
