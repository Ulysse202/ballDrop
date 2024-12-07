import javax.swing.*;
import java.awt.*;


public class DropSim {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        SimFrame sf = new SimFrame();
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("SIM");
        f.setLocationRelativeTo(null);
        f.add(sf);
        f.setVisible(true);

    }
}