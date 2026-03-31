package LinearBinarySearch;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class CountOccurence {
   public static void main(String[]args) {
	   String target="this";
	   int count=0;
	   try {
		   FileReader fr=new FileReader("demo.txt");
		   BufferedReader br=new BufferedReader(fr);
		   
		   String line;
		   while((line=br.readLine())!=null){
			  String arr[]=line.split(" ");
			  for(String s:arr) {
				  if(s.equals(target)) {
					  count++;
				  }
			  }
		   }
		   
	   }catch(IOException e) {
		   System.out.println("error");
	   }
	   
   }
}
