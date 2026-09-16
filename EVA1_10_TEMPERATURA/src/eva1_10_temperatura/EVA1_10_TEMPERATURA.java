/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_temperatura;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_10_TEMPERATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double temp, kelvin, far;
        Scanner captu = new Scanner(System.in);
        //Solicita los datos as usuario
        System.out.println("Introduce la temperatura a centigrados");
        temp= captu.nextDouble();
       
        far = temp *1.8 + 32;
        kelvin = temp + 273.15;
        System.out.println(temp+ "c ="+ far + "f=");
         System.out.println(temp+ "c ="+ kelvin + "k=");
     
        
        
        
    }
    
}
