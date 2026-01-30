package com.example.JUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class ListManagerTest {
    
	@Test
	void testAddElement() {
		List<Integer>list=new ArrayList<>();
		ListManager.addElement(list, 10);
		
		assertTrue(list.contains(10));
	}
	
	@Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);

        ListManager.removeElement(list, 10);

        assertFalse(list.contains(10));
    }
	
	 void testGetSize() {
	        List<Integer> list = new ArrayList<>();
	        list.add(1);
	        list.add(2);

	        assertEquals(2, ListManager.getSize(list));
	    }
	
}
