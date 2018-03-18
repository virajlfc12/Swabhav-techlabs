package com.techlabs.basic;

public class Circle {
	private float radi;
	private String color;

	public void setColor(String shade) {
		if (shade.equalsIgnoreCase("Red") || shade.equalsIgnoreCase("Green") || shade.equalsIgnoreCase("Blue")) {
			color = shade;
		} else {
			color = "Red";
		}
	}
	public String getColor(){
		return color;
	}
	
	public void setRadi(float rad){
		radi =  rad;
	}
	public float getRadi(){
		return radi;
	}
	public float calculateArea(){
		return (float) (3.14*radi*radi);
	}

}


