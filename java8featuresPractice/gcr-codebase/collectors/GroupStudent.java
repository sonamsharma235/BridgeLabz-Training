package collectors;

import java.util.*;
import java.util.stream.*;
import java.util.stream.Collectors;

class Student {

    private String name;
    private String grade;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }
}

public class GroupStudent {
   public static void main(String []args) {
	   List<Student>list=Arrays.asList(
			   new Student("sonam","A"),
			   new Student("bhumi","A"),
			   new Student("arti","B"),
			   new Student("jyoti","C"),
			   new Student("Poja","C"),
			   new Student("nidhi","B"));
	   Map<String, List<String>> result =
			    list.stream()
			        .collect(Collectors.groupingBy(
			            s -> s.getGrade(),
			            Collectors.mapping(
			                s -> s.getName(),
			                Collectors.toList()
			            )
			        ));
   }
}
