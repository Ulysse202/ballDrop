import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.lang.Math.abs;

public class SimFrame extends JPanel implements ActionListener {

    Ball b = new Ball(50,50,20);
    MouseListener ml = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
            b.x = e.getX()-b.radius;
            b.y = e.getY()-b.radius;
            b.vy = 0;
            b.vx = 0;
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    };
    Timer timer;
    final int GROUND = 460-b.diameter;
    final int BOUNCE_BUFFER = b.radius;
    final int GRAVITY = 3;

    public SimFrame() {
        //setPreferredSize(new Dimension(500,500));
        setBackground(Color.black);
        addMouseListener(ml);
        setVisible(true);
        timer = new Timer(20,this);
        timer.start();
    }

    public void paintComponent(Graphics g){
        super.paintComponents(g);
        draw(g);
    }

    public void draw(Graphics g){
        g.setColor(Color.BLUE);
        g.drawOval(b.x,b.y,b.diameter,b.diameter);

        g.setColor(Color.white);
        g.drawLine(0,460,500,460);
    }

    public void bounce(){
        if(b.y == GROUND){
            b.vy = (int)-(b.vy/1.75);
        }

    }

    public void fall(){
        if(b.y+b.vy >= GROUND){
            b.y = GROUND;
        }else {
            b.y += b.vy;
            b.vy += GRAVITY;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        fall();
        bounce();
        System.out.println("vy = "+b.vy);
        System.out.println("y = "+b.y);
        repaint();
    }
}
