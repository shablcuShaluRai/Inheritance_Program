class Shape {
	protected double l;

	Shape(double l) {
		this.l = l;
	}

}

class Square extends Shape {
	Square(double l) {
		super(l);
	}

	void area() {
		System.out.println("square of number =" + (l * l));
	}
}

class Rectangle extends Square {
	private double b;

	Rectangle(double x, double y) {
		super(x);
		b = y;

	}

	void area() {
System.out.println("area of Rectangle="+(l*b));
	}

}

public class Inherit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Square obj=new Square(5.5);
		Rectangle obj1=new Rectangle(5.5,2.5);
		obj.area();
		obj1.area();

	}

}
