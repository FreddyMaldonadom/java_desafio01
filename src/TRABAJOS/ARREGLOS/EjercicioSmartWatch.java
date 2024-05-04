package TRABAJOS.ARREGLOS;

import java.util.ArrayList;
import java.util.List;

public class EjercicioSmartWatch {

        public static void main(String[] args) {
            int[] pasos = new int[args.length];
            for (int i = 0; i < args.length; i++) {
                try {
                    pasos[i] = Integer.parseInt(args[i]);
                } catch (NumberFormatException e) {
                    System.out.println("El argumento '" + args[i] + "' no es un número válido.");
                    return;
                }
            }


            int[] pasosFiltrados = clearSteps(pasos);


            double promedio = calcularPromedio(pasosFiltrados);


            System.out.println("El promedio de pasos diarios es: " + promedio);
        }

        public static int[] clearSteps(int[] pasos) {
            int count = 0;
            for (int paso : pasos) {
                if (paso >= 200 && paso <= 100000) {
                    count++;
                }
            }

            int[] pasosFiltrados = new int[count];
            int index = 0;
            for (int paso : pasos) {
                if (paso >= 200 && paso <= 100000) {
                    pasosFiltrados[index++] = paso;
                }
            }

            return pasosFiltrados;
        }

        public static double calcularPromedio(int[] pasos) {
            int suma = 0;
            for (int paso : pasos) {
                suma += paso;
            }

            if (pasos.length == 0) {
                return 0;
            } else {
                return (double) suma / pasos.length;
            }
        }
    }

