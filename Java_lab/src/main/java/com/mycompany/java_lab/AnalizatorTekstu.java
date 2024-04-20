/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_lab;

/**
 *
 * @author misia
 */
public class AnalizatorTekstu {
    public static void wyswietlanieInformacji () {
      String tekst = "Witaj świecie";
      wyswietlanieInformacji(tekst);
  } 
  public static void wyswietlanieInformacji (String tekst) {
      if (tekst != null && !tekst.isEmpty()){
              System.out.println(tekst);
      System.out.println("długość napisu: "+ tekst.length());
      System.out.println("Pierwsza litera: " + tekst.charAt(0));
      System.out.println("Ostatnia litera: " + tekst.charAt(tekst.length() - 1));  
      } else {
        System.out.println("Tekst pusty lub null");
      }
  } 
}
