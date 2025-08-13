import java.util.Scanner;

public class Ejercicio2 {
    public static void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tipo de animal (perro, gato, ave, otro): ");
        String tipoAnimal = sc.next();

        System.out.print("Ingrese la edad de la mascota: ");
        int edad = sc.nextInt();

        String veterinario = "";

        if (tipoAnimal.equalsIgnoreCase("perro")) {
            veterinario = "Dr. Pérez - Especialista en Caninos";
        } else if (tipoAnimal.equalsIgnoreCase("gato")) {
            veterinario = "Dra. Gómez - Especialista en Felinos";
        } else if (tipoAnimal.equalsIgnoreCase("ave")) {
            veterinario = "Dr. Rodríguez - Especialista en Aves";
        } else {
            veterinario = "Dra. López - Atención General";
        }

        System.out.println("Veterinario asignado: " + veterinario);

        if ((tipoAnimal.equalsIgnoreCase("perro") || tipoAnimal.equalsIgnoreCase("gato")) && edad > 5) {
            System.out.println("Recomendación: Vacunación adicional.");
        }
    }
}
