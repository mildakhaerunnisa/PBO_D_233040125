package latihan1_3;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class HelloWorldForm3 extends JFrame implements ActionListener {
    private JLabel label;
    private JButton button;

    public HelloWorldForm3(){
        label = new JLabel();
        label.setText("Hello World");
        button = new JButton("Klik Me!");
        button.addActionListener(this);

        setLayout(new GridLayout(2, 1));
        add(label);
        add(button);
        setTitle("My First Program");
        setVisible(true);
        setSize(300, 200);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("Hallo Dunia!");

	}
}
