package com.company;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class Main extends JFrame {

    private JButton tryButton = new JButton("Try!");
    private JTextField answerArea = new JTextField(10);
    private JPanel text = new JPanel();
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    private int random_number1 = 0 + (int) (Math.random() * 20);
    private int tries = 3;
    private int exitCode = 0;

    public Main(){
        super ("Угадайка");

        setSize(270, 100);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        answerArea.setFont(fnt);
        answerArea.setBounds(10,10, 150,40);
        tryButton.setBounds(170, 10, 70, 40);

        add(tryButton);
        add(answerArea);

        tryButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                answerCheck();
                if (exitCode == 1){
                    System.exit(0);
                }
            }
        });
    }

    public void answerCheck(){
        int intAnswer = Integer.parseInt (answerArea.getText());
        if(intAnswer != random_number1) {
            tries --;
            if(tries == 0){
                JOptionPane.showMessageDialog(null, "Вы не угадали! Попыток: " + tries + numbersMatch());
                exitCode = 1;
            }
            else {
                JOptionPane.showMessageDialog(null, "Неправильно! Число попыток: " + tries + numbersMatch());
                answerArea.setText("");
            }
        }
        else if(intAnswer == random_number1) {
            JOptionPane.showMessageDialog(null, "Вы победили!");
            exitCode = 1;
        }
    }

    public String numbersMatch(){
        int intAnswer = Integer.parseInt (answerArea.getText());
        if (intAnswer < random_number1){
            return "\nВаше число меньше загаданного";
        }else{
            return "\nВаше число больше загаданного";
        }
    }

    public static void main(String[] args) {
	Main window = new Main();
    }
}
