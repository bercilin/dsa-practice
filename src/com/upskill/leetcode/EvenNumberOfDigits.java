package com.upskill.leetcode;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description
public class EvenNumberOfDigits {

	public static void main(String[] args) {
		int[] nums = { 12, 345, 2, 6, 7896, 10 };
		System.out.println("Even digits count : " + findNoOfEvenDigitsInArray(nums));
		System.out.println("digits count : " + findDigit(1223));
	}

	public static int findNoOfEvenDigitsInArray(int[] arr) {
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (isEven(arr[index])) {
				count++;
			}
		}

		return count;
	}

	public static boolean isEven(int element) {
		int digit = findDigit(element);
//		int digit = findDigitsByLog10(element);
		return digit % 2 == 0;
	}

	public static int findDigit(int element) {
		int count = 0;
		if (element < 0) {
			element = element * -1;
		}

		if (element == 0) {
			return 1;
		}
		while (element > 0) {
			element = element / 10;
			count++;
		}
		return count;

	}

	// For more efficiency its alt for findDigit
	public static int findDigitsByLog10(int num) {
		if (num < 0) {
			num = num * -1;
		}
		return (int) (Math.log10(num)) + 1;
	}

}
