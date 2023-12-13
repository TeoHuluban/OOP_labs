package lab10_11;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
class MainClass {
public static void main(String srgs[]) {
 JFrame frame = new JFrame ("Simple Frame");
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setSize(300, 120);

 JPanel panel1 = new JPanel();
 JPanel panel2 = new JPanel();
 JPanel panel3 = new JPanel();
 JPanel panel4 = new JPanel();

 JLabel l1 = new JLabel ("username ");
 JTextField tf1 = new JTextField("                 ");
 panel1.add(l1);
 panel1.add(tf1);
 panel1.setLayout(new FlowLayout());
 
 JLabel l2 = new JLabel ("password ");
 JTextField tf2 = new JTextField("                 ");
 panel2.add(l2);
 panel2.add(tf2);
 panel2.setLayout(new FlowLayout());

 JButton b1 = new JButton("log in");
 panel3.add(b1);
 
 JLabel succesL = new JLabel("Not logged in");
 b1.addActionListener(new ActionListener()
		 {
	 @Override
	 public void actionPerformed(ActionEvent e) {
		 succesL.setText("Successfully logged in");
	 }
		 });
 
 panel4.add(succesL);

 JPanel p = new JPanel();
 p.add(panel1);
 p.add(panel2);
 p.add(panel3);
 p.add(panel4);
 p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));

 frame.setContentPane(p);
 frame.setVisible(true);
 }
}
