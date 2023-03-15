import java.util.Scanner;
public class Tema2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio: ");
        double precio = sc.nextDouble();

        System.out.println("El precio incluido el IVA es: " + precioVenta(precio));
    }

    public static double precioVenta (double precio) {
        double precioConIva = precio + (precio * 0.18);
        return precioConIva;
    }
}
