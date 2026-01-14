package HashMap;

import java.util.*;
import java.util.Scanner;

public class TwoSum {
	 public static void main(String []args) {
		   Scanner sc=new Scanner(System.in);
		   int len=sc.nextInt();
		   int arr[]=new int[len];
		   
		   for(int i=0;i<len;i++) {
			   arr[i]=sc.nextInt();
		   }
		   
		   int target=sc.nextInt();
		   
		   int ans[]=checkTarget(target,arr);
		   System.out.println(ans[0]+" "+ans[1]);
		   
	   }
	   public static int[] checkTarget(int target,int []arr) {
	        HashMap<Integer,Integer>map=new HashMap<>();
		   
		   for(int i=0;i<arr.length;i++) {   
		      int n=target-arr[i];
		      if(map.containsKey(n)) {
		    	  return new int[] {map.get(n),i};
		      }
//		      System.out.println(arr[i]+" "+i);
		      map.put(arr[i], i);
		   }   
		   return new int[] {-1,-1};
	   }
}
