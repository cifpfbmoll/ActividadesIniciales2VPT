package Actividades;

import java.util.Scanner;

public class Actividad9 {
    public static void main(String[] args) {
        int vidas = 3;
        String contraseña = "pepe";
        while(vidas > 0){
        Scanner sc = new Scanner(System.in);
        System.out.println("Adivina la contraseña ");
        String contraseñaEND = sc.nextLine();
        if (contraseñaEND.equals(contraseña)){
            System.out.println("ENHORABONA!!!!!");
            break;
        }else{
            vidas --;
            System.out.println("ERROR de Autenticación");
            System.out.println("te quedan " + vidas + "vida/s");
            System.out.println("---------------------------------");
        }
    }

    }}

