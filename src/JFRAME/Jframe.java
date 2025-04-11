package JFRAME;

import javax.swing.*;

public class Jframe {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("New frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setSize(420,420);
        frame.setVisible(true);

    }
}
