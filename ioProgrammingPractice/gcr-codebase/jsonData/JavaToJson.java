package com.backend.Json_Data;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.util.*;

class User {
    private int id;
    private String name;
    private int age;
    private String email;
    private List<String> skills;
    private Map<String, String> address; 

    // Default Constructor 
    public User() {
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public Map<String, String> getAddress() {
        return address;
    }

    public void setAddress(Map<String, String> address) {
        this.address = address;
    }
}

public class JavaToJson{
    public static void main(String[] args) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();          
            // Create User Object
            User user = new User();
            user.setId(102);
            user.setName("Bob");
            user.setAge(30);
            user.setEmail("bob@example.com");
            user.setSkills(Arrays.asList("Python", "Django", "AWS"));
            user.setAddress(Map.of("city", "Los Angeles", "zip", "90001"));         
            // Convert Java Object to JSON
            objectMapper.writeValue(new File("output.json"), user);           
            System.out.println("JSON file created successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
