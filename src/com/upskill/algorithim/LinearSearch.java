package com.upskill.algorithim;

public class LinearSearch {
	
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		int target = 5;
		int resultForTargetNumber = linearSearchUsingNumbers(numbers, target);
		System.out.println(resultForTargetNumber);
		// ---------------------------
		
//		String word = "Paris";
//		char targetWord = 'a';
//		int resultForTargetWord = linearSearchUsingString(word, targetWord);
//		System.out.println(resultForTargetWord);
		// ---------------------------
		
//		int resultForTargetWordWithRange = linearSearchUsingNumbersInRange(numbers, target,4,7);
//		System.out.println(resultForTargetWordWithRange);
		// ---------------------------
		
//		int minimum = findMinNumber(numbers);
//		System.out.println("Minimum: "+minimum);

//		int[][] input = { { 1, 2, 3, 4 }, { 5, 6, 7, 8, 9 }, { 10, 11, 12, 13, 14 } };
//		int target = 6;
//		int[] output = findElementIn2DArray(input, target);
//		System.out.println("Found index from 2D array : " + Arrays.toString(output));
		//------------------------------
		
//		int output = findMaxIn2DArray(input);
//		System.out.println("Max found element from 2D array : " + output);
	}
	


	public static int linearSearchUsingNumbers(int[] numbers, int target) {
		if (numbers.length == 0) {
			return -1;
		}
		for (int index = 0; index < numbers.length; index++) {
			int element = numbers[index];
			if (element == target) {
				return index;
			}
		}
		return -1;
	}

	public static int linearSearchUsingString(String word, char target) {
		if (word.length() == 0) {
			return -1;
		}
		for (int index = 0; index < word.length(); index++) {
			if (word.charAt(index) == target) {
				return index;
			}
		}
		return -1;
	}

	public static int linearSearchUsingNumbersInRange(int[] numbers, int target, int start, int end) {
		if (numbers.length == 0) {
			return -1;
		}
		for (int index = start; index <= end; index++) {
			int element = numbers[index];
			if (element == target) {
				return index;
			}
		}
		return -1;
	}

	public static int findMinNumber(int[] numbers) {
		int result = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < result) {
				result = numbers[i];
			}
		}
		return result;

	}

	public static int[] findElementIn2DArray(int[][] arr, int target) {
		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[row].length; column++) {
				if (arr[row][column] == target) {
					return new int[] { row, column };
				}

			}
		}
		return new int[] { -1, -1 };

	}

	public static int findMaxIn2DArray(int[][] arr) {
		int max = Integer.MIN_VALUE;
		for (int row = 0; row < arr.length; row++) {
			for (int column = 0; column < arr[row].length; column++) {
				if (arr[row][column] > max) {
					max = arr[row][column];
				}

			}
		}
		return max;

	}


}
