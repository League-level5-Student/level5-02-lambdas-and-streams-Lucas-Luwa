package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons implements ActionListener {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");

	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);

		// 1. Call the addActionListener methods for each button. Use lambdas
		// to define to functionality of the buttons.
		addNumbers.addActionListener((e) -> {
			int i = Integer.parseInt(JOptionPane.showInputDialog("Enter your first number!"));
			int i2 = Integer.parseInt(JOptionPane.showInputDialog("Enter your second number!"));
			JOptionPane.showMessageDialog(null, "The sum of " + i + " and " + i2 + " is " + (i + i2) + ".");
		});
		randNumber.addActionListener((e) -> {
			Random r = new Random();
			int i = r.nextInt(101);
			JOptionPane.showMessageDialog(null, i);
		});
		tellAJoke.addActionListener((e) -> {
			JOptionPane.showMessageDialog(null, "Why did the chicken cross the road?");
			JOptionPane.showMessageDialog(null, "To get to the other side! ;)");
		});

		window.setVisible(true);
		window.pack();
	}

	public static void main(String[] args) {
		new LambdaButtons();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
