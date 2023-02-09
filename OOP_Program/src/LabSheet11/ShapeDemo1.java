package LabSheet11;
import java.util.*;

public class ShapeDemo1 {
	
     
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input radius : " );
		double radius = scanner.nextDouble();
		System.out.print("Input height : ");
		double height = scanner.nextDouble();
		
		Circle circle = new Circle(radius, null);
		System.out.println("Circle["+circle.toString());
		System.out.println("Circle[area="+circle.getArea()+"]");
		
		System.out.println();
		Cylinder cylinder = new Cylinder(radius, height);
		System.out.println("Cylinder"+cylinder.toString());
		System.out.println("Cylinder[area="+cylinder.getArea()+"]");
		System.out.println("Cylinder[volume="+cylinder.getVolume()+"]");
		

	}

}
