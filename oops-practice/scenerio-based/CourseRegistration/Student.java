package CourseRegistration;

import java.util.*;
public class Student extends Person{
   private int id;
   
   private List<String>courses=new ArrayList<>();
   private Map<String,Integer>grades=new HashMap<>();
   
   
   Student(int id,String name,int age){
	   super(name,age);
	   this.id=id;
   }
   
   public int getId() {
	   return id;
   }
   public List<String> getCourses(){
	   return courses;
   }
   public void addGrade(String course,int marks) {
	   grades.put(course,marks);
   }
   
   public void showGrades() {
	   for (String c : grades.keySet()) {
           System.out.println(c + " : " + grades.get(c));
       }
   }
   
   
}
