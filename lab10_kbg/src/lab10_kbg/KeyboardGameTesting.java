package lab10_kbg;


import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JFrame;
public class KeyboardGameTesting {
	public static void main(String[] args) {
		JFrame frame = new JFrame(); 
		frame.setTitle("My Keyboard Game");//create an object of this frame
		KeyboardGame kb=new KeyboardGame(); //create an object of BMICaculator
		frame.add(kb); //add the object into CENTER of JFrame
		frame.setSize(500, 300); //set a frame's resolution
		frame.setLocationRelativeTo(null); //set a location at center the frame
		frame.setVisible(true); //set visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}