package listaestudiantes;

public class Principal {

    public static void main(String[] args) {

        ListaEstudiantes modelo = new ListaEstudiantes();

        VistaEstudiantes vista = new VistaEstudiantes();

        ControladorEstudiantes controlador =
                new ControladorEstudiantes(modelo, vista);

        controlador.iniciar();
    }
}


