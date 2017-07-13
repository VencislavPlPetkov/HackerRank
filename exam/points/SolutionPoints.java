package points;

public class SolutionPoints {

	public static void main(String[] args) {

		int xFirst = 1;
		int yFirst = 2;
		int zFirst = 3;

		int xSecond = 4;
		int ySecond = 5;
		int zSecond = 6;

		Point3D p1 = new Point3D(xFirst, yFirst, zFirst);
		Point3D p2 = new Point3D(xSecond, ySecond, zSecond);

		double d2 = p1.dist2D(p2);

		// System.out.println(d2);

		double d3 = p1.dist3D(p2);

		// System.out.println(d3);

		Point2D p = new Point2D(0, 0);

		p.printDistance(d2);

		p = p1;

		p.printDistance(d3);

	}

}
