import java.util.Scanner;

public class clases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        } else if (numero2 > numero3) {
            System.out.println("El mayor de los numero es " + numero3);
        } else {
            System.out.println("No hay numero mayor");
        }
    }
}
