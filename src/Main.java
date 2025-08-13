import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("===== MENU TALLER JAVA =====");
        System.out.println("1. Sistema de Facturación para Supermercado");
        System.out.println("2. Clasificación de Mascotas en Veterinaria");
        System.out.println("3. Control de Acceso a Parqueadero");
        System.out.println("4. Promociones en Tienda de Ropa");
        System.out.print("Seleccione una opción: ");
        opcion = sc.nextInt();

        if (opcion == 1) {
            Ejercicio1.ejecutar();
        } else if (opcion == 2) {
            Ejercicio2.ejecutar();
        } else if (opcion == 3) {
            Ejercicio3.ejecutar();
        } else if (opcion == 4) {
            Ejercicio4.ejecutar();
        } else {
            System.out.println("Opción no válida.");
        }

        sc.close();
    }
}
