package TRABAJOS.GUIADOS;
import java.util.Scanner;

public class sumapar {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.print("Ingrese un número: ");
                int n = sc.nextInt();

                int suma = 0;
                for (int i = 1; i <= n; i++) {
                    if (i % 2 == 0) { // Verifica si el número es par
                        suma += i;
                    }
                }

                System.out.println("La suma de los números pares entre 1 y " + n + " es: " + suma);
            }
        }