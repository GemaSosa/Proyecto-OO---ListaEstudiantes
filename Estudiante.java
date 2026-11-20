package listaestudiantes;

public class Estudiante {

    private String numeroControl;
    private String nombre;
    private String apellidos;
    private String carrera;

    public Estudiante(String numeroControl, String nombre,
                      String apellidos, String carrera) {

        this.numeroControl = numeroControl;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.carrera = carrera;
    }

    public String getNumeroControl() {
        return numeroControl;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCarrera() {
        return carrera;
    }

    @Override
    public String toString() {
        return "Numero de Control: " + numeroControl +
               "\nNombre: " + nombre +
               "\nApellidos: " + apellidos +
               "\nCarrera: " + carrera;
    }
}

