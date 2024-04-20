/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_lab_kalkulator;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;
import javax.swing.JTextField;

/**
 *
 * @author misia
 */
public class ProstyKalkulator {
    public void inicjalizuj(){
        JFrame frame = new JFrame("Kalkulator");
        JButton plusButton = new JButton("+");
        JButton minusButton = new JButton("-");
        JButton multiplyButton = new JButton ("*");
        JTextField firstValue = new JTextField(10);
        JTextField secondValue = new JTextField(10);
        JLabel wynik = new JLabel("...");
        
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800, 100);
        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("Operand 1: "));
        frame.add(firstValue);
        frame.add(new JLabel("Operand 2: "));
        frame.add(secondValue);
        frame.add(plusButton);
        frame.add(minusButton);
        frame.add(multiplyButton);
        frame.add(new JLabel("Wynik: "));
        frame.add(wynik);
        
        frame.setVisible(true);
    }
}
