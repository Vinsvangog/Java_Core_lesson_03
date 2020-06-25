package ua.lviv.lgs.hw;

public class Rectangle {

	private int length;
	private int width;

	Rectangle() {
		this.length = 15;
		this.width = 10;
	}

	Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	public int getSquare() {
		return length * width;
	}

	public int getPerimeter() {
		return (length + width) * 2;
	}

}
