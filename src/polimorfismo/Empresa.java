
package polimorfismo;

import java.util.*;
public class Empresa {
    private ArrayList<Empleado> empleados;
    public Empresa(){
        this.empleados= new ArrayList<>();
    }
    public void agregarEmpleado(Empleado e){
        this.empleados.add(e);
    }
    public double calcularNomina(){
        double nomina= 0;
        //Polimorfismo asignacion
        for(Empleado empleado: empleados){
            //Ligadura Tardia
            nomina+=empleado.calcularSalario();
        }
        return nomina;
    }
    public double calcularNominaProgramadores(){
        double nomina=0;
        for(Empleado empleado: empleados){
            if(empleado instanceof Programador){
                nomina+=empleado.calcularSalario();
            }
        }
        return nomina;
    }
    public ArrayList<Empleado> listarEmpleado(){
        return this.empleados;
    }
}
