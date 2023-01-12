import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TempConvertion extends JFrame {
	// Components
	private JLabel lblCelsius;
	private JLabel lblFahrenheit;

	private JTextField tfCelcius;
	private JTextField tfFarenheit;

	private static final int WIDTH = 500;
	private static final int HEIGHT = 100;
	private static final double FTOC = 5.0 / 9.0;
	private static final double CTOF = 9.0 / 5.0;
	private static final int OFFSET = 32;

	public TempConvertion() {

		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 4));
		lblCelsius = new JLabel("Temp in Celsius:", SwingConstants.RIGHT);
		lblFahrenheit = new JLabel("Temp in Fahrenheit:", SwingConstants.RIGHT);
		tfCelcius = new JTextField(10);
		tfFarenheit = new JTextField(10);

		c.add(lblCelsius);
		c.add(tfCelcius);
		c.add(lblFahrenheit);
		c.add(tfFarenheit);

		CelsHandler celsiusHandler = new CelsHandler();
		tfCelcius.addActionListener(celsiusHandler);

		FahHandler fahHandler = new FahHandler();
		tfFarenheit.addActionListener(fahHandler);

		setTitle("Temperature Conversion");
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	private class CelsHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double celsius, fahrenheit;
			celsius = Double.parseDouble(tfCelcius.getText());
			fahrenheit = celsius * CTOF + OFFSET;
			tfFarenheit.setText(String.format("%.2f", fahrenheit));

		}

	}

	private class FahHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double celsius, fahrenheit;
			fahrenheit = Double.parseDouble(tfFarenheit.getText());
			celsius = (fahrenheit - OFFSET) * FTOC;
			tfCelcius.setText(String.format("%.2f", celsius));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TempConvertion tempCon = new TempConvertion();

	}
}
