package com.arrays;

public class WaterCntnr {

	public static void main(String[] args) {
		int[] numsArr = { 4, 8, 1, 2, 3, 9 };
		int area = calArea(numsArr);
		System.out.println("The area is " + area);

	}

	private static int calArea(int[] numsArr) {
		int MaxArea = 0, p1 = 0, p2 = numsArr.length - 1;
		while (p1 < p2) {
			int height = Math.min(numsArr[p1], numsArr[p2]);
			int width = p2 - p1;
			int area = height * width;
			MaxArea = Math.max(MaxArea, area);

			if (numsArr[p1] <= numsArr[p2]) {
				p1++;
			} else {
				p2--;
			}

		}
		return MaxArea;

	}
}
