import java.util.Scanner;

public class Ejercicio1 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el total de la compra: ");
        double totalCompra = sc.nextDouble();

        System.out.print("Ingrese la cantidad de productos comprados: ");
        int cantidadProductos = sc.nextInt();

        System.out.print("¿Tiene membresía? (si/no): ");
        String membresia = sc.next();

        if (membresia.equalsIgnoreCase("si")) {
            totalCompra -= totalCompra * 0.10;
        }
        if (cantidadProductos > 10) {
            totalCompra -= totalCompra * 0.05;
        }

        System.out.println("El total a pagar es: $" + totalCompra);
    }
}
