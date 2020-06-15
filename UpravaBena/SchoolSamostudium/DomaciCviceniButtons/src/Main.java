import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		JFrame f = new JFrame("Test Calculator");
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton bp = new JButton("+");
		JButton bm = new JButton("-");
		JButton bk = new JButton("*");
		JButton bd = new JButton("/");
		JButton br = new JButton("=");
		JButton bb = new JButton("<-");

		b1.setBounds(5, 50, 45, 45);
		b2.setBounds(55, 50, 45, 45);
		b3.setBounds(105, 50, 45, 45);
		bp.setBounds(155, 50, 45, 45);
		bm.setBounds(205, 50, 45, 45);

		b4.setBounds(5, 100, 45, 45);
		b5.setBounds(55, 100, 45, 45);
		b6.setBounds(105, 100, 45, 45);
		bk.setBounds(155, 100, 45, 45);
		bd.setBounds(205, 100, 45, 45);

		b7.setBounds(5, 150, 45, 45);
		b8.setBounds(55, 150, 45, 45);
		b9.setBounds(105, 150, 45, 45);
		bb.setBounds(155, 150, 45, 45);
		br.setBounds(205, 150, 45, 45);

		JTextField tf = new JTextField();
		tf.setBounds(5, 5, 247, 40);

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText() + "1");
			}
		});

		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText() + "2");
			}
		});

		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText() + "3");
			}
		});

		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText() + "4");
			}
		});

		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText() + "5");
			}
		});

		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText() + "6");
			}
		});

		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText() + "7");
			}
		});

		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText() + "8");
			}
		});

		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText() + "9");
			}
		});

		bp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText() + "+");
			}
		});

		bm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText() + "-");
			}
		});

		bd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText() + "/");
			}
		});

		bk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText(tf.getText() + "*");
			}
		});

		bb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char[] text = tf.getText().toCharArray();
				String string = "";
				for (int i = 0; i < text.length - 1; i++)
					string += text[i];
				tf.setText(string);
			}
		});

		br.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result = tf.getText();
				/*
				 * for(int i = 0;i<result.length()-1;i++) { if(result.charAt(i)=='+') {
				 * 
				 * } }
				 */
				double vysledek = 0;
				double vysledek2 = 0;
				double vysledek3 = 0;
				double vysledek4 = 0;
				String numbers[] = result.split("\\+");

				vysledek4 = 0;
				for (int i = 0; i < numbers.length; i++) {
					String minus[] = numbers[i].split("\\-");

					vysledek3 = 0;
					for (int j = 0; j < minus.length; j++) {
						String krat[] = minus[j].split("\\*");

						vysledek2 = 1;
						for (int k = 0; k < krat.length; k++) {
							String deleno[] = krat[k].split("\\/");
							int help = Integer.parseInt(deleno[0]);
							vysledek = help;
							for (int l = 1; l < deleno.length; l++) {
								int help2 = Integer.parseInt(deleno[l]);
								vysledek = vysledek / help2;

							}
							vysledek2 = vysledek2 * vysledek;
						}
						if (j == 0) {
							vysledek3 = vysledek2;
						} else {
							vysledek3 = vysledek3 - vysledek2;
						}
					}
					vysledek4 = vysledek4 + vysledek3;

				}

				result = Double.toString(vysledek4);
				tf.setText(result);

				// Method.Vypocitej(result);
				/*
				 * String numbers[] = result.split("-|\\*|\\/|\\+"); int res =
				 * Integer.parseInt(numbers[0]); int pes = Integer.parseInt(numbers[1]); int
				 * vys= res-pes; result = Integer.toString(vys); tf.setText(result);
				 */

				/*
				 * int res = Integer.parseInt(result); result = Integer.toString(res);
				 * tf.setText(result);
				 */

			}
		});

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(b6);
		f.add(b7);
		f.add(b8);
		f.add(b9);
		f.add(bp);
		f.add(bm);
		f.add(bk);
		f.add(bd);
		f.add(bb);
		f.add(br);
		f.add(tf);
		f.setSize(268, 237);
		f.setLayout(null);
		f.setVisible(true);

	}

}
