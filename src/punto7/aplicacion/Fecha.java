/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto7.aplicacion;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Fecha {
     public void mostrarFecha(){
    
    int a,m,d;
        Calendar FechaUno;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese año de la fecha ");
        a=scan.nextInt();
        System.out.println("Ingrese mes de la fecha");
        m=scan.nextInt();
        System.out.println("Ingrese dia de la fecha ");
        d=scan.nextInt();
        FechaUno=new GregorianCalendar(a, m-1, d);
       SimpleDateFormat Formato=new SimpleDateFormat("dd MMMM yyyy");
        FechaUno.add(Calendar.DAY_OF_MONTH ,100);
        System.out.println(Formato.format(FechaUno.getTime()));
    
    }
}
