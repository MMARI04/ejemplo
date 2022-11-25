/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruletachimba;

import java.io.File;

/**
 *
 * @author sweet_milkshake
 */
public class Nodo {
        int casilla;
        String color;
        String parImpar;
        Nodo next=null;
       
        
        Nodo(int casillaActual){
            casilla=casillaActual;
           
        }

   
    
            
        public void mostrarInfoCasilla() {
            System.out.println("---------------------------------------");
            System.out.println("");
            System.out.println("El número de casilla es: " + casilla);
            System.out.println("");
            System.out.println("El color de esta casilla es: " + color);
            System.out.println("");
            System.out.println("La condición del número (par) es: " + parImpar);
            System.out.println("");
        }

}
      
