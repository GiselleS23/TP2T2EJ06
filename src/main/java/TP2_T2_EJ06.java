/* 6.- Lea 3 números enteros y emita un mensaje que indique si están o no en orden numérico.
Sacchetti Maria Giselle C2 */

import java.util.Scanner;

public class TP2_T2_EJ06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese tres números enteros:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if (num1 <= num2 && num2 <= num3) {
            System.out.println("Los números están en orden numérico.");
        } else if (num1 >= num2 && num2 >= num3) {
            System.out.println("Los números están en orden numérico.");
        } else {
            System.out.println("Los números no están en orden numérico.");
        }

        scanner.close();
    }
}
