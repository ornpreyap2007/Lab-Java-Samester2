package lab9_bmi;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class BMICalculator extends JPanel{
	JPanel p1=new JPanel(new FlowLayout(FlowLayout.LEFT));
	JLabel en=new JLabel("Enter Your infomation");
	
	JPanel p2=new JPanel(new GridLayout(2,2));
	JLabel h=new JLabel("Your height (cm):");
	JLabel w=new JLabel("Your weight (kg):");
	JTextField htf=new JTextField(" ",40);
	JTextField wtf=new JTextField(" ",40);
	
	JPanel p3=new JPanel(new GridLayout(2,1));
	JButton cp=new JButton("Compute BMI");
	JLabel showbmi=new JLabel("BMI =");
	
	double bmi;
	
	
	BMICalculator(){
		setLayout(new GridLayout(3,1));
		
		p1.add(en);
		add(p1);
		
		p2.add(h);
		p2.add(htf);
		p2.add(w);
		p2.add(wtf);
		add(p2);
		
		cp.addActionListener(new ActionInterpretor());
		p3.add(cp);
		p3.add(showbmi);
		add(p3);
	}


	public class ActionInterpretor implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			double h = Double.parseDouble(htf.getText());
			double w = Double.parseDouble(wtf.getText());
			bmi = findBMI(h, w);
			showbmi.setText("BMI = "+((int)(bmi*100)/100.00));
			
		}
		public double findBMI(double h,double w) {
			return w/((h*0.01)*(h*0.01));

		}
		
	}
}
