public class EmployeeManagement{
   static String CompanyName;
   private String name;
   private final int id;
   private String designation;
   static int totalEmp=0;

   EmployeeManagement(String name,int id,String designation){
      this.name=name;
      this.id=id;
      this.designation=designation;
      totalEmp++;
   }
   static void displayTotalEmployees(){
      System.out.println("Total Employee  : "+totalEmp);
   }
   static void displayCompanyNmae(String CompanyName){
      System.out.println("Company Name   : "+CompanyName);
   }
   public void displayDetails(){
    System.out.println("name: "+this.name);
    System.out.println("id: "+this.id);
    System.out.println("designation: "+this.designation);
   }

    public static void main(String[] args) {
        EmployeeManagement book=new EmployeeManagement("sonam",123,"software developer");
        EmployeeManagement book1=new EmployeeManagement("sharma",234,"frontend developer");
        book.displayCompanyNmae("Amazon");
        book.displayTotalEmployees();
        book.displayDetails();

        book1.displayCompanyNmae("Google");
        book1.displayTotalEmployees();
        book1.displayDetails();

        book1.displayTotalEmployees();
    }
}