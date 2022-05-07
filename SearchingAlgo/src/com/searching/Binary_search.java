package com.searching;

import java.util.Scanner;

public class Binary_search {
	public static void main(String[] args) {
		int[] arr = { 4, 8, 24, 34, 44, 51, 63, 78, 90, 100 };
		System.out.println("Enter the number you want to search");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int r = binarySearch(arr, input);
		if (r == -1) {
			System.out.println(input + " is not in the array");
		} else {
			System.out.println("The searched number is at " + r + "th position in the array");
		}
	}

	private static int binarySearch(int[] arr, int input) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (input < arr[mid])
				end = mid - 1;
			else if (input > arr[mid])
				start = mid + 1;
			else
				return mid;
		}

		return -1;
	}
}
