package com.techlab.rectangle;

public class Rectangle {
	private int width;
	private int height;
	private String color;

	public void setColor(String shade) {
		if (shade.equalsIgnoreCase("Red") || shade.equalsIgnoreCase("Blue") || shade.equalsIgnoreCase("Green")) {
			color = shade;
		}else {
		color = "Red";
		}
	};

	private double convertToValidRange(double side) {
		if (side >= 100) {
			side = 100;
		} else if (side <= 1) {
			side = 1;
		}
		return side;

	}

	public int getWidth() {
		return width;
	};

	public void setWidth(double w) {
		width = (int) convertToValidRange(w);
	};

	public String getColor(){
		return color;
	}
	public int getHeight() {
		return height;
	}

	public void setHeight(double h) {
		height = (int) convertToValidRange(h);

	};

	public int calculateArea() {
		return width * height;
	}
}
