import java.awt.*;
import javax.swing.*;

//Inherit appropriate superclass 
public class Television extends JFrame {
	
	public Television(String title) {
		//Call a method TelevisionComponents
		TelevisionComponents();
		//set JFrame
		this.setTitle("My television");
		this.setSize(700,400);
		this.setVisible(true);
		this.setLayout(new BorderLayout());
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
	
	public void TelevisionComponents() {
		//create abutton_TelevisionScreen and panal_TelevisionButtonBar
		
		JButton abutton_TelevisionScree=new JButton("");
		BarPanel panal_TelevisionButtonBar=new BarPanel();
		
		//Add to this Television
		this.add(abutton_TelevisionScree,BorderLayout.CENTER);
		//this.add(panal_TelevisionButtonBar,BorderLayout.SOUTH);
		this.add(panal_TelevisionButtonBar,BorderLayout.SOUTH);
		
		
	}
}
