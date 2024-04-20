package TRABAJOS.GUIADOS;
import java.util.Scanner;
public class clase9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("ingrese un numero valido");
//        int numero = sc.nextInt();
//        for (int i=0; i<= numero; i++){
//            System.out.print("\u001B[32m"+"*"+"\u001B[0m");
//        }
        //Dibuje * y puntos
        System.out.println("Ingrese numero de puntos para dibujar: ");
        int numero = sc.nextInt();

        for(int i=0; i<= numero-1; i++);{
            if(1%2==0){
                System.out.print("\u001B[32m"+"*"+"\u001B[0m");}
                else {
                    System.out.print("\u001B[33m"+"."+"\u001B[0m");
                }
            }
        }
}
