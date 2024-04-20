/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_lab_kalkulator.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author misia
 */
public class OperacjaProstegoKalkulatoraListener implements ActionListener{
    private JTextField secondValue;
    private JLabel wynik;
    private JTextField firstValue;

    public JTextField getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(JTextField firstValue) {
        this.firstValue = firstValue;
    }

    public JTextField getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(JTextField secondValue) {
        this.secondValue = secondValue;
    }

    public JLabel getWynik() {
        return wynik;
    }

    public void setWynik(JLabel wynik) {
        this.wynik = wynik;
    }
    
    public OperacjaProstegoKalkulatoraListener(JTextField firstValue, JTextField secondValue, JLabel wynik) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.wynik = wynik;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Akcja została wykonana: " + getFirstValue().getText() + e.getActionCommand() + getSecondValue().getText());
    }
}
