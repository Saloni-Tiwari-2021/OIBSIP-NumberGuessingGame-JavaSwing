package com.java;
import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberGuessingGame {
    private JButton guessButton;
    private JTextField mynumber;
    private JTextField message;
    private JTextField computerno;
    private JPanel myPanel;
    private JPanel comPanel;

    public NumberGuessingGame() {
        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             int myNo=   Integer.parseInt(mynumber.getText());
             int no2=(int)(Math.random()*100);
             if(myNo==no2){
                 message.setText("You Guessed the correct number");
             }
             else if(myNo+1==no2 || myNo-1==no2){
                 message.setText("You were too close");
             }
             else if(myNo>100|| myNo<0){

                 message.setText("Not in Range::Please enter the number between 1-100");
             }

             else if(myNo>no2){
                 message.setText("You entered the wrong number!! it is greater than computer number");
             }
             else if(myNo<no2){
                 message.setText("You entered the wrong number!! it is lower than computer number");
             }
             computerno.setText(Integer.toString(no2));
            }
        });
    }

    public static void main(String args[])
    {
        JFrame frame=new JFrame("Guessing Game");
        frame.setContentPane(new NumberGuessingGame().myPanel);
        frame.setSize(450,350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
