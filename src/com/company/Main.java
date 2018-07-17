package com.company;
//import java.text.DecimalFormat;
//import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

    Skaicavimai sulinioTurisObj = new Skaicavimai();
    Double ats = sulinioTurisObj.sulinioTuris();

    SaveObject.save(ats, "atsakymas.txt");
    Double dokumentoNuskaitymas = (Double) SaveObject.restore("atsakymas.txt");

//  //Apvalinam.
//  //DecimalFormat df = new DecimalFormat("####0.00");
    System.out.printf("Vandens yra: %4.2f kubiniai metrai.", dokumentoNuskaitymas);
  }
}
