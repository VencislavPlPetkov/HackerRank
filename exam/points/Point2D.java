package points;

import java.lang.Math;

public class Point2D {

	public int x;
	public int y;

	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double dist2D(Point2D p) {

		double distance = 0;

		int xSecond = p.x;
		int ySecond = p.y;

		int xFirst = x;
		int yFirst = y;

		distance = Math.sqrt((xSecond - xFirst) * (xSecond - xFirst) + (ySecond - yFirst) * (ySecond - yFirst));

		return distance;
	}

	public void printDistance(double d) {

		double distance = d;

		int total = (int) Math.ceil(distance);

		System.out.println("2D distance = " + total);

	}

}
