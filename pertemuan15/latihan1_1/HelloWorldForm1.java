package latihan1_1;

import javax.swing.*;

public class HelloWorldForm1 extends JFrame {
    private JLabel label;

    public HelloWorldForm1(){
        label = new JLabel();
        label.setText("Helloworld");

        add(label);
        setTitle("My First Program");

        setVisible(true);
        setSize(300, 200);
    }
}