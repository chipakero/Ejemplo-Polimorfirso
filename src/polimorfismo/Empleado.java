
package polimorfismo;


public class Empleado {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {this.nombre = nombre;}
    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    protected String nombre;
    public double calcularSalario(){
        return 0;
    }
}

