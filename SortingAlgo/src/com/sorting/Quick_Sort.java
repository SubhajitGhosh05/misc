package com.sorting;

import java.util.Arrays;

public class Quick_Sort {
	public static void main(String[] args) {
		int[] array = { -20, 35, -15, 7, 55, 1, 21 };
		quickSort(array, 0, array.length - 1);
		/*
		 * for(int i=0;i<array.length;i++) { System.out.print(array[i]+" "); }
		 */
		System.out.println(Arrays.toString(array));
	}

	private static void quickSort(int[] array, int start, int end) {
		if (start < end) {
			int pp = partition(array, start, end);
			quickSort(array, start, pp - 1);
			quickSort(array, pp + 1, end);
		}

	}

	static int partition(int[] array, int start, int end) {

		int pivot = array[end];
		int i = start - 1;
		for (int j = start; j <= end - 1; j++) {
			if (array[j] <= pivot) {
				i++;
				// swapping array[i] & array[j]
				int ival = array[i];
				int jval = array[j];
				array[i] = jval;
				array[j] = ival;
			}
		}
		// swap array[i+1] & array[end]
//	int ival=array[i+1];
//	array[end]=ival;
//	array[i+1]=pivot;
		int temp = array[i + 1];
		array[i + 1] = array[end];
		array[end] = temp;
		return i + 1;
	}
}
