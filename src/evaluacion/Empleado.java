package evaluacion;

public class Empleado {
    private String nombre;
    private String Apellido;

    public Empleado(String nombre, String apellido) {
        this.nombre = nombre;
        Apellido = apellido;
    }

    public Empleado() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n"+ "Apellido: " + Apellido+"\n";
    }
}
