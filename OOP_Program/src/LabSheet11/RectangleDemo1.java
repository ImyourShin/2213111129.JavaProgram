package LabSheet11;
import javax.swing.JOptionPane;
public class RectangleDemo1 {

	public static void main(String[] args) {
		double  width = Double.parseDouble(JOptionPane.showInputDialog("Input length"));
		double length = Double.parseDouble(JOptionPane.showInputDialog("Input length"));
		String color = JOptionPane.showInputDialog("Input color");
		Rectangle rectangle = new Rectangle(width, length, color);
		JOptionPane.showMessageDialog(null, rectangle+"\nArea of Rectanle is " + rectangle.getArea());

	}

}
