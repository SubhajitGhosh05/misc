package com.arrays.leftRotation;

import java.util.*;

public class LeftRotation2 {

	static int[] arrayLeftRotation(int[] a, int n, int k) {

		// int n=a.length;
		int[] rotarray = new int[n];
		for (int oldindex = 0; oldindex < n; oldindex++) {
			int newindex = (oldindex + n - k) % n;

			/* int newindex=(oldindex+k)%n; */ // For Right shifting //

			rotarray[newindex] = a[oldindex];

		}
		return rotarray;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the lenghth of the array \n");
		int n = in.nextInt();
		System.out.println("Enter the number of Left shift will occur \n");
		int k = in.nextInt();
		System.out.println("Enter the Array\n");
		int a[] = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}

		int[] output = new int[n];
		output = arrayLeftRotation(a, n, k);
		// arrayLeftRotation(a, n, k);

		for (int i = 0; i < n; i++)
			System.out.print(output[i] + " ");
		System.out.println("\n");

	}
}