package com.arrays;

public class TwoSumArray {
	public static void main(String[] args) {
		int[] numsArr = { 1, 3, 7, 100, 2, 87, 9 };
		int[] index = retrnIndex(numsArr, 11);
		if (index[0] == -1 || index[1] == -1) {
			System.out.println("Number not found");
		} else {
			System.out.println(index[0] + " " + index[1]);
		}
	}

	private static int[] retrnIndex(int[] numsArr, int num) {
		for (int p1 = 0; p1 < numsArr.length; p1++) {
			int numberTofind = num - numsArr[p1];
			for (int p2 = p1 + 1; p2 < numsArr.length; p2++) {
				if (numberTofind == numsArr[p2])
					return new int[] { p1, p2 };
			}
		}

		return new int[] { -1, -1 };
	}
}
