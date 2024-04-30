package class21;

import javax.swing.*;
import java.awt.*;

public class MyDrawing {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        MyCanvas myCanvas = new MyCanvas();// object of the class
        frame.setSize(1000,1000);
        frame.add(myCanvas);
        frame.add(myCanvas);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class MyCanvas extends Canvas {
    @Override
    public void paint (Graphics g){
        g.setColor(Color.cyan);
        g.fillOval(200,200,500,500);
        g.setColor(Color.green);
        g.fillOval(344,345,33,67);

    }
}

