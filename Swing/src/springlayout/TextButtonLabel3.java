package springlayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

@SuppressWarnings("serial")
public class TextButtonLabel3 extends JFrame {
	public static void main(String[] a) {
		new TextButtonLabel3();
	}

	public TextButtonLabel3() {
		// setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("SpringLayout");

		frame.setSize(new Dimension(360, 190));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		SpringLayout layout = new SpringLayout();
		JPanel contentPane = new JPanel(layout);
		contentPane.setBackground(Color.getHSBColor(248,222,17).darker());

		JTextField tf1 = new JTextField("          ", 8);
		tf1.setSelectedTextColor(Color.blue);
		layout.putConstraint(SpringLayout.NORTH, tf1, 42, SpringLayout.NORTH, contentPane);
		layout.putConstraint(SpringLayout.WEST, tf1, 15, SpringLayout.WEST, contentPane);
		JTextField tf2 = new JTextField("          ", 8);
		layout.putConstraint(SpringLayout.NORTH, tf2, 77, SpringLayout.NORTH, contentPane);
		layout.putConstraint(SpringLayout.WEST, tf2, 15, SpringLayout.WEST, contentPane);
		JTextField tf3 = new JTextField("          ", 8);
		layout.putConstraint(SpringLayout.NORTH, tf3, 112, SpringLayout.NORTH, contentPane);
		layout.putConstraint(SpringLayout.WEST, tf3, 15, SpringLayout.WEST, contentPane);

		JButton b1 = new JGradientButton3(" >>> ", Color.GRAY, Color.getHSBColor(157, 128, 69));
		layout.putConstraint(SpringLayout.NORTH, b1, 40, SpringLayout.NORTH, contentPane);
		layout.putConstraint(SpringLayout.WEST, b1, 115, SpringLayout.WEST, contentPane);
		JButton b2 = new JGradientButton3(" >>> ", Color.GRAY, Color.getHSBColor(21, 42, 161));
		layout.putConstraint(SpringLayout.NORTH, b2, 75, SpringLayout.NORTH, contentPane);
		layout.putConstraint(SpringLayout.WEST, b2, 115, SpringLayout.WEST, contentPane);
		JButton b3 = new JGradientButton3(" >>> ", Color.GRAY, Color.WHITE);
		layout.putConstraint(SpringLayout.NORTH, b3, 110, SpringLayout.NORTH, contentPane);
		layout.putConstraint(SpringLayout.WEST, b3, 115, SpringLayout.WEST, contentPane);

		JLabel lab = new JLabel("Fill in the text fields and press the buttons:");
		lab.setForeground(Color.darkGray);
		lab.setFont(new Font("Calibri", Font.BOLD, 16));
		layout.putConstraint(SpringLayout.NORTH, lab, 8, SpringLayout.NORTH, contentPane);
		layout.putConstraint(SpringLayout.WEST, lab, 8, SpringLayout.WEST, contentPane);
		JLabel lab1 = new JLabel(" ");
		lab1.setForeground(Color.black);
		lab1.setFont(new Font("Courier New", Font.BOLD, 15));
		layout.putConstraint(SpringLayout.NORTH, lab1, 44, SpringLayout.NORTH, contentPane);
		layout.putConstraint(SpringLayout.WEST, lab1, 190, SpringLayout.WEST, contentPane);
		JLabel lab2 = new JLabel(" ");
		lab2.setForeground(Color.black);
		lab2.setFont(new Font("Courier New", Font.BOLD, 15));
		layout.putConstraint(SpringLayout.NORTH, lab2, 78, SpringLayout.NORTH, contentPane);
		layout.putConstraint(SpringLayout.WEST, lab2, 190, SpringLayout.WEST, contentPane);
		JLabel lab3 = new JLabel(" ");
		lab3.setForeground(Color.black);
		lab3.setFont(new Font("Courier New", Font.BOLD, 15));
		layout.putConstraint(SpringLayout.NORTH, lab3, 113, SpringLayout.NORTH, contentPane);
		layout.putConstraint(SpringLayout.WEST, lab3, 190, SpringLayout.WEST, contentPane);

		contentPane.add(lab);
		contentPane.add(tf1);
		contentPane.add(tf2);
		contentPane.add(tf3);
		contentPane.add(b1);
		contentPane.add(b2);
		contentPane.add(b3);
		contentPane.add(lab1);
		contentPane.add(lab2);
		contentPane.add(lab3);

		b1.addActionListener(e -> lab1.setText(tf1.getText()));
		b2.addActionListener(e -> lab2.setText(tf2.getText()));
		b3.addActionListener(e -> lab3.setText(tf3.getText()));

		frame.add(contentPane);
		frame.setVisible(true);
	}

}
