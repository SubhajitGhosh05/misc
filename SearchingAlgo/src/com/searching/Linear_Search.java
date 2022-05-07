package com.searching;

import java.util.Scanner;

public class Linear_Search {
	public static void main(String[] args) {
		int[] arr= {1,2,3,82,76,43,14,25};
		System.out.println("Enter the number you want to search");
		Scanner sc=new Scanner(System.in);
		int inp=sc.nextInt();
		sc.close();
		int i=linearsearch(arr,inp);
		if(i==-1) {
			System.out.println(inp+" is not in the array");
		}
		else {
		System.out.println("The searched number is at "+i+"th position in the array");
		}
	}

	private static int linearsearch(int[] arr,int inp) {
		for (int i=0;i<=arr.length-1;i++) {
			if (arr[i]==inp) {
				return i;
			}
		}
		return -1;
	}

}
