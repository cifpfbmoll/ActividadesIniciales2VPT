package Actividades;

import java.util.Scanner;

public class Actividad6 {
    public static void main(String[] args) {
        int bucle = 0 ;
        while (bucle < 100){
            bucle++;

            int divisible2 = bucle % 2 ;
            int divisible3 = bucle % 3;
            if (divisible2 == 0 ){
                System.out.println("El numero " + bucle + " es divisible entre 2");
            }
            if ( divisible3 == 0){
                System.out.println("El numero " + bucle + " es divisible entre 3");
            }
        }

    }
}
