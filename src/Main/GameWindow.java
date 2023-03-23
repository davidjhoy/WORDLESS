package Main;

import javax.swing.*;

public class GameWindow {
    private JFrame frame;

    public GameWindow(){
        frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
