package cz.spse.C2a.rais;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		JFrame jf = new JFrame("What you want");
		JButton b1 = new JButton("Trojuhelnik");
		JButton b2 = new JButton("Ctverec");
		JButton b3 = new JButton("Obdelnik");
		JLabel label = new JLabel("co chces vypocitat?");
		b1.setBounds(5, 35, 120, 30);
		b2.setBounds(5, 70, 120, 30);
		b3.setBounds(5, 105, 120, 30);
		label.setBounds(5, 5, 100, 30);
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			jf.setVisible(false);
				JFrame jtroj = new JFrame("Trojuhlenik");
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
			

		jf.add(b1);
		jf.add(b2);
		jf.add(b3);
		jf.add(label);
		jf.setSize(300, 300);
		jf.setVisible(true);
	}

}
