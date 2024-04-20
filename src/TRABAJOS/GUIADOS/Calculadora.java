package TRABAJOS.GUIADOS;
import java.util.Scanner;
public class Calculadora {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Ingrese el primer número: ");
                double num1 = sc.nextDouble();

                System.out.print("Ingrese el segundo número: ");
                double num2 = sc.nextDouble();

                int opcion;
                double resultado;

                do {
                    System.out.println("Menú de operaciones:");
                    System.out.println("1. Sumar");
                    System.out.println("2. Restar");
                    System.out.println("3. Multiplicar");
                    System.out.println("4. Dividir");
                    System.out.println("5. Salir");
                    System.out.print("Ingrese una opción: ");
                    opcion = sc.nextInt();

                    switch (opcion) {
                        case 1:
                            resultado = num1 + num2;
                            System.out.println("El resultado de la suma es: " + resultado);
                            break;
                        case 2:
                            resultado = num1 - num2;
                            System.out.println("El resultado de la resta es: " + resultado);
                            break;
                        case 3:
                            resultado = num1 * num2;
                            System.out.println("El resultado de la multiplicación es: " + resultado);
                            break;
                        case 4:
                            if (num2 != 0) {
                                resultado = num1 / num2;
                                System.out.println("El resultado de la división es: " + resultado);
                            } else {
                                System.out.println("Error: No se puede dividir por cero.");
                            }
                            break;
                        case 5:
                            System.out.println("Saliendo del programa...");
                            break;
                        default:
                            System.out.println("Opción inválida. Intente nuevamente.");
                    }
                } while (opcion != 5);

                sc.close();
            }
        }
