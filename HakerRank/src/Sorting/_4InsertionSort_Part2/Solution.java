package Sorting._4InsertionSort_Part2;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void insertionSortPart2(int[] ar)
	{       
		// Fill up the code for the required logic here
		// Manipulate the array as required
		// The code for Input/Output is already provided
		
		int temp;
		
		for(int i = 1; i < ar.length; i++) {
			for(int j = i; j > 0; j--) {
				if(ar[j - 1] > ar[j]) {
					temp = ar[j];
					ar[j] = ar[j - 1];
					ar[j - 1] = temp;
				}
			}
			
			printArray(ar);
		}

	} //end function

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int s = in.nextInt();
		int[] ar = new int[s];
		
		for(int i=0;i<s;i++){
			ar[i]=in.nextInt(); 
		}
		
		insertionSortPart2(ar);    

	} //end main

	private static void printArray(int[] ar) {
		for(int n: ar){
			System.out.print(n+" ");
		}
		
		System.out.println("");
	} //end function
} //end class

