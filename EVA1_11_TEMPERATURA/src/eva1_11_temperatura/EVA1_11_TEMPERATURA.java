/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_temperatura;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_11_TEMPERATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double far, celcius,kelvin;
         Scanner captu = new Scanner(System.in);
         
        
        System.out.println("captura los grados a farenhit");
        far= captu.nextDouble();
       
        celcius = (far - 32) /1.8; //Aqui si importa el parentesis
        kelvin = (far - 32) * (5/9.0) + 273.15; //ojo: 5/9 da cero, 5/9.0 da 0.5
        System.out.println(far+ "f ="+ celcius + "c=");
         System.out.println(far+ "f ="+ kelvin + "k=");
    }
    
}
