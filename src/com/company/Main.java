package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime cuantas veces quieres tirar.");
        int tiradas = scanner.nextInt();
        int[] frecuencia = new int[13];

        for (int i = 0; i < tiradas; i++) {
            int dado1 = (int)(Math.random() * 6) + 1;
            int dado2 = (int)(Math.random() * 6) + 1;
            ++frecuencia[dado1 + dado2];
        }

        for (int o = 0; o < frecuencia.length; o++) {
            System.out.println("El numero " + o + " ha salido " + frecuencia[o] + " veces" );
        }


        }
    }

