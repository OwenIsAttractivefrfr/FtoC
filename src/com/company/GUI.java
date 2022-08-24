package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI
{

    JFrame jframe;
    JFormattedTextField celsius;
    JTextField fahrenheit;
    JButton jbutton;
    JLabel celsiusLabel;
    JLabel fahrenheitLabel;
    String colorString = "red";


    public GUI()
    {
        jframe = new JFrame("Fahrenheit to Celsius");
        jbutton = new JButton("Convert");
        jframe.setLayout(new GridLayout(2, 2));
        jframe.setSize(1280,720);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        celsius = new JFormattedTextField(new java.text.DecimalFormat("##0.0#"));
        celsius.setValue(new Double(0.0));
        fahrenheit = new JTextField(5);


        jbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double result = Main.CelsiusFormula(Double.parseDouble(celsius.getText()));

                if(result <= 0)
                {
                    colorString = "blue";
                }
                else if(result <= 26)
                {
                    colorString = "green";
                }
                else
                {
                    colorString = "red";
                }

                String resultText = "" + result;
                celsiusLabel.setText("<html><font color = " + colorString + ">" + result + "&#176</font> Celsius");


            }
        });

        celsiusLabel = new JLabel("0.0 Celsius");
        fahrenheitLabel = new JLabel("Fahrenheit");


        jframe.add(celsius);
        jframe.add(fahrenheitLabel);
        jframe.add(jbutton);
        jframe.add(celsiusLabel);

        jframe.setVisible(true);
    }
}
