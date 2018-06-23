package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    //Šulinio vandens kubatūros skaičiuoklė.
    Scanner klavetura = new Scanner(System.in);

    //Šulinio deametras metrais.
    double deametras;
    System.out.println("Įveskite šulinio deametra metrais: ");
    deametras = klavetura.nextDouble();

    //Vandens gylis metrais.
    double gylis;
    System.out.println("Įveskite šulinio vandens gylį metrais: ");
    gylis = klavetura.nextDouble();

    //Spindulys.
    double r;
    r = deametras / 2;

    //Apskritimo plotas.
    double plotas;
    plotas = Math.PI * r * r;

    //Atsakymas.
    double atsakymas;
    atsakymas = plotas * gylis;

    //Apvalinam.
    DecimalFormat df = new DecimalFormat("####0.00");
    System.out.println("Vandens yra: " + df.format(atsakymas) +" kubiniai metrai");
  }
}
