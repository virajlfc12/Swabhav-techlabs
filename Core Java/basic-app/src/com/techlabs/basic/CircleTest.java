package com.techlabs.basic;

public class CircleTest {
	public static void main(String[] args){
	Circle cir;
	cir = new Circle();
	cir.setRadi(20);
	cir.setColor("Yellow");
	float circresult = cir.calculateArea();
	System.out.println("Radius of circle is "+cir.getRadi());
	System.out.println("Color of circle is "+cir.getColor());
	System.out.println("Area of circle is "+circresult);
	
	
	}

}
