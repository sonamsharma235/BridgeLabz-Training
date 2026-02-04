package com.backend.Json_Data;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;

public class JsonToXml {
 public static void main(String[] args)throws Exception {

  ObjectMapper json = new ObjectMapper();
  XmlMapper xml = new XmlMapper();

  JsonNode node =
     json.readTree(new File("input.json"));

  xml.writeValue(new File("data.xml"), node);
 }
}

