package ua.lviv.lgs.hw;

public class Apllication {

	public static void main(String[] args) {

		Rectangle rectangle1 = new Rectangle();
		Rectangle rectangle2 = new Rectangle(18, 12);

		System.out.println("����� ������������ = " + rectangle1.getSquare() + "  " + "�������� ������������ = "
				+ rectangle1.getPerimeter());
		System.out.println();
		System.out.println("����� ������������ = " + rectangle2.getSquare() + "  " + "�������� ������������ = "
				+ rectangle2.getPerimeter());

	}

}
