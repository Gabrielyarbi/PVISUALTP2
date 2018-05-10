/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3.aplicacion;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Cadena {
    public void contarCaracter(){
    String cad1 = "casa blanca";
    char car1 = 'a';
    int acum=0;
        for (int i =0 ; i < cad1.length() ;i++){
        
           if (cad1.charAt(i)==car1){
               acum++;
           }
        }
        System.out.println(cad1);
    System.out.println("El caracter '"+car1+"' se repite "+acum+" veces");
    
    }   
}

