/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_circulo;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_13_CIRCULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radio,perimetro,area, volumen;
         Scanner captu = new Scanner(System.in);
         
        
        System.out.println("captura el radio");
        radio= captu.nextDouble();
       
        perimetro = 2 * 3.14159 * radio; 
        area = 3.14159 * (radio * radio);
        volumen =(3/4.0)*3.14159 * (radio*radio*radio);
        System.out.println("el perimetro es:"+ perimetro);
        System.out.println("el area es:"+ area);
        System.out.println("el volumen es:" + volumen);
        System.out.println("soy el mejor");
    }
    
}
