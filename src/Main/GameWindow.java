package Main;

import javax.swing.*;
import java.awt.*;

public class GameWindow {
    private JFrame frame;

    public GameWindow(GamePanel gamePanel){
        frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.getContentPane().setBackground(new Color(219, 247, 255));
        frame.setTitle("WORDLESS by David Hoy");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(gamePanel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
