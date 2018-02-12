package com.techlabs.basic;

import java.util.Arrays;

public class TestArray {
	public static void main(String[] args) {
		int[] numbers = new int[] { 10, 20, 30 };
		int sum = 0;
		for (int position = 0 ; position < numbers.length  ; position++) {
			sum = sum + numbers[position];
		}
		System.out.println(sum);

	}
}
