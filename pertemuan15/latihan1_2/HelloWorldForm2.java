package latihan1_2;

import javax.swing.*;

public class HelloWorldForm2 extends JFrame {
    private JLabel label;

    public HelloWorldForm2(){
        label = new JLabel();
        label.setText("Hallo Dunia !");

        add(label);
        setTitle("Program Pertama");

        setSize(600, 300);
    }
}