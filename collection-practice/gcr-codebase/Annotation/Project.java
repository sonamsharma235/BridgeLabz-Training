package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
 String task();
 String assignedTo();
 String priority() default "MEDIUM";
}

class Project {

	 @Todo(task="Add payment",assignedTo="Sonam")
	 public void pay(){}

	 @Todo(task="Fix bug",assignedTo="Rahul",priority="HIGH")
	 public void fix(){}

	 public static void main(String[] a)throws Exception{

	  for(Method m: Project.class.getDeclaredMethods()){

	   Todo t=m.getAnnotation(Todo.class);

	   if(t!=null)
	    System.out.println(t.task()+" "+t.priority());
	  }
	 }
	}
