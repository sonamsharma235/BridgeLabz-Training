package collections;

import java.util.LinkedList;
import java.util.Arrays;

public class ReverseUsingLinkedList {
	public static void main(String[]args) {
    	LinkedList<Integer>arr= new LinkedList<>(Arrays.asList(1,2,3,4,5));
    	
    	int len=arr.size();
    	for(int i=0;i<arr.size()/2;i++) {
    		Integer a=arr.get(i);
    		arr.set(i,arr.get(len-i-1));
    		arr.set(len-i-1, a);
    	}
    	System.out.println("reversed array"+ arr);
    }
}
