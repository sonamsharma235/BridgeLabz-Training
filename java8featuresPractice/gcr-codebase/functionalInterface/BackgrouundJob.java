package FunctionalInterface;

public class BackgrouundJob {
   public static void main(String[]args) {
	   System.out.println("hii");   
	   Runnable job=()->{
		   System.out.println("backgroung job started...");
		   try {
			   Thread.sleep(1000000);
		   }catch(InterruptedException e) {
			   e.printStackTrace();
		   }
		   System.out.println("bcg job completed");
	   };
	   Thread t=new Thread(job);
	   t.start();
	   System.out.println("main thread continues...");
  }
}
