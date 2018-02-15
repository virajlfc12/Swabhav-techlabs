package com.techlabs.basic;


public class TestArguements {
	public static void main(String[] arguements){
		int a = arguements.length;
		System.out.println(a);
		for (int position = 0; position < arguements.length; position++) {
			System.out.println("Hello " +arguements[position]);
		 
			
			}
		int[] marks = {10,20,30};
		for ( int mark : marks) {
			System.out.println(mark);
		}
		
		for (String name : arguements) {
			System.out.println("Goodbye " +name);
		}
		
	}

}
