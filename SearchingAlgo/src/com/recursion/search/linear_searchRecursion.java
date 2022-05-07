package com.recursion.search;

import java.util.Scanner;

public class linear_searchRecursion {
public static void main(String[] args) {
	int [] arr= {23,21,8,1,98,5,2,59};
	System.out.println("Enter the number you want to search ");
	Scanner sc=new Scanner(System.in);
	int input =sc.nextInt();
	sc.close();
	int i=0;
	int r=recursiveLinearSrch(arr,input,i);
	if (r==-1) {
		System.out.println(input+" is not in the array");
			}
			else {
		System.out.println("The searched number is at "+r+" th position in the array");		
			}
}

private static int recursiveLinearSrch(int[] arr, int input, int i) {

	if (i>arr.length-1)
		return -1;
	else if (input==arr[i]) {
		return i;
	}
	
	else {
		//i++;
		//recursiveLinearSrch(arr,input,i+1);
		return recursiveLinearSrch(arr,input,i+1);
	}

	
}
}
