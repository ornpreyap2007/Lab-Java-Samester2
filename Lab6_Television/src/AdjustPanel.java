import java.awt.*;
import javax.swing.*;

//Inherit appropriate superclass 
public class AdjustPanel extends JPanel{
	String centerText;

	public AdjustPanel(String centerText) {
		//create three buttons: Less, center text, and more 
		JButton Less=new JButton("<<");
		JButton centertext=new JButton("input text");
		JButton more=new JButton(">>");
		this.setLayout(new FlowLayout());
		//Add to this AdjustPanel panel
		this.add(Less);
		this.add(centertext);
		this.add(more);

	}
}
