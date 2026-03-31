package com.backend.Json_Data;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.*;

 class User {
    public int id;
    public String name;
    public int age;
    public String email;

    public User(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }
}

 public class ListToJson {
     public static void main(String[] args) throws Exception {

         ObjectMapper mapper = new ObjectMapper();

         List<User> list = new ArrayList<>();

         list.add(new User(1,"A",26,"a@gmail.com"));
         list.add(new User(2,"B",22,"b@gmail.com"));

         mapper.writeValue(new File("users.json"), list);

         System.out.println("JSON Array Created");
     }
 }
