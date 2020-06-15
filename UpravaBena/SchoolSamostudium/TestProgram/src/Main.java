import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {
		JFrame f = new JFrame("Test Play");
		JButton b1 = new JButton("Start");
		JButton b2 = new JButton("Help");
		JButton b3 = new JButton("Auto");
		JButton b4 = new JButton("Save");
		JTextField tf = new JTextField();

		b1.setBounds(5, 5, 70, 30);
		b2.setBounds(5, 40, 70, 30);
		b3.setBounds(5, 75, 70, 30);
		b4.setBounds(5, 110, 70, 30);
		tf.setBounds(5, 5, 247, 40);

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setVisible(false);
				JFrame fp = new JFrame("Play");
				JButton bsubmit = new JButton("Submit");
				JLabel label = new JLabel();
				JTextField tl = new JTextField("");
				label.setText("Enter Name :");
				label.setBounds(5, 5, 100, 30);
				tl.setBounds(80, 5, 200, 30);
				bsubmit.setBounds(120, 45, 70, 30);

				bsubmit.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (tl.getText().length() != 3) {
							String name = tl.getText();
							tl.setText("Your name is: " + name);
						} else {
							tl.setText("Your name must have 3 or more characters");
						}
					}
				});

				fp.add(bsubmit);
				fp.add(tl);
				fp.add(label);
				fp.setSize(500, 500);
				fp.setLayout(null);
				fp.setVisible(true);
			}
		});

		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setVisible(false);
				JFrame fp = new JFrame("Help");
				JButton bhelp1 = new JButton("Help 1");
				JButton bhelp2 = new JButton("Help 2");
				JButton bhelp3 = new JButton("Help 3");
				bhelp1.setBounds(120, 45, 70, 30);
				bhelp2.setBounds(120, 90, 70, 30);
				bhelp3.setBounds(120, 135, 70, 30);

				bhelp1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JButton back = new JButton("back");
						back.setBounds(200, 200, 70, 30);
						JLabel labelhelp = new JLabel();
						labelhelp.setText("You must do everithing");
						labelhelp.setBounds(5, 5, 100, 30);
						fp.add(labelhelp);
						fp.add(back);
						labelhelp.setVisible(true);
						back.setVisible(true);
						bhelp1.setVisible(false);
						bhelp2.setVisible(false);
						bhelp3.setVisible(false);

						back.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								labelhelp.setVisible(false);
								bhelp1.setVisible(true);
								bhelp2.setVisible(true);
								bhelp3.setVisible(true);
								back.setVisible(false);
							}
						});

					}
				});

				fp.add(bhelp1);
				fp.add(bhelp2);
				fp.add(bhelp3);
				fp.setSize(500, 500);
				fp.setLayout(null);
				fp.setVisible(true);

			}
		});

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		f.setSize(268, 237);
		f.setLayout(null);
		f.setVisible(true);

	}

}
