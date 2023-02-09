package LabSheet11;
import java.util.*;
public class RectangleDemo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input width  :");
		double width = scanner.nextDouble();
		System.out.print("Input length :");
		double length = scanner.nextDouble();
		Rectangle2 rectangle = new Rectangle2(width, length);
		System.out.println(rectangle);
		System.out.println("Area of Rectangle is "+rectangle.getArea());

	}

}
