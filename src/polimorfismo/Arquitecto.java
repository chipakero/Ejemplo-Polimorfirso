
package polimorfismo;

public class Arquitecto extends Empleado{

    public Arquitecto(String nombre) {
        super(nombre);
    }
    @Override
    public double calcularSalario(){
        return 200;
    }
    
}
