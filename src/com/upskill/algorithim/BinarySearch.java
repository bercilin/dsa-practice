package com.upskill.algorithim;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14 };
		int[] desc = { 13, 12, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		int target = 14;
//		int ans = binarySearch(arr, target);
//		System.out.println("Binary search: " + ans);
		int orderAgnosticBinarySearch = orderAgnosticBinarySearch(desc, target);
		System.out.println("Order Agnostic Binary search: " + orderAgnosticBinarySearch);
	}

	static int binarySearch(int[] arr, int target) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {

			int mid = start + (end - start) / 2;
//			int mid = end -start / 2;

			if (arr[mid] == target) {
				return mid;
			}

			if (target < arr[mid]) {

				end = mid - 1;

			} else if (target > arr[mid]) {
				start = mid + 1;
			}

		}

		return -1;
	}

	static int orderAgnosticBinarySearch(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

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
