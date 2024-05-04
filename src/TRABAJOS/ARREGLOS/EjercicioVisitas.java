package TRABAJOS.ARREGLOS;
import java.util.Scanner;

public class EjercicioVisitas {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        int suma = 0;
                        int contador = 0;

                        System.out.print("Ingrese un número, ingresa 0 si no hay más que agregar: ");
                        int num = sc.nextInt();

                        while (num != 0) {
                            suma += num;
                            contador++;
                            System.out.print("Ingrese un número, ingresa 0 si no hay más que agregar: ");
                            num = sc.nextInt();
                        }

                        if (contador > 0) {
                            double promedio = (double) suma / contador;
                            System.out.println("El promedio de los " +contador + " números es: " +promedio);
                        } else {
                            System.out.println("No se ingresaron números.");
                        }

                    }
                }