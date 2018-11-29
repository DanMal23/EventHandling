package grouplayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SpringLayout;

public class WidgetsLayouts extends JFrame {
	public static void main(String[] a) {
		new WidgetsLayouts();
	}

	private Methods methods;

	public WidgetsLayouts() {
		methods = new Methods();

		// setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("group layout");

		frame.setSize(new Dimension(640, 210));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

		JPanel leftPanel = new JPanel();
		leftPanel.setSize(420, 300);
		leftPanel.setBackground(Color.getHSBColor(27, 16, 48).darker());

		SpringLayout splt = new SpringLayout();
		JPanel rightPanel = new JPanel(splt);
		rightPanel.setSize(420, 400);
		rightPanel.setBackground(Color.getHSBColor(27, 16, 48).darker());

		JSplitPane sp = new JSplitPane();
		sp.setRightComponent(rightPanel);
		sp.setLeftComponent(leftPanel);
		sp.setPreferredSize(new Dimension(500, 100));

		frame.add(sp);

		JLabel devn = new JLabel("developer");
		JLabel pl = new JLabel("language");
		JLabel y = new JLabel("year");
		JLabel e = new JLabel("     ");

		JTextField tfdevn = new JTextField("", 16);
		JTextField tfpl = new JTextField("", 16);
		JTextField tfy = new JTextField("", 6);

		JList<Info> list = new JList<Info>();
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		list.setLayoutOrientation(JList.VERTICAL);

		JScrollPane listScroller = new JScrollPane(list);
		listScroller.setPreferredSize(new Dimension(270, 100));
		rightPanel.add(listScroller);

		JButton sbtn = new JGradientBrownButton("Save data");
		sbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String dname = tfdevn.getText();
				String plg = tfpl.getText();
				String year = tfy.getText();
				int yearint = Integer.parseInt(year);
				if (dname.length() > 0 && plg.length() > 0) {
					if (year != null) {
						Info info = new Info(dname, plg, yearint);
						methods.addData(info);
					}
				} else
					return;
			}
		});
		JButton rbtn = new JGradientBrownButton("Show on a list  >>");
		rbtn.setBackground(Color.getHSBColor(30, 12, 37).darker());
		rbtn.setForeground(Color.black);
		rbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				list.setListData(methods.getData());
			}
		});
		JButton delbtn = new JGradientBrownButton("Delete selected");
		delbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				List<Info> li = list.getSelectedValuesList();

				for (Info in : li) {
					methods.removeData(in);
				}
				list.setListData(methods.getData()); // list update
			}
		});
		JButton resbtn = new JGradientBrownButton("Reset");
		resbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String s = "";
				tfdevn.setText(s);
				tfpl.setText(s);
				tfy.setText(s);
			}
		});
		GroupLayout grlt = new GroupLayout(leftPanel);
		grlt.setAutoCreateGaps(true);
		grlt.setAutoCreateContainerGaps(true);
		leftPanel.setLayout(grlt);

		grlt.setVerticalGroup(grlt.createSequentialGroup()
				.addGroup(grlt.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(devn)
						.addComponent(tfdevn))
				.addGroup(grlt.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(pl).addComponent(tfpl))
				.addGroup(grlt.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(y).addComponent(tfy))
				.addGroup(grlt.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(e).addComponent(e))
				.addGroup(
						grlt.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(sbtn).addComponent(rbtn))
				.addGroup(
						grlt.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(e).addComponent(resbtn)));

		grlt.setHorizontalGroup(grlt.createSequentialGroup()
				.addGroup(grlt.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(devn).addComponent(pl)
						.addComponent(y).addComponent(e).addComponent(sbtn).addComponent(e))
				.addGroup(grlt.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(tfdevn)
						.addComponent(tfpl).addComponent(tfy).addComponent(e).addComponent(rbtn).addComponent(resbtn)));

		GroupLayout grlt2 = new GroupLayout(rightPanel);
		grlt2.setAutoCreateGaps(true);
		grlt2.setAutoCreateContainerGaps(true);
		rightPanel.setLayout(grlt2);

		grlt2.setVerticalGroup(grlt2.createSequentialGroup()
				.addGroup(grlt2.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(listScroller))
				.addGroup(grlt2.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(delbtn)));

		grlt2.setHorizontalGroup(grlt2.createSequentialGroup().addGroup(grlt2
				.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(listScroller).addComponent(delbtn)));

		pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
