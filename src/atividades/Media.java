package atividades;
import java.util.Scanner;
public class Media {
    // Ler 5 notas, calcular a média e imprimir a maior nota entre eles.
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numero;
        int count = 0;
        int maior = 0;
        int soma = 0;
        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma += numero;

            if(numero > maior) maior = numero;

            count++;
        }while(count < 5);
        System.out.println("Maior " + maior);
        System.out.println("Media: " + soma/count);

    }
}
