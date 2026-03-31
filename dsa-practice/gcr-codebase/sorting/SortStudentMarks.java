package Sorting;

import java.util.*;
public class SortStudentMarks {
    public static void main(String[]args) {
    	Scanner sc=new Scanner(System.in);
    	int len=sc.nextInt();
    	int arr[]=new int[len];
    	for(int i=0;i<len;i++) {
    		arr[i]=sc.nextInt();
    	}
    	
    	//using Bubble sort
    	boolean swapped;
    	for(int i=0;i<len-1;i++) {
    		swapped=false;
    		for(int j=0;j<len-i-1;j++) {
    			if(arr[j]>arr[j+1]) {
    				int temp=arr[j];
    				arr[j]=arr[j+1];
    				arr[j+1]=temp;
    				swapped=true;
    			}
    		}
    		if(!swapped) break;
    	}
    	System.out.println(Arrays.toString(arr));
    }
}
