package LabSheet11;
import javax.swing.*;
public class ShapeDemo3 {

	public static void main(String[] args) {
		Cylinder cylinder[]= new Cylinder[5];
		for(int i = 0;i<cylinder.length;i++ ) {
			double radius = Double.parseDouble(JOptionPane.showInputDialog("Input radius of Cylinder "+(i+1)+" : "));
			double height = Double.parseDouble(JOptionPane.showInputDialog("Input height of Cylinder "+(i+1)+" : "));
			cylinder[i] = new Cylinder(radius, height);
		}
		
		JOptionPane.showMessageDialog(null, "Cylinder 1, volume="+cylinder[0].getVolume()+
				                          "\nCylinder 2, volume="+cylinder[1].getVolume()+
				                          "\nCylinder 3, volume="+cylinder[2].getVolume()+
				                          "\nCylinder 4, volume="+cylinder[3].getVolume()+
				                          "\nCylinder 5, volume="+cylinder[4].getVolume());
		

	}

}
