package com.techlabs.basic;

import java.util.Arrays;

public class TestFunctions {
	public static void main(String[] args) {
		displayHeader();
		int result = CalculateCubeOf(3);
		System.out.println(result);

		boolean evenresult = checkIsEven(31);
		System.out.println(evenresult);

		displayEvenNos(30);
   		int[] oddresult = getOddNos(30);
   		System.out.println(Arrays.toString(oddresult));

	}

	static void displayHeader() {
		System.out.println("=========SWABHAV TECHLABS=========");
	}

	static int CalculateCubeOf(int number) {
		return number * number * number;
	}

	static boolean checkIsEven(int number) {
		if (number % 2 == 0) {
			return true;
		}
		return false;
	}

	static void displayEvenNos(int number) {
		for (int i = 0; i <= number; i++) {
			if (checkIsEven(i)) {
				System.out.print(i + " ");
			}
		}
	}

	static int[] getOddNos(int number) {
		int size = 0;
		for (int i = 0; i <= number; i++) {
			if (checkIsEven(i) == false) {
				size++;
			}
		}
		System.out.println(size);
		int[] nos = new int[size];

		int nosindex = 0;
		for (int i = 0; i <= number; i++) {
			if (checkIsEven(i) == false) {
				nos[nosindex] = i;
				nosindex++;
			}
		}
		
		return nos;
	}

}
