package com.arrays.leftRotation;

public class LeftRotation3 {
public static void main(String[] args) {
	int arr[] = { 1, 2, 3, 4, 5 };
	int k = 4;
	rotateLeftUsingBruteForce(arr,k);
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
}

public static void rotateLeftUsingBruteForce(int[] arr, int k) {
    k %= arr.length;

    // Rotate the array k times
    for (int i = 0; i < k; i++) {
      int j, temp;
      temp = arr[0];
      // Perform rotation for each iteration
      for (j = 0; j < arr.length - 1; j++)
        arr[j] = arr[j + 1];
      arr[j] = temp;
    }
  }
}
