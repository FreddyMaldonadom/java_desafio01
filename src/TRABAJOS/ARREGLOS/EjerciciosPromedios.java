package TRABAJOS.ARREGLOS;

public class EjerciciosPromedios {
        public static void main(String[] args) {
            int[] numeros = new int[args.length];

            for (int i = 0; i < args.length; i++) {
                numeros[i] = Integer.parseInt(args[i]);
            }

            int suma = sumaMultiplosDeTres(numeros);
            double promedio = promedio(numeros);

            System.out.println(suma + " " + (int) promedio);
        }

        public static int sumaMultiplosDeTres(int[] num) {
            int suma = 0;
            for (int n : num) {
                if (n % 3 == 0) {
                    suma += n;
                }
            }
            return suma;
        }
        public static double promedio(int[] arr) {
            int suma = sumaMultiplosDeTres(arr);
            int contador = 0;
            for (int num : arr) {
                if (num % 3 == 0) {
                    contador++;
                }
            }

            if (contador == 0) {
                return 0;
            } else {
                return (double) suma / contador;
            }
        }
    }

