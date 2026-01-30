package com.example.JUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class StringUtilsTest {
   
	@Test
    void testReverse() {
        assertEquals("olleh", StringUtils.reverse("hello"));
    }

    @Test
    void testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("madam"));
        assertFalse(StringUtils.isPalindrome("hello"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("JAVA", StringUtils.toUpperCase("java"));
    }
}
