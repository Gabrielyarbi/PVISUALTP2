/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5fecha.dominio;

import java.text.ParseException;
import punto5fecha.aplicacion.Fecha;

/**
 *
 * @author Gabriel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws ParseException {
       Fecha f1=new Fecha();
       f1.calcularSemana();
       f1.contarDom();
       f1.mostarEstacion();
       f1.mostrarFecha();
    }
    
}
