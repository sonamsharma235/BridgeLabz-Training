package Review;

public class Student {
   String name;
   Student(String name){
	  this.name=name;
   }
   Student(Student s){
	   this.name=s.name;
   }
}
