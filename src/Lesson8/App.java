package Lesson8;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class App extends JFrame {


    public App() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 120);
        setTitle("My program");

        Font font = new Font("Arial", Font.BOLD, 20);

        JTextField jTextField = new JTextField();
        jTextField.setFont(font);

        jTextField.setHorizontalAlignment(0);
        add(jTextField, BorderLayout.CENTER);

        JButton jButton = new JButton();
        jButton.setText("Сгенерировать");
        jButton.setFont(font);
        add(jButton, BorderLayout.SOUTH);
        
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setText(generateNumber());

            }
        });


        setVisible(true);
    }

    private String generateNumber() {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("+7");
        stringBuilder.append("902");
        for (int i = 0; i < 7; i++) {
            stringBuilder.append(random.nextInt(10));
        }
        return stringBuilder.toString();

    }
}
