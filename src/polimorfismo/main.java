
package polimorfismo;
import java.util.*;
public class main {
    public static int menu(){
        int opcion=0;
        Scanner teclado= new Scanner(System.in);
        System.out.println(" \t1.Agregar:"
                          +"\n \t2.Listar:"
                          +"\n \t3.Nomina:"
                          +"\n \t4.Nomina Programador:"
                          +"\n \t5.Salir:");
        opcion=teclado.nextInt();
        return(opcion);
    }
    public static void main(String []args){
        int opcion =-1;
        Empresa empresa=new Empresa();
        Scanner teclado = new Scanner(System.in);
        do{
            opcion= menu();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese nombre empleado");
                    String nombre = teclado.next();
                    System.out.println("Tipo empleado: 1.Programador  2.Arquitecto");
                    int tipo=teclado.nextInt();
                    Empleado empleado=null;
                    //Faltan validaciones
                    if(tipo==1){
                        empleado = new Programador(nombre);
                    }else if(tipo==2){
                        empleado = new Arquitecto(nombre);
                    }
                    empresa.agregarEmpleado(empleado);
                    break;
                case 2:
                    ArrayList<Empleado>empleados=empresa.listarEmpleado();
                    for(int i=0;i<empleados.size();i++){
                        Empleado e= empleados.get(i);
                        if(e instanceof Programador){ 
                                System.out.println(e.getNombre()+ " Programador");
                    }else{
                            System.out.println(e.getNombre()+ "  Arquitecto");
                    }
                    }
                    break;
                case 3:
                    double nominaArquitectos=empresa.calcularNomina();
                    System.out.println("Nomina" + nominaArquitectos);
                    break;
                case 4:
                    double nominaProgramadores=empresa.calcularNominaProgramadores();
                    System.out.println("Nomina" + nominaProgramadores);
                    break;
                case 5:
                    System.out.println("Chao perrugs");
                    break;
                default:
                    System.out.println("invalido");
            }
        }while(opcion!=5);
    }
    
}
