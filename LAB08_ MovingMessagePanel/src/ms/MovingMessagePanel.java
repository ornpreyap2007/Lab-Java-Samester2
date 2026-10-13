package ms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MovingMessagePanel extends JPanel implements ActionListener,ItemListener,MouseMotionListener{
    JFrame frame = new JFrame("My Moving Message Panel");

    JPanel messageP = new JPanel();
    JTextField text = new JTextField(20);
    JLabel massageLB =new JLabel("Message to be displayed");

    JPanel ColorP = new JPanel();
    JLabel bgcolor =new JLabel("Background Color");
    JRadioButton w =new JRadioButton("white");
    JRadioButton b =new JRadioButton("black");
    

    JPanel directionP = new JPanel();
    JButton l =new JButton("Left");
    JButton r =new JButton("Right");
    JButton u =new JButton("Up");
    JButton d =new JButton("Down");

    JPanel RadioB = new JPanel();
    JRadioButton mouseuse =new JRadioButton("Use mouse");

    Color texColor= Color.BLACK;
    String message=" ";
    int x = 100;
    int y = 100;



    MovingMessagePanel(){
        messageP.add(text);
        messageP.add(massageLB);   

        ColorP.setLayout(new GridLayout(3,1));
        //ButtonGroup group = new ButtonGroup();
        //group.add(w);
        //group.add(b);

        ColorP.add(bgcolor);
        ColorP.add(w);
        ColorP.add(b);

        directionP.add(l);
        directionP.add(r);
        directionP.add(u);
        directionP.add(d);

        RadioB.setLayout(new BorderLayout());
        RadioB.add(mouseuse);

        text.addActionListener(this);
        w.addItemListener(this);
        b.addItemListener(this);
        l.addActionListener(this);
        r.addActionListener(this);
        u.addActionListener(this);
        d.addActionListener(this);
        mouseuse.addActionListener(this);
        this.addMouseMotionListener(this);


        //set JFrame ทำไมต้องอยุ่ใน constructor
        frame.setLayout(new BorderLayout());
        frame.add(this,BorderLayout.CENTER);
        frame.add(messageP,BorderLayout.NORTH);
        frame.add(ColorP,BorderLayout.WEST);
        frame.add(directionP,BorderLayout.SOUTH);
        frame.add(RadioB,BorderLayout.EAST);
        frame.setSize(800,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    protected void paintComponent(Graphics g){
        super.paintComponent(g);//ทำไมต้องมีตรงนี้
        g.setFont(new Font("SamsSerif",Font.BOLD,100));
        g.setColor(texColor);
        g.drawString(message, x, y);//massage จะไปดึงค่าตรงไหน
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==l){
            x-=5;
        }
        else if (e.getSource()==r){
            x+=5;
        }
        else if (e.getSource()==u){
            y-=5;
        }
        else if (e.getSource()==d){
            y+=5;
        }
        //มีไว้ทำไม
        else if (e.getSource()==text){
            message=e.getActionCommand();
        }
        repaint();
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource()==w){
            b.setSelected(false);//จำเป็นต้องมีไหมถ้ามี groupbutton แล้ว
            this.setBackground(Color.white);
            texColor=Color.BLACK;
        }
        else if (e.getSource()==b){
            w.setSelected(false);
            this.setBackground(Color.black);
            texColor=Color.YELLOW;
        }
        repaint();

        }
    @Override
    public void mouseDragged(MouseEvent e) {
        // e คืออะไร
        if (mouseuse.isSelected()){
            x = e.getX();
            y = e.getY();
        }
        repaint();
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseMoved'");
    }


    }


    

 
