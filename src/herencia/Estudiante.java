
package herencia;

public class Estudiante extends Persona{

    public Estudiante(double[] notas, Profesor asignado,String direccion, String telefono, String materia) {
        super(direccion, telefono, materia);
        this.notas = notas;
        this.asignado = asignado;
    }
public double calcularPromedio(){
    double resultado=0;
    for(double nota: notas){
    resultado+=nota;
}
    return resultado/notas.length;
}
    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public Profesor getAsignado() {
        return asignado;
    }

    public void setAsignado(Profesor asignado) {
        this.asignado = asignado;
    }
    private double[] notas;
    private Profesor asignado;
}
