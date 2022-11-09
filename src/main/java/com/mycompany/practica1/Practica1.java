package com.mycompany.practica1;

import java.util.Scanner;

public class Practica1 {

    public static void main(String[] args) {
        Scanner Nivel = new Scanner(System.in);
        System.out.println("Cuantos números quieres:");
        int Tamaño = Nivel.nextInt();
        int[] Codigo = new int[Tamaño];

        for (int i = 0; i < Codigo.length; i++) {
            Codigo[i] = (int) (Math.random() * 2);

        }//Pedir números randoms de Rango

        for (int k = 0; k < Tamaño; k++) {
            System.out.print(Codigo[Tamaño - k - 1]);
        }

    }

}
