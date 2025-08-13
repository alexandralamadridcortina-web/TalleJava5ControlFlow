import java.util.Scanner;

public class Ejercicio4 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tipo de prenda (camisa, pantalon, chaqueta): ");
        String tipoPrenda = sc.next();

        System.out.print("Ingrese la cantidad de prendas: ");
        int cantidad = sc.nextInt();

        double precioUnitario = 0;
        if (tipoPrenda.equalsIgnoreCase("camisa")) {
            precioUnitario = 20000;
        } else if (tipoPrenda.equalsIgnoreCase("pantalon")) {
            precioUnitario = 40000;
        } else if (tipoPrenda.equalsIgnoreCase("chaqueta")) {
            precioUnitario = 60000;
        } else {
            System.out.println("Tipo de prenda no válido.");
            return;
        }

        double total = precioUnitario * cantidad;
        if (cantidad > 5) {
            total -= total * 0.15;
        }

        System.out.println("El total a pagar es: $" + total);
    }
}
