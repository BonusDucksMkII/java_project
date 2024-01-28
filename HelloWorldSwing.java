import javax.swing.*;
import java.awt.*;

public class HelloWorldSwing {
    //This method only works as static; not sure why
    private void createAndShowGUI() {
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        ImageIcon iconImg = new ImageIcon("images/sun.gif", "A little sun");
        JLabel icon = new JLabel("Hello World", iconImg, JLabel.LEFT);
        frame.getContentPane().add(icon);

        JTextField textField = new JTextField(20);
        Button requestData = new Button("Get");
        requestData.addActionListener(this);

        frame.pack();
        frame.setVisible(true);
    }

    public void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
