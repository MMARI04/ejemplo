package ruletachimba;

import ruletachimba.Nodo;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author sweet_milkshake
 */
public class RuletaChimba {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        System.out.println("                                                                                          Bienvenido/a al juego de azar del momento: ¡la ruleta de la suerte!");
        System.out.println("");
        System.out.println("El número de jugadores por cada partida será de cuatro (4). ¡Comenzemos!");
        System.out.println("");
        
        File jugadorUno = new File("C:\\Users\\Mariana\\OneDrive\\Escritorio\\RuletaSemiLista\\Jugador1.txt");
        File jugadorDos = new File("C:\\Users\\Mariana\\OneDrive\\Escritorio\\RuletaSemiLista\\Jugador2.txt");
        File jugadorTres = new File("C:\\Users\\Mariana\\OneDrive\\Escritorio\\RuletaSemiLista\\Jugador3.txt");
        File jugadorCuatro = new File("C:\\Users\\Mariana\\OneDrive\\Escritorio\\RuletaSemiLista\\Jugador4.txt");
        
        Scanner escaneaJugadorUno = new Scanner(jugadorUno);
        System.out.println("Jugador #1: ");
            while(escaneaJugadorUno.hasNextLine()) {
                System.out.println(escaneaJugadorUno.nextLine());
            }   System.out.println("");
            
        Scanner escaneaJugadorDos = new Scanner(jugadorDos);
        System.out.println("Jugador #2: ");
            while(escaneaJugadorDos.hasNextLine()) {
                System.out.println(escaneaJugadorDos.nextLine());
            }   System.out.println("");
            
        Scanner escaneaJugadorTres = new Scanner(jugadorTres);
        System.out.println("Jugador #3: ");
            while(escaneaJugadorTres.hasNextLine()) {
                System.out.println(escaneaJugadorTres.nextLine());
            }   System.out.println("");
            
        Scanner escaneaJugadorCuatro = new Scanner(jugadorCuatro);
        System.out.println("Jugador #4: ");
            while(escaneaJugadorCuatro.hasNextLine()) {
                System.out.println(escaneaJugadorCuatro.nextLine());
            }   System.out.println("");
        
        File ruletaNice=new File("C:\\Users\\Mariana\\OneDrive\\Escritorio\\RuletaSemiLista\\Ruleta.txt");
  
       
  for (int ruletaNice=0; ruletaNice){
            
        }
    
    
    
    
    
    
    
    
    
    /* while(chequeoRuleta.hasNextLine()){
         int contenidolinea=chequeoRuleta.nextLine();//*
         
         
         for(int chequeaRuleta=0;){
             
         }
         
         
         
         
         
         
         
       /*  if(contenidolinea!=null){
             Nodo nodito;
             nodito = new Nodo(0);
             
             int chequeoPar=nodito.casilla ;
         
             if(chequeoPar==0){
                
                 nodito.color="rojo";
                 nodito.parImpar="par";
             
                 
             }else if(chequeoPar!=0){
                 nodito.color="negro";
                 nodito.parImpar="impar";
                 nodito.mostrarInfoCasilla();
             }
                 
     }
     }
       
        
      
        
            
        
    
   
  
}
}