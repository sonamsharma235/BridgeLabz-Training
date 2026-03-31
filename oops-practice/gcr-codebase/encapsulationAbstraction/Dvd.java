package EncapsulationAbstraction;

class Dvd extends LibraryItem implements Reservable{
	private int duration;
	private boolean available=true; 
	
 Dvd(int itemId,String title, String author,int duration){
	 super(itemId,title,author);
	 this.duration=duration;
 }
 public int getLoanDuration() {
		return duration;
	}
 public void reserveItem() {
     if (available) {
         available = false;
         System.out.println("DVD reserved successfully");
     } else {
         System.out.println("DVD not available");
     }
 }
 public boolean checkAvailability() {
     return available;
 }
}
