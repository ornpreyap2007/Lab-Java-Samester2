package lab10_cfb;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class CatchingFlashingBall extends JPanel {
	int x ;
	int y ;
	int ballsize = 30;
	Timer time=new Timer(1000,new TimerListener());
	CatchingFlashingBall(){
		this.setBackground(Color.BLACK);
		time.start();
		this.addMouseListener(new Catcher());
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.ORANGE);
		g.fillOval(x, y, ballsize, ballsize);
	}
	
	public class TimerListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			Random random=new Random();
			x=random.nextInt(getWidth() - ballsize);
			y=random.nextInt(getHeight() - ballsize);
			repaint();
		}
		
	}
	double calculateDistance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}
	public class Catcher implements MouseListener{
		

		@Override
		public void mouseClicked(MouseEvent e) {
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			int mouseX=e.getX();
			int mouseY =e.getY();
			
			int ballCenterX = x + ballsize/2;
			int ballCenterY = y + ballsize/2;
			
			double distance = calculateDistance(mouseX, mouseY, ballCenterX, ballCenterY);
			int radius=ballsize/2;
			if (distance<radius) {
				time.stop();
			}
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
