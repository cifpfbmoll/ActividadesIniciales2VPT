package Actividades;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Actividad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos productos se han vendido hoy ?");
        String productos = sc.nextLine();
        int productosP = Integer.parseInt(productos);
        double precioT = 0 ;

        for (int i = 1; i <= productosP; i++) {
            System.out.println("Introduce el precio del producto" + i);
            Scanner pc = new Scanner(System.in);
            Double precio = pc.nextDouble();
            precioT += precio;

        }
        System.out.println("El precio Total asciende a " + precioT);
    }
}
