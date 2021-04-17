package Actividades;
import java.util.Scanner ;

public class Actividad3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce El precio al que le quieres aplicar IVA ");
        String precio = sc.nextLine();
       double precioINT = Double.parseDouble(precio);
       double IVA = (double) ((0.21 * precioINT) + precioINT);
       System.out.println("Tu Producto una vez aplicado el iva será de : " + IVA + "Euros");
    }
}
