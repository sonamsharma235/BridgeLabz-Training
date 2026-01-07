package StoryScenerio;

public class User {
  private String name;
  private int userId;
  
  User( int userId,String name){
	  this.name=name;
	  this.userId=userId;
  }
  public String getName() {
	  return name;
  }
  public int  getUserId() {
	  return userId;
  }
  
  
}
