/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4.dominio;

import punto4.aplicacion.Cadena;

/**
 *
 * @author Gabriel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cadena c1=new Cadena();
       
       c1.mostrarVocales();
       c1.invertirCadena();
       c1.contarCaracter();
    }
    
}
