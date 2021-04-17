package Actividades;

import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        //Ejercicio1
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce Un numero para posteriormente convertirlo en un Carácter ASCII");
        String numero = sc.nextLine();
        int parametro = Integer.parseInt(numero);
        char Ascii = (char) parametro ;
        String Resultado = Character.toString(Ascii);
        System.out.println(Resultado);



    }
}
