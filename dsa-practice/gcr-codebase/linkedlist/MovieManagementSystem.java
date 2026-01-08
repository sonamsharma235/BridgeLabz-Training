package LinkedList;

class MovieNode{
    String title;
    String director;
    String releaseDate;
    int rating;
    MovieNode next=null;
    MovieNode prev=null;

    public MovieNode(String title, String director, String releaseDate,int rating){
        this.title=title;
        this.director=director;
        this.releaseDate=releaseDate;
        this.rating=rating;
    }
}
class MovieRecord{
	MovieNode head;
	MovieNode tail;

    void addAtBeginning(String title, String director, String releaseDate,int rating){
    	MovieNode nn=new MovieNode(title,director,releaseDate,rating);
       if(head==null){
          head=tail=nn;
       }else{
          nn.next=head;
          head.prev=nn;
          head=nn;
       }
       System.out.println("added at begining");
    }

    //add at end
    void addAtEnd(String title, String director, String releaseDate,int rating){
    	MovieNode nn=new MovieNode(title,director,releaseDate,rating);
         if(tail==null){
            head=tail=nn;
         }else{
            tail.next=nn;
            nn.prev=tail;
            tail=nn;
         }
         System.out.println("added at ending");
    }

    //add at position
    void addAtPosition(int pos,String title, String director, String releaseDate,int rating){
    	if (pos == 1) {
            addAtBeginning(title, director,releaseDate , rating);
            return;
        }
    	MovieNode nn=new MovieNode(title,director,releaseDate,rating);
    	MovieNode temp=head;
         pos-=1;
         while(pos-->1){
            temp=temp.next;
         }
         MovieNode n=temp.next;
         nn.prev=temp;
         temp.next=nn;
         nn.next=n;
         System.out.println("added at pos");
    } 
    
 // Remove movie by title
    void removeByTitle(String title) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                System.out.println("Movie removed: " + title);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found!");
    }
    
 // Search by director
    void searchByDirector(String director) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No movies found for director: " + director);
    }
    
 // Search by rating
    void searchByRating(double rating) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating >= rating) {
                displayMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No movies found with rating >= " + rating);
    }
   
 // Update rating
    void updateRating(String title, int newRating) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated for " + title);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found!");
    }
    
 // Display forward
    void displayForward() {
        MovieNode temp = head;
        System.out.println("\nMovies (Forward Order):");
        while (temp != null) {
            displayMovie(temp);
            temp = temp.next;
        }
    }

    // Display reverse
    void displayReverse() {
        MovieNode temp = tail;
        System.out.println("\nMovies (Reverse Order):");
        while (temp != null) {
            displayMovie(temp);
            temp = temp.prev;
        }
    }
    void displayMovie(MovieNode m) {
        System.out.println(m.title + " | " + m.director + " | " +
                m.releaseDate + " | Rating: " + m.rating);
    }
}
public class MovieManagementSystem{
    public static void main(String[]args){
    	 MovieRecord list = new MovieRecord();

         list.addAtBeginning("Inception", "Nolan", "2010", 8);
         list.addAtEnd("Interstellar", "Nolan", "2014", 8);
         list.addAtEnd("Titanic", "Cameron", "1997", 7);

         list.displayForward();
         list.displayReverse();

         list.searchByDirector("Nolan");
         list.updateRating("Titanic", 8.0);
         list.removeByTitle("Inception");

         list.displayForward();
    }
}