/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejarrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author silva
 */
public class EjArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Aprendiz miAprendiz = new Aprendiz ();
//        miAprendiz.setNombre("Miguel");
//        System.out.println("Nombre  " + miAprendiz.getNombre());
        
        ArrayList<Aprendiz> listaAprendiz = new ArrayList();
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            Aprendiz miAprendiz = new Aprendiz ();
            miAprendiz.setId(i);
            System.out.println("Ingrese el nombre del aprendiz: ");
            miAprendiz.setNombre(teclado.next());
            System.out.println("Ingrese la nota 1 del aprendiz: ");
            miAprendiz.setN1(teclado.nextInt());
            System.out.println("Ingrese la nota 2 del aprendiz: ");
            miAprendiz.setN2(teclado.nextInt());
            System.out.println("Ingrese la nota 3 del aprendiz: ");
            miAprendiz.setN3(teclado.nextInt());
            
            listaAprendiz.add(miAprendiz);
            
        
       System.out.println("Imprimiendo los aprendices agregados a la lista");
       for (Aprendiz var: listaAprendiz){
      
       float promedio = (var.getN1() + var.getN2() + var.getN3())/3f;
       System.out.println("El alumno " +  var.getNombre() + " tiene un promedio de sus notas de: " + promedio );
       
       }
       
    }
    
    }
    
}
