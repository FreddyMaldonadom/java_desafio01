package TRABAJOS.ARREGLOS;

public class EjerciciosMultiplos {
    public static void main(String[] args) {
        int[] num;
        num = new int[7];
        num[0] = 10;
        num[1] = 20;
        num[2] = 30;
        num[3] = 21;
        num[4] = 33;
        num[5] = 8;
        num[6] = 61;

        System.out.println("Arreglo original: ");
        for (int n : num) {
            System.out.print(n + " ");
        }
        System.out.println();

        int suma = sumaMultiplosDeTres(num);
        System.out.println("La suma de los múltiplos de 3 es: " + suma);
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
}

