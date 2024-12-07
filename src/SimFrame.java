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
    final int GROUND = 500-b.diameter;
    final int BOUNCE_BUFFER = b.radius;

    public SimFrame() {
        setPreferredSize(new Dimension(500,500));
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
    }

    public void bounce(){

        if(b.y> GROUND){
            b.y = GROUND;
            if(abs(b.vy)<= b.MIN_SPEED) {
                System.out.println("stopped");
                b.vy = 0;
            }else {
                b.vy = (b.vy - b.vy / 3) * (-1);
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        b.fall();
        bounce();
        System.out.println(b.vy);
        repaint();
    }
}
