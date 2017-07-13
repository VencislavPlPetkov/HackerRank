package shapes;

public class Rectangle {

	float width;
	float height;

	public Rectangle(float width, float height) {

		this.width = width;
		this.height = height;

	}

	public int getArea() {

		int total = (int) Math.ceil(width * height);

		return total;

	}

}
