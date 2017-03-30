/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Estudiante
 */
public class Ejecutar {
    public static void main(String[] args){
        Profesor p = new Profesor("f","123","poo");
        double notas[]={5,5,5,5};
        Estudiante e = new Estudiante(notas, p ,"V","456","poo");
        
        System.out.println(e.getDireccion());
        
         System.out.println(e.getAsignado().getDireccion());
         
          System.out.println(e.getMateria());
           System.out.println(e.calcularPromedio());
    }
    
}
