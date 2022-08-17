package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main
{
    

    public static double CelsiusFormula(double Fahrenheit)
    {
        return 5.0/9.0 * (Fahrenheit - 32.0);
    }


    public static void main(String[] args)
    {

        double C = CelsiusFormula(58);
        System.out.println(C);

        GUI gui = new GUI();
    }
}
