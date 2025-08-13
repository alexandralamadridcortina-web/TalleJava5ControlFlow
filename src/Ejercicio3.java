import java.util.Scanner;

public class Ejercicio3 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tipo de vehículo (auto, moto, bicicleta): ");
        String tipoVehiculo = sc.next();

        System.out.print("Ingrese la hora de llegada (0-23): ");
        int horaLlegada = sc.nextInt();

        double costoBase = 0;
        if (tipoVehiculo.equalsIgnoreCase("auto")) {
            costoBase = 5000;
        } else if (tipoVehiculo.equalsIgnoreCase("moto")) {
            costoBase = 3000;
        } else if (tipoVehiculo.equalsIgnoreCase("bicicleta")) {
            costoBase = 1000;
        } else {
            System.out.println("Tipo de vehículo no válido.");
            return;
        }

        if (horaLlegada >= 20) {
            costoBase += costoBase * 0.20;
        }

        System.out.println("El costo total del parqueo es: $" + costoBase);
    }
}
