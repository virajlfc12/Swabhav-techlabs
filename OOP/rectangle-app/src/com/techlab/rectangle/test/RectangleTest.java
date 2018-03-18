package com.techlab.rectangle.test;

import com.techlab.rectangle.Rectangle;

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle r1;
		r1 = new Rectangle();
		r1.setWidth(-1000);
		r1.setHeight(20);
		double resultOne = r1.calculateArea();
		r1.setColor("bLue");
		System.out.println("Area of rectangle = " + resultOne);
		System.out.println("Height of rectangle = " + r1.getHeight());
		System.out.println("Color of Rectangle = " + r1.getColor());

		Rectangle r2;
		r2 = new Rectangle();
		r2.setWidth(21);
		r2.setHeight(3);
		double resultTwo = r2.calculateArea();
		r2.setColor("Green");
		System.out.println("Area of rectangle = " + resultTwo);
		System.out.println("Height of rectangle = " + r2.getHeight());
		System.out.println("Color of Rectangle = " + r2.getColor());

	}

}
