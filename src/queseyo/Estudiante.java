/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queseyo;

import java.util.Scanner;

/**
 *
 * @author Lugue
 */
public class Estudiante {
      Scanner sc = new Scanner(System.in);

      
      
      
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
            private String nombre;
   

 
    public void mostrar(){
        Estudiante est = new Estudiante();
        System.out.println(est.getNombre());
    }
    
}
