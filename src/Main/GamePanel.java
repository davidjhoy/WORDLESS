package Main;

import Inputs.KeyBoardInputs;
import Inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    public GamePanel(){
        addKeyListener(new KeyBoardInputs());
        addMouseListener(new MouseInputs());
        addMouseMotionListener(new MouseInputs());

    }


    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("WORDLESS", 450, 100);
        g.draw3DRect(100, 200, 500, 200, true);
        g.drawRect(500, 100, 200, 50);
    }

}
