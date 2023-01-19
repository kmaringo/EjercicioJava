package evaluacion;

public class EmpleadoAsalariado extends Empleado{
    private double salarioMensual;

    public EmpleadoAsalariado(String nombre, String apellido, double salarioMensual) {
        super(nombre, apellido);
        this.salarioMensual = salarioMensual;
    }

    public EmpleadoAsalariado() {
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    @Override
    public String toString() {
        return super.toString() + "salario mensual: " + salarioMensual+"\n";
    }
}
