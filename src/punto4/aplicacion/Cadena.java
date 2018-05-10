/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto4.aplicacion;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Cadena {
     public void mostrarVocales(){
        String cad;
         Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una cadena para contar sus vocales");
         cad=scan.next();
    int acum=0;
    
        
    for (int i=0;i < cad.length();i++){
    
  
        
       if((cad.charAt(i)=='a') || (cad.charAt(i)=='e') || (cad.charAt(i)=='i') || (cad.charAt(i)=='o') || (cad.charAt(i)=='u')){
      
        acum++;
       }
      
        
    }
    System.out.println("La cantidad de vocales es "+acum);
    }
    public void invertirCadena(){
        String Cadena1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una cadena para invertirla");
        Cadena1=scan.next();
        char [] c =Cadena1.toCharArray();
        for(int i=Cadena1.length()-1 ; i > -1; i--) {
           
            System.out.print(c[i]);
            
    }
    System.out.println("");
    }
    public void contarCaracter(){
    
    String cad;
    String car2;
    Scanner scan=new Scanner(System.in);    
    System.out.println("Ingrese una cadena (sin espacios)");
    cad=scan.next();
        System.out.println("Ingrese caracter a buscar en la cadena");
         car2=scan.next();
        char car=car2.charAt(0);
    int acum=0;
        for (int i =0 ; i < cad.length() ;i++){
        
           if (cad.charAt(i)==car){
               acum++;
           }
        }
        System.out.println(cad);
    System.out.println("El caracter '"+car+"' se repite "+acum+" veces");}

    }
    
