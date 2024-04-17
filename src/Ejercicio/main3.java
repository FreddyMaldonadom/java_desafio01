package Ejercicio;

import java.util.Scanner;

public class main3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            float resistencia1, resistencia2, resistencia3;


            System.out.println("\u001B[30;43;1m Ingrese la resistencia 1: \u001B[0m");
            resistencia1 = sc.nextFloat();

            System.out.println("\u001B[30;43;1m Ingrese la resistencia 2: \u001B[0m");
            resistencia2 = sc.nextFloat();

            System.out.println("\u001B[30;43;1m Ingrese la resistencia 3: \u001B[0m");
            resistencia3 = sc.nextFloat();

            if (resistencia1 <= 0 || resistencia2 <= 0 || resistencia3 <= 0) {
                System.out.println("\u001B[30;41;1m ERROR, INGRESE NÚMERO POSITIVO! \u001B[0m");
            } else {
              Double resistenciaTotal = 1 / (1.0 / resistencia1 + 1.0 / resistencia2 + 1.0 / resistencia3);
                System.out.println("\u001B[30;44;1m La resistencia total es:  \u001B[0m" + resistenciaTotal);

}}}
