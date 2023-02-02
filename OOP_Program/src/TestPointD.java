public class TestPointD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2D p1 = new Point2D();
		System.out.println("Default x , y of point 2D = " + p1);
		p1.setXY(10, 11);
		System.out.println("x , y of point 2D = " + p1);

		System.out.println("x of Point2D is " + p1.getXY()[0]);
		System.out.println("y of Point2D is " + p1.getXY()[1]);

		Point3D p2 = new Point3D();
		System.out.println("Default x , y , z of point 3D  = " + p2);
		p2.setXYZ(10, 12, 7);

		System.out.println("x , y and z of point 3D = " + p2);

		System.out.println("x of Point3D is " + p2.getXYZ()[0]);
		System.out.println("y of Point3D is " + p2.getXYZ()[1]);
		System.out.println("z of Point3D is " + p2.getXYZ()[2]);
	}

}