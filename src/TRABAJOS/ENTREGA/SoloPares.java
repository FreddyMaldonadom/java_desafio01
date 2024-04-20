package TRABAJOS.ENTREGA;
import java.util.Scanner;

public class SoloPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("INGRESA UN NUMERO QUE SEA ENTERO: ");

        int n = sc.nextInt();
        int contador = 0;
        int i = 0;

        while (contador < n) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                contador++;
            }
            i++;
        }
    }
}


