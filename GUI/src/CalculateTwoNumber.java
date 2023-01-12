import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Inet4Address;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.text.*;
import javax.swing.JCheckBox;
public class CalculateTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber1;
	private JTextField txtNumber2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculateTwoNumber frame = new CalculateTwoNumber();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CalculateTwoNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 430, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(216, 10, 1, 1);
		contentPane.add(layeredPane);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(85, 159, 1, 1);
		contentPane.add(layeredPane_1);
		
		JLabel lblNumber1 = new JLabel("Enter Number 1");
		lblNumber1.setBounds(25, 34, 107, 14);
		contentPane.add(lblNumber1);
		
		txtNumber1 = new JTextField();
		txtNumber1.setBounds(122, 31, 128, 20);
		contentPane.add(txtNumber1);
		txtNumber1.setColumns(10);
		
		JLabel lblNumber2 = new JLabel("Enter Number 2");
		lblNumber2.setBounds(25, 72, 107, 14);
		contentPane.add(lblNumber2);
		
		txtNumber2 = new JTextField();
		txtNumber2.setBounds(122, 69, 128, 20);
		contentPane.add(txtNumber2);
		txtNumber2.setColumns(10);
		
		final JLabel lblResult = new JLabel("Result");
		lblResult.setBounds(244, 255, 160, 31);
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 16));
		contentPane.add(lblResult);
		
		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setBounds(25, 108, 87, 18);
		contentPane.add(lblOperator);
		
		final JComboBox chOperator = new JComboBox();
		chOperator.setBounds(122, 104, 86, 22);
		
		chOperator.addItem("+");
		chOperator.addItem("-");
		chOperator.addItem("*");
		chOperator.addItem("/");
		contentPane.add(chOperator);
		
		JLabel lblHowtoshow = new JLabel("How to show digit");
		lblHowtoshow.setBounds(25, 137, 101, 36);
		contentPane.add(lblHowtoshow);
		
		final JRadioButton oneDigit = new JRadioButton("1 Digit");
		oneDigit.setBounds(141, 144, 109, 23);
		contentPane.add(oneDigit);
		
		final JRadioButton twoDigit = new JRadioButton("2 Digit");
		twoDigit.setBounds(141, 170, 109, 23);
		contentPane.add(twoDigit);
		
		ButtonGroup group = new ButtonGroup();
		group.add(oneDigit);
		group.add(twoDigit);
		
		JLabel lblOptiontoShow = new JLabel("Option to Show");
		lblOptiontoShow.setBounds(25, 208, 102, 14);
		contentPane.add(lblOptiontoShow);
		
		final JCheckBox chckbxOptiontoShow = new JCheckBox("Show Result at Dialogbox");
		chckbxOptiontoShow.setBounds(141, 204, 185, 23);
		contentPane.add(chckbxOptiontoShow);
		
		
		
		
		final JButton btnOk = new JButton("OK");
		btnOk.setBounds(105, 311, 89, 23);
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			    double num1,num2,sum=0;
			    String operator;
			    if(e.getSource()==btnOk) {
			    	num1= Double.parseDouble(txtNumber1.getText());
			    	num2= Double.parseDouble(txtNumber2.getText());
			    	//JCombobox
			    	operator = (String)chOperator.getSelectedItem();
			    	if(operator.equals("+"))
			    		sum = num1+num2;
			    	if(operator.equals("-"))
			    		sum = num1-num2;
			    	if(operator.equals("*"))
			    		sum = num1*num2;
			    	if(operator.equals("/"))
			    		sum = num1/num2;
			    	//JRadioButon
			    	DecimalFormat format = null;
			    	if(oneDigit.isSelected()) {
			    		format =new DecimalFormat("#,###.0");
			    		
			    	}
			    	else if (twoDigit.isSelected()) {
			    		format = new DecimalFormat("###.00");
			    	}
			    	
			    	
			    	lblResult.setText(format.format(sum));
			    	
			    	//JCheckBox
			    	if(chckbxOptiontoShow.isSelected()) {
			    		JOptionPane.showMessageDialog(null, "Rsult is : "+sum);
			    	}
			    }
			}
		});
		contentPane.add(btnOk);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(216, 311, 89, 23);
	  btnExit.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
		 System.exit(0);
			
		}
	});
		contentPane.add(btnExit);
		
		
		
		
		
	
	}
}
