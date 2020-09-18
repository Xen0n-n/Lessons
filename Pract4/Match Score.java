package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BorderExample extends JFrame
{
    int madridScore = 0;
    int milanScore = 0;
    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Madrid");
    JLabel Score = new JLabel(milanScore + ":" + madridScore);
    JLabel LastScored = new JLabel("Last Scored: N/A");
    JLabel Winner = new JLabel("Winner: DRAW");

    public BorderExample()
    {
        super("Match Score");
        setLayout(null);

        button1.setFont(new Font("Times new roman", Font.BOLD, 25));
        button1.setBounds(10,20,200,180);
        add(button1);
        button1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) { }

            @Override
            public void mousePressed(MouseEvent e) {
                milanScore += 1;
                Score.setText(milanScore +" : "+ madridScore);
                LastScored.setText("Last Scored: AC Milan");
                if(milanScore > madridScore){
                    Winner.setText("Winner: AC Milan");
                } else if(milanScore == madridScore){
                    Winner.setText("Winner: DRAW");
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });

        button2.setFont(new Font("Times new roman", Font.BOLD, 25));
        button2.setBounds(570,20,200,180);
        button2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {
                madridScore += 1;
                Score.setText(milanScore +" : "+ madridScore);
                LastScored.setText("Last Scored: Madrid");
                if(madridScore > milanScore){
                    Winner.setText("Winner: Madrid");
                } else if(milanScore == madridScore){
                    Winner.setText("Winner: DRAW");
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });
        add(button2);

        Score.setFont(new Font("Times new roman", Font.BOLD, 40));
        Score.setBounds(350,20,200,100);
        add(Score);

        LastScored.setFont(new Font("Times new roman", Font.BOLD, 20));
        LastScored.setBounds(300,85,200,100);
        add(LastScored);

        Winner.setFont(new Font("Times new roman", Font.BOLD, 20));
        Winner.setBounds(320,120,200,100);
        add(Winner);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,350);
        setResizable(false);
    }
    public static void main(String[]args)
    {
        new BorderExample().setVisible(true);
    }
}
