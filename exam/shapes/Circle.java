package shapes;

public class Circle {

	float radius;

	public Circle(float radius) {
		this.radius = radius;
	}

	public int getArea() {

		int total = (int) Math.ceil(3.14159265 * radius * radius);

		return total;

	}

}
