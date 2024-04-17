package desafio01;
import java.util.Scanner;

public class desafio01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//Fecha primera persona
        System.out.println("Ingrese la primera fecha de la persona 01 como DD/MM/AA: ");
        String fecha01 = sc.nextLine();
//Fecha segunda persona
        System.out.println("Ingrese la segunda fecha de la persona 02 como DD/MM/AA: ");
        String fecha02 = sc.nextLine();
        //tomar fecha DD Persona 01
        int dia01 = Integer.parseInt(fecha01.substring(0, 2));

        //tomar MM Persona 01
        int mes01 = Integer.parseInt(fecha01.substring(3, 5));
        //tomar AA persona 01
        int anio01 = Integer.parseInt(fecha01.substring(6, 10));

        //Tomar DD persona 02
        int dia02 = Integer.parseInt(fecha02.substring(0, 2));
        //Tomar MM persona 02
        int mes02 = Integer.parseInt(fecha02.substring(3, 5));
        //Tomar Año persona 02 de 4 dígitos AAAA número completo para evitar problemas con año 2000
        int anio02 = Integer.parseInt(fecha02.substring(6, 10));

        //Entonces la relación de la edad edad es inversa, mientras mas pequeño el numero año, es mayor. Igual la mes y día
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

