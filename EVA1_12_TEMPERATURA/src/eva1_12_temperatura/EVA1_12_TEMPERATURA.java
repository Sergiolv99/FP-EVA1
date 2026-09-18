/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_temperatura;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_12_TEMPERATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double kelvin, celcius,fahrenheit;
         Scanner captu = new Scanner(System.in);
         
        
        System.out.println("captura los grados Kelvin");
        kelvin= captu.nextDouble();
       
        celcius = kelvin - 273.15; //Aqui si importa el parentesis
        fahrenheit= 1.8 * (kelvin -273.15)+ 32; //ojo: 5/9 da cero, 5/9.0 da 0.5
        System.out.println(kelvin+ "k ="+ celcius + "c=");
         System.out.println(kelvin+ "k ="+ fahrenheit + "f=");
    }
    
}
