package my;

import javax.swing.*;
import java.awt.*;

public class SwingDemo {

    private static void createGUI() {
        MyFrame1 frame = new MyFrame1("Starter");
        Image frameIcon = Toolkit.getDefaultToolkit().getImage("src/main/resources/images/frameIcon.png");
        frame.setIconImage(frameIcon);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createGUI();
            }
        });
    }
}
