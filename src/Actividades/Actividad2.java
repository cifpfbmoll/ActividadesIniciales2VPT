package Actividades;

import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
    //Ejercicio2
    Scanner fc = new Scanner(System.in);
        System.out.println("Introduce Un Carácter ASCII para convertirlo en un numero ");
    String caracter = fc.nextLine();
    char Ascii2 = caracter.charAt(0);
    int a = Ascii2;
        System.out.println(a);

}}
