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
public class Hola {
    Estudiante est = new Estudiante();
Scanner in = new Scanner(System.in);
    
    
 public void ins(){
       est.setNombre(in.nextLine());
 }
     
         public void mostrar(){
        System.out.println(est.getNombre());
    }
     
}
