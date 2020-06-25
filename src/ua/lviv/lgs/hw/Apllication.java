package ua.lviv.lgs.hw;

public class Apllication {

	public static void main(String[] args) {

		Rectangle rectangle1 = new Rectangle();
		Rectangle rectangle2 = new Rectangle(18, 12);

		System.out.println("Площа прямокутника = " + rectangle1.getSquare() + "  " + "Периметр прямокутника = "
				+ rectangle1.getPerimeter());
		System.out.println();
		System.out.println("Площа прямокутника = " + rectangle2.getSquare() + "  " + "Периметр прямокутника = "
				+ rectangle2.getPerimeter());

	}

}
