package com.upskill.leetcode;

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FirstAndLastPosition {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 5, 5, 5, 5, 23 };
		int target = 5;

		int[] ans = { -1, -1 };
		ans[0] = findIndexPosition(arr, target, true);
		if (ans[0] != -1) {
			int endIndex = findIndexPosition(arr, target, false);
			ans[1] = endIndex;
		}

		System.out.println("Result: " + Arrays.toString(ans));

	}

	// First find the possible match and then check its left and right side

	private static int findIndexPosition(int arr[], int target, boolean isStartIndex) {

		int start = 0;
		int end = arr.length - 1;
		int ans = -1;
		while (start <= end) {

			int mid = start + (end - start) / 2;
			if (target < arr[mid]) {
				end = mid - 1;
			} else if (target > arr[mid]) {
				start = mid + 1;
			} else {
				ans = mid;
				if (isStartIndex) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}

		}
		return ans;
	}

	// this function just returns the index value of target
	private static int search(int[] nums, int target, boolean findStartIndex) {
		int ans = -1;
		int start = 0;
		int end = nums.length - 1;
		while (start <= end) {
			// find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
			int mid = start + (end - start) / 2;

			if (target < nums[mid]) {
				end = mid - 1;
			} else if (target > nums[mid]) {
				start = mid + 1;
			} else {
				// potential ans found
				ans = mid;
				if (findStartIndex) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			}
		}
		return ans;
	}

}
