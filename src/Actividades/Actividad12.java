package Actividades;

import java.util.Scanner;

public class Actividad12 {
    public static void main(String[] args) {
        //Ejercicio2
        Scanner fc = new Scanner(System.in);
        System.out.println("Introduce un numero Positivo y se leerán el Numero de Cifras  ");
        String caracter = fc.nextLine();
        int Contador = caracter.length();
        String SingularPlural = "";

        if (Contador == 1){
            SingularPlural += "Cifra";

        }else{
            SingularPlural += "Cifras";
        }

        System.out.println("Tu Numero consta de " + Contador + " " + SingularPlural);

    }

}
