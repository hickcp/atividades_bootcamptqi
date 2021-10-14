package atividades;
import java.util.Scanner;
public class NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        int age;
        do {
            System.out.println("Nome: ");
            name = scan.next();
            System.out.println("Idade: ");
            age = scan.nextInt();
        }
        while (age != 0);



    }

}
