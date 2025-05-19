package com.upskill.leetcode;

public class SearchInMountain {
	
	public static void main(String[] args) {

		int[] arr = { 3, 5, 7, 9, 10, 90, 50, 40, 30, 20 };
		int target = 10;

		int peak = peakIndexInMountainArray(arr);
	}
	
	static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        return start;
    }
	
	static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {

		boolean isAsc = arr[start] < arr[end];

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target == arr[mid]) {
				return mid;
			}
			if (isAsc) {

				if (target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}

			} else {

				if (target > arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}

			}
		}
		return -1;
	}

}
