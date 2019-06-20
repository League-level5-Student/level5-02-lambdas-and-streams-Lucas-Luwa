package Practice_LVL5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorBit implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField textfield = new JTextField(6);
	JTextField textfield2 = new JTextField(6);
	JButton and = new JButton();
	JButton or = new JButton();
	JButton left = new JButton();
	JButton right = new JButton();
	JButton power = new JButton();

	public static void main(String[] args) {
		CalculatorBit calc = new CalculatorBit();
		calc.start();
	}

	public void start() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(textfield);
		panel.add(textfield2);
		panel.add(and);
		panel.add(or);
		panel.add(left);
		panel.add(right);
		panel.add(power);
		and.setText("&");
		or.setText("|");
		left.setText("<<");
		right.setText(">>");
		power.setText("^");
		and.addActionListener((e) -> {
			int first = Integer.parseInt(textfield.getText());
			int second = Integer.parseInt(textfield2.getText());
			String primary = printByteBinary((byte) first);
			String secondary = printByteBinary((byte) second);
			String holder = "";
			for (int i = 0; i < primary.length(); i++) {
				if (primary.substring(i, i + 1).equals(secondary.substring(i, i + 1))
						&& primary.substring(i, i + 1).equals("1")) {
					holder += "1";
				} else {
					holder += "0";
				}
			}
			JOptionPane.showMessageDialog(null, convertToNumbers(holder));
		});
		or.addActionListener((e) -> {

		});
		right.addActionListener((e) -> {

		});
		left.addActionListener((e) -> {

		});
		power.addActionListener((e) -> {

		});
		frame.setSize(200, 165);
	}

	public static String printByteBinary(byte b) {
		int holder = b;
		String l = "";
		for (int i = 6; i >= 0; i--) {
			if ((holder - Math.pow(2, i)) >= 0) {
				holder = (int) (holder - Math.pow(2, i));
				l += "1";
			} else {
				l += "0";
			}
		}
		if (b < 0) {
			JOptionPane.showMessageDialog(null, "The input value is invalid. Please check your inputs.");
		}
		return l;
	}

	public int convertToNumbers(String x) {
		int holder = 0;
		for (int i = 0; i < 6; i++) {
			if (x.substring(6 - i, 6 - i + 1).equals("1")) {
				holder += Math.pow(2, i);
			} else {
				holder += 0;
			}
		}
		return holder;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
