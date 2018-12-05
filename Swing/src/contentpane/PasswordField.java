package contentpane;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class PasswordField extends JFrame {
	public static void main(String[] a) {
		new PasswordField();
	}

	public PasswordField() {

		JButton b1 = new JButton("show password");
		JButton b2 = new JButton("reset");

		JLabel lab1 = new JLabel("    ");
		JLabel lab2 = new JLabel(" ");
		JLabel label = new JLabel("  Write password:");
		JLabel labx = new JLabel("         - - - - - - - - - - - - - - - ");
		JPasswordField pwd = new JPasswordField("",6);

		Container c = getContentPane();
		c.add(lab1);
		c.add(labx);
		c.add(label);
		c.add(pwd);
		c.add(lab2);
		c.add(b1);
		c.add(b2);
		c.add(labx);

		b1.addActionListener(e -> lab2.setText(pwd.getText())); // ??

		b2.addActionListener(e -> pwd.setText(""));
		pwd.addActionListener(e -> lab2.setText(pwd.getText()));

		setDefaultLookAndFeelDecorated(true);

		setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));

		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // this jest ramka
	}

	public class Sluchacz implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			JButton jb = (JButton) e.getSource();
		}
	}

}
