package evaluacion;

public class EmpleadoPorHoras extends Empleado{
    private float nroHoras;
    private float valorHora;

    public EmpleadoPorHoras(String nombre, String apellido, float nroHoras, float valorHora) {
        super(nombre, apellido);
        this.nroHoras = nroHoras;
        this.valorHora = valorHora;
    }

    public EmpleadoPorHoras() {
    }

    public float getNroHoras() {
        return nroHoras;
    }

    public void setNroHoras(float nroHoras) {
        this.nroHoras = nroHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public double pagos (){
        double pago = (this.nroHoras * this.valorHora);
        return pago;
    }

    @Override
    public String toString() {
        return super.toString()+ "Horas: " + nroHoras +"\n" + "Valor hora: " + valorHora+"\n";

    }
}
