package Actividades;

import java.util.Scanner;

public class Actividad8 {
    public static void main(String[] args) {
        int numero = 0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce Un numero que difiera de 0");
             numero = sc.nextInt();

        }while (numero != 0);

    }
}
