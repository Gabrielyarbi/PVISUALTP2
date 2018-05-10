/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5fecha.aplicacion;

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
     public void calcularSemana() throws ParseException{ 
    Scanner scan=new Scanner(System.in);
    
        String a;
        Calendar fechaNac=  Calendar.getInstance();
        Calendar fechahoy = Calendar.getInstance();
        try{
        System.out.println("Ingrese Fecha de naciemiento(dd/MM/yyyy)");
        a=scan.next();
        
        Date sdf = new SimpleDateFormat("dd/MM/yyyy").parse(a);
        fechaNac.setTime(sdf);
         
         
         long milisec = fechahoy.getTimeInMillis()-fechaNac.getTimeInMillis();
        long dia = milisec / 1000 / 60 / 60 / 24;
        long Sem=dia/7;
        System.out.println("Su edad en semanas es :"+Sem);
        }catch(Exception e){
            System.out.println("Error debe ingresar la fecha en formato (dd/MM/yyyy)");
        }
        }
    
    public void mostrarFecha () throws ParseException{
        String a,m;
        Calendar FechaUno=Calendar.getInstance();
        Calendar FechaDos=Calendar.getInstance();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese fecha uno (menor)en formato dd/MM/yyyy");
       a=scan.next();
          Date sdf=new SimpleDateFormat("dd/MM/yyyy").parse(a);
          FechaUno.setTime(sdf);
        System.out.println("Ingrese fecha dos (mayor)en formato dd/MM/yyyy");
       m=scan.next();
          Date sdf2=new SimpleDateFormat("dd/MM/yyyy").parse(m);
          FechaDos.setTime(sdf2);
          if (FechaDos.after(FechaUno)){
           do{
                   System.out.println((FechaUno.getTime()));
           FechaUno.add(Calendar.DAY_OF_MONTH, 1);
       
           
           }while(FechaUno.before(FechaDos)||FechaUno.equals(FechaDos));
            
            }
                                            
                                            
                  }
    public void contarDom() throws ParseException{
    int Acum;
    int cont=0;
    String f1,f2;
        Calendar FechaUno =Calendar.getInstance();
        Calendar FechaDos=Calendar.getInstance();
        Scanner scan = new Scanner(System.in);
    try{
        System.out.println("Ingrese fecha uno (dd/MM/yyyy )");
        f1=scan.next();
        SimpleDateFormat sdf =new SimpleDateFormat("dd/MM/yyyy");
        FechaUno.setTime(sdf.parse(f1));
        System.out.println(sdf.format(FechaUno.getTime()));
        System.out.println("Ingrese fecha dos (dd/MM/yyyy)");
        f2=scan.next();
        FechaDos.setTime(sdf.parse(f2));
        System.out.println(sdf.format(FechaDos.getTime())); 
       if (FechaDos.after(FechaUno)){
           do{
                FechaUno.add(Calendar.DAY_OF_MONTH, 1);
                Acum = FechaUno.get(Calendar.DAY_OF_WEEK);
            if(Acum==1){
               cont++;
               
               }
              }while(FechaUno.before(FechaDos)||FechaUno.equals(FechaDos));
            System.out.println("La cantida de domingos son: "+cont);
            }
            }catch(Exception e){System.out.println("Error debe ingresar la fecha en formato dd/MM/yyyy ");}  
    }
   public void mostarEstacion () throws ParseException{
       String a; 
       Scanner scan = new Scanner(System.in);
       Calendar f = Calendar.getInstance();
       
       Calendar o = Calendar.getInstance();
       o.set(2018, 2, 21);
       Calendar i = Calendar.getInstance();
       i.set(2018, 5, 21);
       Calendar v = Calendar.getInstance();
       v.set(2018, 11, 21);
       Calendar p = Calendar.getInstance();
       p.set(2018,8, 21);
       try{
       System.out.println("Ingrese una fecha (dd/MM/yyyy) ");
       a=scan.next();
       Date sdf =new SimpleDateFormat("dd/MM/yyyy").parse(a);
       f.setTime(sdf);
      int dia= f.get(Calendar.DAY_OF_YEAR);
      
      if((dia>=o.get(Calendar.DAY_OF_YEAR)) &&( dia < i.get(Calendar.DAY_OF_YEAR))){
          System.out.println("Otoño");}
          else{if((dia>=i.get(Calendar.DAY_OF_YEAR)) && (dia<p.get(Calendar.DAY_OF_YEAR))){
                        System.out.println("Invierno");}
                                            else{
                        if((dia>=p.get(Calendar.DAY_OF_YEAR)&&(dia<v.get(Calendar.DAY_OF_YEAR)))){
                            System.out.println("Primavera");}
                                            else{
                            System.out.println("Verano");}
                        }
              }
      
       }catch(Exception e){System.out.println("Error debe ingresar la fecha en formato (dd/MM/yyyy)");}
       }         
}
