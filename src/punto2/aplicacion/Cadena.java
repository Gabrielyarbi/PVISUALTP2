/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto2.aplicacion;

/**
 *
 * @author Gabriel
 */
public class Cadena {
     
   public void invertirCadena(){
    
    String Cadena1="programacion visual";
        System.out.println(Cadena1);
        char [] c =Cadena1.toCharArray();
        for(int i=Cadena1.length()-1 ; i > -1; i--) {
           
            System.out.print(c[i]);
            
         
    }
    }
    
}
