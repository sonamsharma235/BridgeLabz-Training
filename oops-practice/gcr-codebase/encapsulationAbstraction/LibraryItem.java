package EncapsulationAbstraction;

abstract class LibraryItem {
	private int itemId;
	private String title;
	private String author;
	
	private String borrowerName;
	
	LibraryItem(int itemId,String title, String author){
		this.author=author;
		this.itemId=itemId;
		this.title=title;
	}
	public int getItemId() {
		return itemId;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public void issueItem(String borrowerName) {
        this.borrowerName = borrowerName;
    }
	public String getBorrowerName() {
        return borrowerName;
    }
	
	public void getItemDetails() {
		 System.out.println("Id: "+itemId+", title: "+title+", Author: "+author);
	}
	
	abstract int getLoanDuration();

}
