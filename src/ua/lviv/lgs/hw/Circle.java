package ua.lviv.lgs.hw;

public class Circle {

	private double diameter;
	private double radius;

	Circle() {
		this.radius = 15;
		this.diameter = radius * 2;
	}

	public void getCircleDiameter() {
		System.out.println("����� ���� = " + (Math.PI * diameter * diameter) / 4);
	}

	public void getCircleLenght() {
		System.out.println("������� ���� = " + 2 * Math.PI * radius);
	}

}
