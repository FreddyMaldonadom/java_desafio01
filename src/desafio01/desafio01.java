package desafio01;
import java.util.Scanner;

public class desafio01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Ingrese la primera fecha de la persona 01 como DD/MM/AA: ");
        String fecha01 = sc.nextLine();

        System.out.println("Ingrese la segunda fecha de la persona 02 como DD/MM/AA: ");
        String fecha02 = sc.nextLine();

        int dia01 = Integer.parseInt(fecha01.substring(0, 2));
        int mes01 = Integer.parseInt(fecha01.substring(3, 5));
        int anio01 = Integer.parseInt(fecha01.substring(6, 10));

        int dia02 = Integer.parseInt(fecha02.substring(0, 2));
        int mes02 = Integer.parseInt(fecha02.substring(3, 5));
        int anio02 = Integer.parseInt(fecha02.substring(6, 10));

        if (anio01 < anio02) {
            System.out.println("La primera persona es mayor que la segunda persona.");
        } else if (anio01 > anio02) {
            System.out.println("La segunda persona es mayor que la primera persona.");
        } else {
            if (mes01 < mes02) {
                System.out.println("La primera persona es mayor que la segunda persona.");
            } else if (mes01 > mes02) {
                System.out.println("La segunda persona es mayor que la primera persona.");
            } else {
                if (dia01 < dia02) {
                    System.out.println("La primera persona es mayor que la segunda persona.");
                } else if (dia01 > dia02) {
                    System.out.println("La segunda persona es mayor que la primera persona.");
                } else {
                    System.out.println("Tienen la misma edad");
                }
            }
        }
    }
}

