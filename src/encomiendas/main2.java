package encomiendas;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nombre, apellido, direccion, ciudad;
        int nunDireccion, telefono;

        System.out.println("Ingrese nombre: ");
        nombre = sc.nextLine();
        System.out.println("ingrese el apellido: ");
        apellido = sc.nextLine();
        System.out.println("ingrese la dirección: ");
        direccion = sc.nextLine();
        System.out.println("Ingrese n° de dirección: ");
        nunDireccion = sc.nextInt();
        System.out.println("Ingrese ciudad: ");
        ciudad = sc.nextLine();
        System.out.println("Ingrese numero de telefono: ");
        telefono = sc.nextInt();

        String etiqueta =  String.format(
                "De: %s %s\n"
                        +"Dirección: %s %d\n"
                        +"Ciudad:%s\n"
                        +"Contacto:%d\n",
                nombre, apellido, direccion, nunDireccion, ciudad, telefono);
        System.out.println(etiqueta);
    }

}
