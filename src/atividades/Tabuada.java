package atividades;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        // Desenvolver uma tabuáda.
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int numero;

        System.out.println("Digite um numero: ");
        numero = scan.nextInt();

        do {
            System.out.println(numero + " X " + count +" = " + (numero * count) );
            count++;

        }while(count <= 10);
    }
}
