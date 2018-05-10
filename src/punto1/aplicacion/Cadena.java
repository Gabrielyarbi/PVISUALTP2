/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto1.aplicacion;

/**
 *
 * @author Gabriel
 */
public class Cadena {
      public void mostrarVocales(){
    String cad= "Hola Mundo";
    int acum=0;
    
        System.out.println(cad);
    for (int i=0;i < cad.length();i++){
    
  
        
       if((cad.charAt(i)=='a') || (cad.charAt(i)=='e') || (cad.charAt(i)=='i') || (cad.charAt(i)=='o') || (cad.charAt(i)=='u')){
      
        acum++;
       }
      
        
    }
    System.out.println("La cantidad de vocales es "+acum);
    }
}
