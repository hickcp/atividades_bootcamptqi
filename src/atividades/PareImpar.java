package atividades;
import java.util.Scanner;
public class PareImpar {
    public static void main(String[] args) {
        //Ler N números e exibir a quantidade de numeros pares e numeros impares.

        Scanner scan = new Scanner(System.in);
        int quantNumeros;
        int numero;
        int count = 0;
        int quantPar = 0, quantImpar = 0;
        System.out.println("Quantidade de numeros: ");
        quantNumeros = scan.nextInt();


        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero%2 == 0) quantPar++;
            else if (numero%2 == 1) quantImpar++;


            count++;
        } while (count < quantNumeros);

        System.out.println("Quantidade de numeros impares: " + quantImpar);
        System.out.println("Quantidade de numeros pares: " + quantPar);
    }
}
