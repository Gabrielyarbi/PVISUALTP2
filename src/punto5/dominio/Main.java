/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5.dominio;

import punto5.aplicacion.Stringg;

/**
 *
 * @author Gabriel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stringg s1=new Stringg();
        s1.buscarEnCadena();
        System.out.println("-----------------");
        s1.comparar();
        System.out.println("-----------------");
        s1.compararIgual();
        System.out.println("-----------------");
        s1.concatenar();
        System.out.println("-----------------");
        s1.convertirCadena();
        System.out.println("-----------------");
        s1.extraerSubcadena();
        System.out.println("-----------------");
        s1.indicarCadena();
        System.out.println("-----------------");
        s1.medirCadena();
        System.out.println("-----------------");
    }
    
}
