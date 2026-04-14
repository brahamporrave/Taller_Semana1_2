package POO;
import java.util.ArrayList;
import java.util.Scanner;

// Caso 5: Lista de estudiantes

public class Caso5ListaEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> estudiantes = new ArrayList<>();

        boolean continuar = true;

        System.out.println("=== CASO 5: Lista de estudiantes ===");

        while (continuar) {
            try {
                System.out.println("\n1. Agregar estudiante");
                System.out.println("2. Mostrar lista completa");
                System.out.println("3. Salir");
                System.out.print("Elige una opcion: ");

                int opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.print("Ingresa el nombre del estudiante: ");
                        String nombre = scanner.nextLine().trim();

                        if (nombre.isEmpty()) {
                            throw new IllegalArgumentException("El nombre no puede estar vacio.");
                        }

                        estudiantes.add(nombre);
                        System.out.println("Estudiante agregado correctamente.");
                        break;

                    case 2:
                        System.out.println("\n--- Lista de estudiantes ---");
                        if (estudiantes.isEmpty()) {
                            System.out.println("Aun no hay estudiantes registrados.");
                        } else {
                            for (int i = 0; i < estudiantes.size(); i++) {
                                System.out.println((i + 1) + ". " + estudiantes.get(i));
                            }
                        }
                        break;

                    case 3:
                        continuar = false;
                        System.out.println("Programa finalizado.");
                        break;

                    default:
                        System.out.println("Opcion invalida. Intenta de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: debes ingresar un numero de opcion valido.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Ocurrio un error inesperado: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
