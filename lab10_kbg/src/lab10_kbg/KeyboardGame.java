package lab10_kbg;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class KeyboardGame extends JPanel implements ActionListener,KeyListener{
	char displaychar=' ';
	char ip='?';
	int score=0;
	Timer time=new Timer(1000,this);
	
	KeyboardGame(){
		time.start();
		this.addKeyListener(this);
		this.setFocusable(true);
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.setFont(new Font("SansSerif",Font.BOLD,50));
		g.drawString("Letter: "+displaychar, 75, 75);
		g.drawString("You typed",75, 140);
		g.setColor(Color.BLUE);
		g.drawString(" "+ip,350, 140);
		g.setColor(Color.BLACK);
		g.drawString("Your Score = "+score,75, 225);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		displaychar = getRandomChar();
		repaint();
		
	}
	private char getRandomChar() {
		Random random = new Random();
		return (char)(65 + random.nextInt(26));
	
	}
	@Override
	public void keyTyped(KeyEvent e) {
		ip = Character.toUpperCase(e.getKeyChar());
		if (Character.toUpperCase(displaychar) == ip) {
			score++;
		}
			
		repaint();
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
