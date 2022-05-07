package com.sorting;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] myArray = selectionSort(new int[] { -20, 35, -15, 7, 55, 1, 21 });
		/*
		 * for (int i = 0; i < myArray.length; i++) { System.out.println(" " +
		 * myArray[i]); }
		 */
		System.out.println(Arrays.toString(myArray));
	}

	public static int[] selectionSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			// swap a[i] & a[min]
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		return a;
	}
}
