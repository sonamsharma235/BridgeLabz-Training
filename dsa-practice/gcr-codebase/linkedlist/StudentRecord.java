
import java.util.*;
class Node {
	  int rollno;
	  String name;
	  int age;
	  char grade;
	  Node next;
	  
	  Node(int rollno,String name, int age, char grade){
		  this.rollno=rollno;
		  this.age=age;
		  this.grade=grade;
		  this.name=name;
		  this.next=null;
	  }
	}

class StudentLinkedList{
	Node head;
	
	void addAtBeginning(int rollno, String name, int age,char grade) {
		Node nn=new Node(rollno,name,age,grade);
		nn.next=head;
		head=nn;
	}
	//add at end
	void addAtEnd(int rollno, String name, int age,char grade) {
		Node nn=new Node(rollno,name,age,grade);
		
		if(head==null) {
			head=nn;
			return;
		}
		Node dummy=head;
		while(dummy.next!=null) {
			dummy=dummy.next;
		}
		dummy.next=nn;
		nn.next=null;
	}
	
	// add at specific position
	void addAtPosition(int rollno,int pos, String name, int age,char grade) {
		if (pos == 1) {
            addAtBeginning(rollno, name, age, grade);
            return;
        }
		
		Node nn=new Node(rollno,name,age,grade);
		Node dummy=head;
		
		pos-=1;
		while(pos-->1) {
			dummy=dummy.next;
		}
		Node n=dummy.next;
		dummy.next=nn;
		nn.next=n;
	}
	
	// delete by rollno
	void deleteByRollNo(int rollno) {
		if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head.rollno == rollno) {
            head = head.next;
            System.out.println("Student record deleted.");
            return;
        }
		
		Node nn=head;
		Node pre=nn;
		while(nn.next!=null) {
			if(nn.rollno==rollno) {
				pre.next=nn.next;
				nn.next=null;
				System.out.println("Student record deleted.");
				return;
			}
			pre=nn;
			nn=nn.next;
		}
		if(nn.next==null) {
			if(nn.rollno==rollno) {
				pre.next=nn.next;
				System.out.println("Student record deleted.");
				return;
			}
		}
		
	}
	
	void searchStudent(int rollNo) {
        Node temp = head;

        while (temp != null) {
            if (temp.rollno == rollNo) {
                System.out.println("Student Found:");
                System.out.println("Roll No: " + temp.rollno);
                System.out.println("Name: " + temp.name);
                System.out.println("Age: " + temp.age);
                System.out.println("Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found!");
    }
	
	// Update grade
    void updateGrade(int rollNo, char newGrade) {
        Node temp = head;

        while (temp != null) {
            if (temp.rollno == rollNo) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully!");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found!");
    }
    
 // Display all students
    void displayAll() {
        if (head == null) {
            System.out.println("No student records available.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.println("---------------------");
            System.out.println("Roll No: " + temp.rollno);
            System.out.println("Name: " + temp.name);
            System.out.println("Age: " + temp.age);
            System.out.println("Grade: " + temp.grade);
            temp = temp.next;
        }
    }
	 
}

public class StudentRecord {
    public static void main(String[]args) {
    	Scanner sc=new Scanner(System.in);
    	StudentLinkedList list=new StudentLinkedList();
    	int choice;
    	
    	do {
            System.out.println("--- Student Record Management ---");
            System.out.println("1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Add at Position");
            System.out.println("4. Delete by Roll No");
            System.out.println("5. Search by Roll No");
            System.out.println("6. Update Grade");
            System.out.println("7. Display All");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    list.addAtBeginning(1, "Amit", 20, 'A');
                    break;
                case 2:
                    list.addAtEnd(2, "Neha", 21, 'B');
                    break;
                case 3:
                    list.addAtPosition(2, 3, "Rahul", 22, 'A');
                    break;
                case 4:
                	list.deleteByRollNo(2);
                    break;
                case 5:
                    list.searchStudent(1);
                    break;
                case 6:
                    list.updateGrade(1, 'A');
                    break;
                case 7:
                    list.displayAll();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);
    }
}
