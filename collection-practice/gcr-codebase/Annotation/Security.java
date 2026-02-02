package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed{
 String value();
}

class AdminService{

	 @RoleAllowed("ADMIN")
	 public void deleteUser(){}
	}

class Security{

	 static String role="USER";

	 public static void invoke(Object o,String m)throws Exception{

	  Method me=o.getClass().getMethod(m);

	  RoleAllowed r=me.getAnnotation(RoleAllowed.class);

	  if(!r.value().equals(role)){
	   System.out.println("Access Denied!");
	   return;
	  }

	  me.invoke(o);
	 }
	}

