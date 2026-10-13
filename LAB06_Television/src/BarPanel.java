import java.awt.*;
import javax.swing.*;

//Inherit appropriate superclass 
public class BarPanel extends JPanel {
	public BarPanel() {
		//Create controlpanel and textfield_ChVolDisplay
		ControlPanel controlPanel=new ControlPanel();
		JTextField textfield_ChVolDisplay = new JTextField("Ch 35 Vol 45");
		
		//Add to this BarPanel panel
		this.setLayout(new BorderLayout());
		this.add(textfield_ChVolDisplay,BorderLayout.WEST);
		this.add(controlPanel,BorderLayout.EAST);

	}
}
