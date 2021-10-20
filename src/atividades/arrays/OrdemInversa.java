package atividades.arrays;

public class OrdemInversa {
    public static void main(String[] args) {
        // Criar um vetor de 6 numeros e exibir os numeros na ordem inversa.
        int count = 0;
        int[] numeros = {1, 2, 7, 4, 5, 6};
        System.out.println("Numeros: ");
        while(count < (numeros.length)){
            System.out.print(numeros[count]+ " ");
            count++;
        }

        System.out.println("\nNumeros: ");
        for(int i = (numeros.length -1); i >= 0 ; i--)
        {
            System.out.print(numeros[i] + " ");
        }
    }
}
