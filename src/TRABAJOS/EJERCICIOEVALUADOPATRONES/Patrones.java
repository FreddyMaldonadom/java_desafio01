package TRABAJOS.EJERCICIOEVALUADOPATRONES;
import java.util.Scanner;

public class Patrones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Patrón 01:
//        System.out.print("Ingresa un numero 13 ");
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            if (i % 2 == 0) {
//                System.out.print("*");
//            } else {
//                System.out.print(".");
//            }
//        }
//    }
//}


//PATRON 02
//        System.out.print("Elige un numero ¿1 o 2? ");
//        int n = sc.nextInt();
//
//        if (n % 2 == 0) {
//            System.out.println("12341234");
//        } else {
//            System.out.println("1234");
//        }
//    }
//}

//PATRON 03
        System.out.print(" Escribe un número del 1 al 10");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print("||");
            } else {
                System.out.print("*");
            }
        }
    }
}
