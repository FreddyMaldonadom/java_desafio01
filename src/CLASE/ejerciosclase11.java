package clase;

import java.util.Scanner;


public class ejerciosclase11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//        System.out.println("Ingresa un numero");
//        int n = sc.nextInt();
//
//                for (int i = 1; i <= 5; i++) {
//                    for (int j = 1; j < i; j++) {
//                        System.out.print(n);
//                        n++;
//                    }
//                    System.out.println();
//                }
//            }
//        }

//        System.out.println("Ingresa un numero");
//        int nu = sc.nextInt();
//
//
//        for (int i = 1; i <= 6; i++) {
//
//                    for (int j = 1; j <= i; j++) {
//                        System.out.print(nu);
//                        nu++;
//                    }
//                    System.out.println();
//                }
//            }
//        }



                System.out.print("Ingresa un numero: ");
                int n = sc.nextInt();

                for (int i = 1; i <= 5; i++) {
                    int numero = n;
                    for (int j = 1; j <= i; j++) {
                        System.out.print(numero + " , ");
                        numero++;
                    }
                    System.out.println();
                }
            }
        }
