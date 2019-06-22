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
			String holder = "";
			int first = Integer.parseInt(textfield.getText());
			int second = Integer.parseInt(textfield2.getText());
			String primary = printLongBinary((long) first);
			String secondary = printLongBinary((long) second);
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
			int first = Integer.parseInt(textfield.getText());
			int second = Integer.parseInt(textfield2.getText());
			String primary = printLongBinary((long) first);
			String secondary = printLongBinary((long) second);
			String holder1 = "";
			for (int i = 0; i < primary.length(); i++) {
				if (primary.substring(i, i + 1).equals("1") || secondary.substring(i, i + 1).contentEquals("1")) {
					holder1 += "1";
				} else {
					holder1 += "0";
				}
			}
			JOptionPane.showMessageDialog(null, convertToNumbers(holder1));
		});
		right.addActionListener((e) -> {
			int first = Integer.parseInt(textfield.getText());
			int second = Integer.parseInt(textfield2.getText());
			String primary = printLongBinary((long) first);
			String holder1 = "";
			for (int i = 0; i < second; i++) {
				holder1 += "0";
			}
			holder1 = primary.substring(0, primary.length() - second);
			JOptionPane.showMessageDialog(null, convertToNumbers(holder1));
		});
		left.addActionListener((e) -> {
			int first = Integer.parseInt(textfield.getText());
			int second = Integer.parseInt(textfield2.getText());
			String primary = printLongBinary((long) first);
			String holder1 = "";
			holder1 = primary.substring(second, primary.length());
			for (int i = 0; i < second; i++) {
				holder1 += "0";
			}
			JOptionPane.showMessageDialog(null, convertToNumbers(holder1));
		});
		power.addActionListener((e) -> {
			int first = Integer.parseInt(textfield.getText());
			int second = Integer.parseInt(textfield2.getText());
			String primary = printLongBinary((long) first);
			String secondary = printLongBinary((long) second);
			String holder1 = "";
			for (int i = 0; i < primary.length(); i++) {
				if (!primary.substring(i, i + 1).equals(secondary.substring(i, i + 1))) {
					holder1 += "1";
				} else {
					holder1 += "0";
				}
			}
			JOptionPane.showMessageDialog(null, convertToNumbers(holder1));
		});
		frame.setSize(200, 165);
	}

	public static String printLongBinary(long l) {
		long holder = l;
		String f = "";
		for (int x = 30; x >= 0; x--) {
			if ((holder - Math.pow(2, x)) >= 0) {
				holder = (int) (holder - Math.pow(2, x));
				f += "1";
			} else {
				f += "0";
			}
		}
		if (l < 0) {
			JOptionPane.showMessageDialog(null, "The imput value is invalid.");
		}
		return f;
	}

	public int convertToNumbers(String x) {
		int holder = 0;
		for (int i = 0; i < x.length(); i++) {
			if (x.substring(x.length() - i - 1, x.length() - i).equals("1")) {
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