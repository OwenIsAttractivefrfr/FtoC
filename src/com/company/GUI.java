package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI
{

    JFrame jframe;
    JTextField celsius;
    JTextField fahrenheit;
    JButton jbutton;
    JLabel celsiusLabel;
    JLabel fahrenheitLabel;


    public GUI()
    {
        jframe = new JFrame("Fahrenheit to Celsius");
        jbutton = new JButton("Convert");
        jframe.setLayout(new GridLayout(2, 2));
        jframe.setSize(1280,720);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        celsius = new JTextField(5);
        fahrenheit = new JTextField(5);


        jbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double result = Main.CelsiusFormula(Double.parseDouble(celsius.getText()));

                String resultText = "" + result;
                celsiusLabel.setText(resultText + " Celsius");
            }
        });

        celsiusLabel = new JLabel("");
        fahrenheitLabel = new JLabel("Fahrenheit");


        jframe.add(celsius);
        jframe.add(fahrenheitLabel);
        jframe.add(jbutton);
        jframe.add(celsiusLabel);

        jframe.setVisible(true);
    }
}
