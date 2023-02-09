package LabSheet11;
import java.util.*;
public class ShapeDemo2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Cylinder cylinder[]= new Cylinder[5];
		for(int i =0 ;i<cylinder.length;i++) {
			System.out.println("Input radius and height of Cylinder "+(i+1)  );
			System.out.print("Input radius : ");
			double radius = scanner.nextDouble();
			System.out.print("Input height : ");
			double height = scanner.nextDouble();
			System.out.println();
			cylinder[i]=new Cylinder(radius,height);
		}
		int i =1;
		for(Cylinder _cylinder : cylinder) {
			System.out.println("Cylinder "+i+", volume="+_cylinder.getVolume());
			i++;
		}

	}

}
