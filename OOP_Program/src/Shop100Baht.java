import javax.swing.*;
public class Shop100Baht {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product1 arnupap = new Product1();
	//	arnupap.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input numbers of product:")));
	//	JOptionPane.showMessageDialog(null, arnupap);


	    
	
		int button = JOptionPane.showConfirmDialog(null, "Is the program run on Pattanakarn branch ?","Run Program", JOptionPane.YES_NO_OPTION);
		if(button == 0) {
			arnupap = new  PattanakarnBranch();

		}	
		arnupap.setUnit(Integer.parseInt(JOptionPane.showInputDialog("Input numbers of product:")));
		JOptionPane.showMessageDialog(null, arnupap);

	}

	}


