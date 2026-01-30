package com.example.JUnit;

import java.util.*;
public class ListManager {
   
	
	public static void addElement(List<Integer>list ,int val) {
		 list.add(val);
	}
	
	public static void removeElement(List<Integer>list ,int val) {
		list.remove(Integer.valueOf(val));
	}
	
	public static int getSize(List<Integer> list) {
        return list.size();
    }
}
