
package polimorfismo;


public class Programador extends Empleado{

    public Programador(String nombre) {
        super(nombre);
    }
   
    @Override
    public double calcularSalario(){
        return 100;
    }
    
}
