package points;

public class Point3D extends Point2D {

	int z;

	public Point3D(int x, int y) {
		super(x, y);
	}

	public Point3D(int x, int y, int z) {
		super(x, y);

		this.z = z;
	}

	public double dist3D(Point3D p) {

		double distance = 0;

		int xSecond = p.x;
		int ySecond = p.y;
		int zSecond = p.z;

		int xFirst = x;
		int yFirst = y;
		int zFirst = z;

		distance = Math.sqrt((xSecond - xFirst) * (xSecond - xFirst) + (ySecond - yFirst) * (ySecond - yFirst)
				+ (zSecond - zFirst) * (zSecond - zFirst));

		return distance;
	}

	public void printDistance(double d) {

		double distance = d;

		int total = (int) Math.ceil(distance);

		System.out.println("3D distance = " + total);

	}

}
