package com.sorting;

import java.util.Arrays;

public class Bubble_Sort {

	public static void main(String[] args) {
		int[] arr = { 1, 7, -55, -8, 21, 8, 23, 2 };

		for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(i, i + 1, arr);
				}
			}
		}

		/*
		 * for(int i=0;i<arr.length;i++) { System.out.println(arr[i]); }
		 */
		System.out.println(Arrays.toString(arr));
	}

	public static void swap(int i, int j, int arr[]) {
		if (i == j) {
			return;
		}
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
