package Sorting;

import java.util.*;
public class SortEmployeeId {
    public static void main(String[]args ) {
    	Scanner sc=new Scanner(System.in);
    	int len=sc.nextInt();
    	int arr[]=new int[len];
    	
    	for(int i=0;i<len;i++) {
    		arr[i]=sc.nextInt();
    	}
    	insertionSort(arr);
    	for (int id : arr) {
            System.out.print(id + " ");
        }
    }
    
    public static void insertionSort(int empIds[]) {
    	for (int i = 1; i < empIds.length; i++) {
            int key = empIds[i];
            int j = i - 1;

            // Shift elements that are greater than key
            while (j >= 0 && empIds[j] > key) {
                empIds[j + 1] = empIds[j];
                j--;
            }
            empIds[j + 1] = key;
        }
    }
}
