package lab9_scb;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;


import javax.swing.*;

public class ScribblePanel extends JPanel implements MouseMotionListener,MouseListener{
	int x=0;
	int y=0;
	int r=20;
	
	public ScribblePanel() {
		addMouseMotionListener(this);
		addMouseListener(this);
		setFocusable(true);
		
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		Graphics g = getGraphics();
		super.paintComponent(g);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		  x = e.getX();
		  y = e.getY();
		
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

	@Override
	public void mouseDragged(MouseEvent e) {
		Graphics g=getGraphics();
		if (e.getModifiersEx()== InputEvent.BUTTON1_DOWN_MASK) {
			g.setColor(Color.BLACK);
			g.drawLine(x, y, e.getX(), e.getY());
		}else { g.setColor(getBackground());
		g.fillOval(e.getX()-r, e.getY()-r, r*2, r*2);
		}
		x=e.getX();
		y=e.getY(); //update x,y to use next
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
