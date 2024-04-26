package TRABAJOS.EJERCICIOEVALUADOPATRONES;
import java.util.Scanner;

public class PatronesAnidados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//PATRON 01

        System.out.print(" Escribe un número del 1 al 5");
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println("*");
        } else if (n == 2) {
            System.out.println("**");
        } else if (n == 3) {
            System.out.println("***");
            System.out.println("* *");
            System.out.println("***");
        } else if (n == 4) {
            System.out.println("****");
            System.out.println("*  *");
            System.out.println("*  *");
            System.out.println("****");
        } else if (n == 5) {
            System.out.println("*****");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*****");
        } else {
            System.out.println("Mal número. Ingresa un número del 1 al 5.");
           }
       }
}

//PATRON 02



