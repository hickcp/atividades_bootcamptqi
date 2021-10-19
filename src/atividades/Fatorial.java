package atividades;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int fat = scan.nextInt();
        int mult = 1;
        for(int i = fat; i >= 1 ; i-- ){
            mult *= i;
        }
        System.out.println(fat+"! = "+mult);

    }
}
