package Actividades;

import java.util.Scanner;

public class Actividad10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce El dia de la semana que quieres analizar (en minusculas) ");
        String dia = sc.nextLine();
        switch (dia){
            case "lunes":
                System.out.println("Dia Laboral");
                break;
            case "martes":
                System.out.println("Dia Laboral");
                break;
            case "miercoles":
                System.out.println("Dia Laboral");
                break;
            case "jueves":
                System.out.println("Dia Laboral");
                break;
            case "viernes":
                System.out.println("Dia Laboral");
                break;
            case "sabado":
                System.out.println("No laboral");
                break;
            case "domingo":
                System.out.println("No Laboral (No curró ni dios en su dia)");
                break;
        }

    }
}
