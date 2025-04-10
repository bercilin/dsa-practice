package com.upskill.leetcode;

public class FloorOfANumber {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 8, 10, 14, 18, 23 };
		int target = 17;

		int result = findFloorOfANumber(arr, target);
		System.out.println("result: " + result);

	}

	private static int findFloorOfANumber(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == arr[mid]) {
				return mid;
			}

			if (target > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return arr[start];
	}

}
