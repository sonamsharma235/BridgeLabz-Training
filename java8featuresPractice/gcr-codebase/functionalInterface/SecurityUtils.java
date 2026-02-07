package FunctionalInterface;

public interface SecurityUtils {
   static boolean checkPass(String pass) {
	   if(pass.contains("ss")) {
		   return true;
	   }
	   return false;
  }
}  
