package atividades.arrays;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] vetor = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;
        do{
            System.out.println("Letra: ");
            String letra = scan.next();


            if (
                    letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")
            ){
            }else{
                vetor[count] = letra;
                quantidadeConsoantes++;
            }



            count++;
        }while (count < vetor.length);
        System.out.println("\n Quantidade de Consoantes: "+ quantidadeConsoantes);
        for(String consoante : vetor){
            if(consoante != null)
            System.out.print(consoante + " ");
        }
    }
}

