package atividades;
import java.util.Scanner;
public class Notas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int note;

        while (true) {

            System.out.println("Digite uma nota entre 0 e 10: ");
            note = scan.nextInt();
            if(note < 0 || note > 10){
                System.out.println("Digite uma nota válida");
            }
            else{
                break;
            }

        }
    }
}
