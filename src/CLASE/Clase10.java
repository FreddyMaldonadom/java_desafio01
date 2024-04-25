package CLASE;
import java.util.Scanner;

public class Clase10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();

//        for (int i = 0; i < 11; i++) {
//            System.out.printf("5 * %d = %d\n", i, 5 * i);
//        }
//        for (int i = 1; i < 11; i++) {
//            System.out.printf("%d * %d = %d\n", 0, i, 0 * i);
//        }

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 8-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}






