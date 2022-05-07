/*
Given n non-negative integers representing an elevation map where the width
 of each bar is 1, compute how much water it can trap after raining.
 
 https://leetcode.com/problems/trapping-rain-water/
*/

package com.arrays;

public class TrappingRainwater {

	public static void main(String[] args) {
		int[] elevationArray = { 0, 1, 0, 2, 1, 0, 3, 1, 0, 1, 2 };
		int totalWater = getTrappedRainwater(elevationArray);
		System.out.println(totalWater);
	}

	private static int getTrappedRainwater(int[] elevationArray) {
		int totalWater = 0;
		for (int p = 0; p < elevationArray.length; p++) {
			int leftP = p, rightP = p, maxLeft = 0, maxRight = 0;

			while (leftP >= 0) {
				maxLeft = Math.max(maxLeft, elevationArray[leftP]);
				leftP--;
			}

			while (rightP < elevationArray.length) {
				maxRight = Math.max(maxRight, elevationArray[rightP]);
				rightP++;
			}

			int currentWater = Math.min(maxLeft, maxRight) - elevationArray[p];

			if (currentWater >= 0) {
				totalWater += currentWater;
			}

		}

		return totalWater;
	}

}
