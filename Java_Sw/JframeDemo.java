package Java_Sw;

import javax.swing.*;
import java.awt.*;

public class JframeDemo {
    private JFrame frame;
    JButton button;
    public JframeDemo() {
        creatAndShow();
    }
    public void creatAndShow() {
        button = new JButton("OK");
        frame = new JFrame("Tittle");
        frame.setSize(400,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(button);
        frame.setLayout(new FlowLayout());
       // frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new JframeDemo();
    }
}
