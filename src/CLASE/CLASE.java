package CLASE;

import java.util.Scanner;

public class CLASE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("ingrese su porcentaje");
        int porcentaje = sc.nextInt();

        if (porcentaje == 0) {
            System.out.println("Pendiente");
        } else if (porcentaje < 99 && porcentaje > 8) {
            System.out.println("En proceso");
        } else if (porcentaje == 100) {
            System.out.println("Terminado");
        } else {
            System.out.println("ingrese un valor correcto");
        }


        sc = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;

        System.out.println("Ingrese Primer Valor");
        numero1 = sc.nextInt();
        System.out.println("Ingrese segundo Valor");
        numero2 = sc.nextInt();
        System.out.println("Ingresa Tercer valor");
        numero3 = sc.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El mayor de los números es " + numero1);
        } else if (numero2 > numero3) {
            System.out.println("El mayor de los numero es " + numero2);
        } else {
            System.out.println("");
        }


    }}
