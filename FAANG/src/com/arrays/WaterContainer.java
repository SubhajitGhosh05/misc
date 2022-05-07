
/*Given n non-negative integers a1, a2, ..., an , where each represents
a point at coordinate (i, ai). n vertical lines are drawn such that the
two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, 
together with the x-axis forms a container, such that the container contains 
the most water.*/

package com.arrays;

public class WaterContainer {

	public static void main(String[] args) {
		int[] numsArr = { 4, 8, 1, 2, 3, 9 };
		int area = calArea(numsArr);
		System.out.println("The area is " + area);

	}

	private static int calArea(int[] numsArr) {
		int MaxArea = 0;
		for (int p1 = 0; p1 < numsArr.length; p1++) {
			for (int p2 = p1 + 1; p2 < numsArr.length; p2++) {
				int height = Math.min(numsArr[p1], numsArr[p2]);
				int length = (p2 - p1);
				int area = length * height;
				MaxArea = Math.max(area, MaxArea);

			}
		}
		return MaxArea;
	}

}
