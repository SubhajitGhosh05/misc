package com.arrays;

import java.util.HashMap;

public class TwoSumArr {
	public static void main(String[] args) {
		int[] numsArr = { 1, 3, 7, 100, 2,87,9 };
		int result[] = findindices(numsArr, 11);
		System.out.println(result[0] + " " + result[1]);
	}

	/*public static int[] findindices(int[] nums, int targetsum) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			hm.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int comp = targetsum - nums[i];
			if (hm.containsKey(comp))
				return new int[] { i, hm.get(comp) };
		}
		return new int[] { -1, -1 };
	}*/
	
	public static int[] findindices(int[] nums, int targetsum) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			hm.put(nums[i], i);
			int comp = targetsum - nums[i];
			if (hm.containsKey(comp))
			return new int[] { hm.get(comp),i };
		}

		return new int[] { -1, -1 };
	}
}
