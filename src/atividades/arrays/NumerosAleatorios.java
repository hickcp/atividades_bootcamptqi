package atividades.arrays;
import java.util.Random;
 /* Fazer um programa que leia 20 numeros inteiros aleatórios (entre 0 e 11) e armazene-os em um vetor.
Ao final, mostre os números e seus sucessores */

public class NumerosAleatorios {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        Random random = new Random();

        for(int i = 0; i < numeros.length; i++){
            int numero = random.nextInt(100);
            numeros[i] = numero;
        }
        System.out.print("Numeros aletorios: ");
        for ( int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.print("\n Sucessores Numeros aletorios: ");
        for ( int numero : numeros) {
            System.out.print((numero+1) + " ");
        }
    }
}
