package listaestudiantes;

public class ControladorEstudiantes {

    private ListaEstudiantes modelo;
    private VistaEstudiantes vista;

    public ControladorEstudiantes(ListaEstudiantes modelo,
                                  VistaEstudiantes vista) {

        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {

        int opcion;

        do {

            opcion = vista.mostrarMenu();

            switch (opcion) {

                case 1:
                    Estudiante estudiante = vista.solicitarEstudiante();

                    if (modelo.registrar(estudiante)) {
                        vista.mostrarMensaje(
                                "Estudiante registrado correctamente.");
                    } else {
                        vista.mostrarMensaje(
                                "Error: el numero de control ya existe.");
                    }
                    break;

                case 2:
                    String numero = vista.solicitarNumeroControl();

                    if (modelo.eliminar(numero)) {
                        vista.mostrarMensaje(
                                "Estudiante eliminado correctamente.");
                    } else {
                        vista.mostrarMensaje(
                                "No se encontro el estudiante.");
                    }
                    break;

                case 3:
                    vista.mostrarEstudiantes(modelo.mostrar());
                    break;

                case 4:
                    vista.mostrarMensaje(
                            "Saliendo del sistema...");
                    break;

                default:
                    vista.mostrarMensaje(
                            "Opcion no valida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 4);
    }
}
