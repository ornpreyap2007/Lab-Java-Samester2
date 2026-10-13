import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

//Inherit appropriate superclass 
public class ControlPanel extends JPanel{
	public ControlPanel() {		
		
		//create a On/Of button and add to the power panel 
		
		this.setLayout(new FlowLayout());
		JButton onoff=new JButton("On/Of ");
		
		//create two adjust panels and add to the layout of this control Panel
		AdjustPanel adjustPanel1=new AdjustPanel("Ch");
		AdjustPanel adjustPanel2=new AdjustPanel("Vol");
		this.add(adjustPanel1);
		this.add(adjustPanel2);
		this.add(onoff);
	}
}

