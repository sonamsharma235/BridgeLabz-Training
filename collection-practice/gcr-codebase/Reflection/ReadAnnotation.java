package Reflection;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

@Author(name="Sonam Sharma")
class Book {}

public class ReadAnnotation {
	 public static void main(String[] args) {

	  Author a =
	   Book.class.getAnnotation(Author.class);

	  System.out.println("Author: "+a.name());
	 }
	}
