/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5.aplicacion;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Stringg {
     public void compararIgual (){
    java.lang.String a,b;
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese primera cadena");
        a=scan.next();
        System.out.println("Ingrese segunda cadena");
        b=scan.next();
       
       if ( a.equals(b)){
           System.out.println("Las cadenas son iguales");
       }
       else{
       
           System.out.println("Las cadenas no son iguales");
            }      
    }
    
    
    public void comparar(){
     java.lang.String a,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese primera cadena");
        a=scan.next();
        System.out.println("Ingrese segunda cadena");
        b=scan.next();
    
    int r=a.compareTo(b);
        System.out.println(""+r);
        if (r != 0){
            System.out.println("Las cadenas no son iguales");}else{
        
            System.out.println("Las cadenas son iaguales");
        
        }
    }
    public void convertirCadena(){
    java.lang.String cad="Hola este metodo convierte una cadena de caracteres en un arreglo de cararcteres";
    char Cad[]=cad.toCharArray();
    for(int i =0;i<cad.length();i++)
            System.out.print(Cad[i]);
            System.out.println("");
    }
    public void medirCadena(){
    java.lang.String C1="holamundo";
    java.lang.String C2="Mi nombre es gabriel";
        System.out.println(C1);
        System.out.println(C2);
        System.out.println("Este metodo simplemente mide la longitud de las cadenas");
        int a=C1.length();
        int b=C2.length();
        System.out.println("La cadena uno mide: "+a);
        System.out.println("La cadena dos mide: "+b);
    
    
    }
    public void concatenar(){
    java.lang.String cadenauno="Casa blanca";
    java.lang.String c2="Hola mundo";
        System.out.println("Este metodo concatena las cadenas ");
        System.out.println("La cadena uno es : "+cadenauno);
        System.out.println("La cadena dos es : "+c2);
        System.out.println("y la concatenacion de estas es : "+cadenauno.concat(c2));
       }
    
    public void indicarCadena(){
    java.lang.String C1="Hola mundo";
        System.out.println("Con este metodo se hace un indice con la cadena es decir que si se le indica el 0 devuelve la primer letra 1 la segunda etc");
        System.out.println("La cadena es : "+C1);
        System.out.println("si quiero que devuelva la primer letra pongo 0");
        System.out.println("y devuelve lo siguiente : "+C1.charAt(0));
        
    
    }
    public void extraerSubcadena(){
    java.lang.String c="Murcielago";
        System.out.println("Este metodo extrae una subcadena de una cadena");
        System.out.println("La cadena es : "+c);
        System.out.println("Si quiero las primera cuatro letras pongo un rango de 0,4");
        System.out.println("Y da lo siguiente : "+c.substring(0,4));
    
    }
    public void buscarEnCadena(){
    java.lang.String a="Hello world";
    java.lang.String b="w";
        System.out.println("Este metodo busca una cadena o letra en otra cadena");
        System.out.println("Si no la encuentra devuelve -1, Si la encuentra devolera el numero de la posicion donde la encontro");
        System.out.println("Como ejemplo vamos a buscar "+b+" dentro de la cadena uno que es :"+a);
        System.out.println("El metodo devuelve : "+ a.indexOf(b));
        
    
    
    }
    
}
