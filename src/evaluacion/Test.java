package evaluacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        int numero = 0;
        int contador = 0;
        double SalarioEmple = 0;
        double salarioHora = 0;
        double salarioTotal = 0;

        Scanner sc = new Scanner(System.in);
        ArrayList<EmpleadoAsalariado> EmpleadoAs = new ArrayList();
        ArrayList<EmpleadoPorHoras> EmpleadoHo = new ArrayList();
        System.out.println("SISTEMA DE EMPLEADOS");
        do {
            System.out.println("Seleccione el tipo de empleado que necesita crear 1:Asalariado - 2:Por horas");
            numero = sc.nextInt();
            if (numero ==1){
                System.out.println("Asalariado");
                EmpleadoAsalariado asalariado = new EmpleadoAsalariado();
                System.out.println("Nombre del empleado: ");
                sc.nextLine();
                asalariado.setNombre(sc.nextLine());
                System.out.println("Apellido del empleado: ");
                asalariado.setApellido(sc.nextLine());
                System.out.println("Salario: ");
                asalariado.setSalarioMensual(sc.nextDouble());
                System.out.println("Empleado asalariado creado");
                System.out.println(asalariado.toString());
                EmpleadoAs.add(asalariado);
            } else if (numero == 2) {
                System.out.println("Empleado por horas");
                EmpleadoPorHoras Horas = new EmpleadoPorHoras();
                System.out.println("Nombre del empleado: ");
                sc.nextLine();
                Horas.setNombre(sc.nextLine());
                System.out.println("Apellido del empleado: ");
                Horas.setApellido(sc.nextLine());
                System.out.println("Ingrese las horas laboradas: ");
                Horas.setNroHoras(sc.nextFloat());
                System.out.println("Ingrese valor de la hora: ");
                Horas.setValorHora(sc.nextFloat());
                System.out.println("Empleado por horas creado");
                System.out.println(Horas.toString());
                EmpleadoHo.add(Horas);
            }

            contador ++;
        }while (contador<3);

        if (EmpleadoAs.isEmpty()){
            System.out.println("No hay empleados de este tipo");
        }
        else {
            for (int i = 0; i<EmpleadoAs.size();i++){
                System.out.println(EmpleadoAs.get(i));
                SalarioEmple = SalarioEmple + EmpleadoAs.get(i).getSalarioMensual();
            }
        }
        System.out.println("Pago empleados asalariado:" + SalarioEmple);

        if (EmpleadoHo.isEmpty()){
            System.out.println("No hay empleados de este tipo");
        }
        else {
            for (int i = 0; i<EmpleadoHo.size();i++){
                System.out.println(EmpleadoHo.get(i));
                salarioHora = salarioHora + EmpleadoHo.get(i).pagos();
            }
        }
        System.out.println("Pago empleados por hora:" + salarioHora);
        salarioTotal = SalarioEmple + salarioHora;
        System.out.println("Pagos de la empresa: " + salarioTotal);
    }
}
