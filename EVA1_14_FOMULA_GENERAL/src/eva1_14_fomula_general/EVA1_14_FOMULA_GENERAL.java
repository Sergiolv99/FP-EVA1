/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_fomula_general;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_14_FOMULA_GENERAL {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          double a,b,c, x1,x2;
        String Nombre;
         Scanner captu = new Scanner(System.in);
         
         
          System.out.println("captura el a");
          a= captu.nextDouble();
          
          System.out.println("captura el b");
          b= captu.nextDouble();
          
          System.out.println("captura el c");
          c= captu.nextDouble();
          
          //Calcular resultados
          x1= (-1*b + Math.sqrt((b*b) - (4*a*b))) / (2*a);
          x2= (-1*b - Math.sqrt((b*b) - (4*a*b))) / (2*a);
          
        System.out.println("a=:"+ a);
        System.out.println("el b=:" + x2);
        System.out.println("el c=:" + c);
        System.out.println("el x1 es :"+ x1);
        System.out.println("el x2 es:" + x2);
         System.out.println("Sergio Lucero Valdiviezo:");
       
         
    }
    
}
