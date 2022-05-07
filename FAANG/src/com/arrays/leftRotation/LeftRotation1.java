package com.arrays.leftRotation;

public class LeftRotation1 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int k = 4;

// Reverse all numbers
		reverse(arr, 0, arr.length - 1);

// Reverse first arr.length-k numbers
		reverse(arr, 0, arr.length - k - 1);

// Reverse last k numbers
		reverse(arr, arr.length - k, arr.length - 1);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void reverse(int[] nums, int start, int end) {
		while (start < end) {
			// swap nums[start] & nums[end]
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

}
