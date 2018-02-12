package com.techlabs.basic;

public class TestMaxArray {
	public static void main(String[] args) {
		int[] marks = { -90, -70, -80, -60 };
		int max = marks[0];
		for (int position = 0; position <= marks.length-1 ; position++) {
			if (max < marks[position]) {
				max = marks[position];

			}

		}
		System.out.println(max);
	}

}
