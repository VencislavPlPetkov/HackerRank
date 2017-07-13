package shapes;

public class SolutionShapes {

	public static void main(String[] args) {

		float radius = 5;

		Circle c1 = new Circle(radius);

		System.out.println(c1.getArea());

		float width = 3.0f;
		float height = 4.0f;

		Rectangle r1 = new Rectangle(width, height);

		System.out.println(r1.getArea());

		radius = 2;

		Circle c2 = new Circle(radius);

		System.out.println(c2.getArea());

		width = 3.3f;

		Square s1 = new Square(width);

		System.out.println(s1.getArea());

		width = 5.0f;
		height = 7.5f;

		Rectangle r2 = new Rectangle(width, height);

		System.out.println(r2.getArea());

	}

}
