package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength{
 int value();
}

class User{

	 @MaxLength(5)
	 String username;

	 User(String u)throws Exception{

	  Field f=getClass().getDeclaredField("username");

	  MaxLength m=f.getAnnotation(MaxLength.class);

	  if(u.length()>m.value())
	   throw new IllegalArgumentException("Too long");

	  this.username=u;
	 }
	}
