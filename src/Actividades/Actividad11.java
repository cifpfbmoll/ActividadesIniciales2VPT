package Actividades;


import java.util.Scanner;

public class Actividad11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu primer delimitador");
        Integer numero1 = sc.nextInt();
        Scanner pc = new Scanner(System.in);
        System.out.println("Introduce tu segundo delimitador");
        Integer numero2 = pc.nextInt();
        int contador = 1;
        while(contador < 10){
            int respuesta = (int) (Math.random() * (numero2 - numero1)) + numero1;
            System.out.println(respuesta);
            contador++;


    }}}