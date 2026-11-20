package listaestudiantes;
import java.util.Scanner;

public class VistaEstudiantes {

    private Scanner teclado = new Scanner(System.in);

    public int mostrarMenu() {

        System.out.println("\n================================");
        System.out.println("     SISTEMA DE ESTUDIANTES");
        System.out.println("================================");
        System.out.println("1. Registrar un estudiante");
        System.out.println("2. Eliminar un estudiante");
        System.out.println("3. Mostrar lista de estudiantes");
        System.out.println("4. Salir");
        System.out.println("================================");
        System.out.print("Seleccione una opcion: ");

        try {
            return Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public Estudiante solicitarEstudiante() {

        System.out.println("\n--- REGISTRAR ESTUDIANTE ---");

        System.out.print("Numero de control: ");
        String numero = teclado.nextLine();

        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Apellidos: ");
        String apellidos = teclado.nextLine();

        System.out.print("Carrera: ");
        String carrera = teclado.nextLine();

        return new Estudiante(numero, nombre, apellidos, carrera);
    }

    public String solicitarNumeroControl() {

        System.out.print("\nIngrese el numero de control: ");
        return teclado.nextLine();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarEstudiantes(String estudiantes) {

        System.out.println("\n--- LISTA DE ESTUDIANTES ---");
        System.out.println(estudiantes);
    }
}

