package HashMap;

import java.util.*;
public class TargetSum {
   public static void main(String []args) {
	   Scanner sc=new Scanner(System.in);
	   int len=sc.nextInt();
	   int arr[]=new int[len];
	   
	   for(int i=0;i<len;i++) {
		   arr[i]=sc.nextInt();
	   }
	   
	   int target=sc.nextInt();
	   
	  System.out.println(checkTarget(target,arr));
	   
   }
   public static boolean checkTarget(int target,int []arr) {
        HashSet<Integer>set=new HashSet<>();
	   
	   for(int i=0;i<arr.length;i++) {
		   int n=target-arr[i];
		   if(set.contains(n)) {
			   return true;
		   }else {
			   set.add(arr[i]);
		   }
	   }
	   return false;
   }
}
