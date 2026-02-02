package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime{}

class Service {

	 @LogExecutionTime
	 public void process() throws Exception{
	  Thread.sleep(200);
	 }
	}

class Runner{
	 public static void main(String[] a)throws Exception{

	  Service s=new Service();

	  Method m=s.getClass().getMethod("process");

	  if(m.isAnnotationPresent(LogExecutionTime.class)){

	   long st=System.nanoTime();

	   m.invoke(s);

	   long et=System.nanoTime();

	   System.out.println("Time: "+(et-st));
	  }
	 }
	}
