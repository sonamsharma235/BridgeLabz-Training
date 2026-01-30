package com.example.JUnit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExceptionDivideTest {
   
	@Test
	public void testDivide() {
		assertEquals(4,ExceptionDivide.divide(8, 2));
	}
}
