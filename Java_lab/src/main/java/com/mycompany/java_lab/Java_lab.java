/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java_lab;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author misia
 */
public class Java_lab {

    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        String input = skaner.nextLine();
        AnalizatorTekstu analiza = new AnalizatorTekstu();
        analiza.wyswietlanieInformacji("Witaj swiecie");
        analiza.wyswietlanieInformacji(input);
        konwerterMil(skaner);
    }
    
    public static void konwerterMil(Scanner skaner) {  
        System.out.println("podaj ilosc km ");
        try {
            double kil = skaner.nextInt();
            if (kil < 0 ){
                throw new UjemnyWyjatekException();
            }
            double mile = kil *0.621371;
            System.out.println(kil + " kilometrów to " + mile + " mil.");
        } 
        catch (UjemnyWyjatekException ujemnyWyjatekException){
            System.out.println("Zły argument - wymagana liczba nieujemna");

            konwerterMil(skaner);
        }
        catch (InputMismatchException e)
        {
            System.out.println("Zły argument - wymagana liczba");
            skaner.nextLine();
            konwerterMil(skaner);
        }
    }
}