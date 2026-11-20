package listaestudiantes;

public class ListaEstudiantes {

    private Nodo inicio;

    public ListaEstudiantes() {
        inicio = null;
    }

    // Registrar estudiante
    public boolean registrar(Estudiante estudiante) {

        Nodo nuevo = new Nodo(estudiante);

        if (inicio == null) {
            inicio = nuevo;
            return true;
        }

        Nodo actual = inicio;

        while (actual.getSiguiente() != null) {

            if (actual.getEstudiante().getNumeroControl()
                    .equalsIgnoreCase(estudiante.getNumeroControl())) {
                return false;
            }

            actual = actual.getSiguiente();
        }

        if (actual.getEstudiante().getNumeroControl()
                .equalsIgnoreCase(estudiante.getNumeroControl())) {
            return false;
        }

        actual.setSiguiente(nuevo);

        return true;
    }

    // Eliminar estudiante
    public boolean eliminar(String numeroControl) {

        if (inicio == null) {
            return false;
        }

        if (inicio.getEstudiante().getNumeroControl()
                .equalsIgnoreCase(numeroControl)) {

            inicio = inicio.getSiguiente();
            return true;
        }

        Nodo actual = inicio;

        while (actual.getSiguiente() != null) {

            if (actual.getSiguiente().getEstudiante()
                    .getNumeroControl().equalsIgnoreCase(numeroControl)) {

                actual.setSiguiente(
                        actual.getSiguiente().getSiguiente());

                return true;
            }

            actual = actual.getSiguiente();
        }

        return false;
    }

    // Mostrar lista de estudiantes
    public String mostrar() {

        if (inicio == null) {
            return "No hay estudiantes registrados.";
        }

        String resultado = "";
        Nodo actual = inicio;

        while (actual != null) {

            resultado += actual.getEstudiante().toString();
            resultado += "\n-------------------------\n";

            actual = actual.getSiguiente();
        }

        return resultado;
    }
}

