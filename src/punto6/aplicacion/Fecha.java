/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto6.aplicacion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Fecha {
     public void mostarDiferencia() throws ParseException{
    
    int cont=0;
    String a,b;    
    Calendar FechaUno=Calendar.getInstance();
    Calendar FechaDos=Calendar.getInstance();
        Scanner scan = new Scanner(System.in);
       try{ 
        System.out.println("Ingrese fecha uno (dd/MM/yy)");
         a=scan.next();
           
           Date sdf=new SimpleDateFormat("dd/MM/yy").parse(a);
           SimpleDateFormat SD = new SimpleDateFormat("dd/MM/yy");
           FechaUno.setTime(sdf);
        
         System.out.println("Ingrese fecha dos (dd/MM/yy)");
         b=scan.next();
           
           Date sdf2=new SimpleDateFormat("dd/MM/yy").parse(b);
           FechaDos.setTime(sdf2);
         
        
        do{
      
      FechaUno.add(Calendar.DAY_OF_MONTH ,1);
      cont++;
      }while(FechaUno.before(FechaDos)||FechaUno.equals(FechaDos));
       System.out.println("La diferencia es de "+cont+" dias");
              
            
       }catch(Exception e){
           System.out.println("Error,Debe ingresar la fecha en el formato (dd/MM/yy)");
        }
       
        
        
    
     }
}
