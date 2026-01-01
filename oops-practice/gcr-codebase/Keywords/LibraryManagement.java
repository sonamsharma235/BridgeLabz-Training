public class LibraryManagement{
   private static String libraryName;
   private String title;
   private String author;
   private final String isbn;

   LibraryManagement(String title,String author,String isbn){
      this.title=title;
      this.author=author;
      this.isbn=isbn;
   }
   static void displayLibraryName(String libraryName){
      System.out.println("Library Name: "+libraryName);
   }
   public void displayDetails(){
    System.out.println("title: "+this.title);
    System.out.println("author: "+this.author);
    System.out.println("isbn: "+this.isbn);
   }

    public static void main(String[] args) {
        LibraryManagement book=new LibraryManagement("Rest","William","978-0134685991");
        book.displayLibraryName("sharma house");
        book.displayDetails();
    }
}