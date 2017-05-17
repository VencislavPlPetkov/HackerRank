package shapes;

public class Square {

	float width;

	public Square(float width) {

		this.width = width;

	}

	public int getArea() {

		int total = (int) Math.ceil(width * width);

		return total;

	}

}
