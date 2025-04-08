package com.upskill.leetcode;

//https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {

	public static void main(String[] args) {

		int[][] bankAccounts = { { 1, 2, 3 }, { 4, 5, 6 } };

		int maxWealth = findMaxWealth(bankAccounts);
		System.out.println("Max wealth: " + maxWealth);
	}

	static int findMaxWealth(int[][] bankAccounts) {
		int maxWealth = 0;
		for (int person = 0; person < bankAccounts.length; person++) {
			int wealth = 0;
			for (int account = 0; account < bankAccounts[person].length; account++) {
				wealth += bankAccounts[person][account];
			}

			if (wealth > maxWealth) {
				maxWealth = wealth;
			}

		}

		return maxWealth;

	}

}
