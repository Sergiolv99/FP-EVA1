/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_4_captura_otravez;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class EVA1_4_CAPTURA_OTRAVEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // SI VAMOS A USAR VARIABLES, SE TIENEN QUE "DECLARAR" ANTES DE USAR
        // DECLARAR--> CREAR LA VARIABLE PARA SU USO EN EL PROGRAMA
        //USAR NOMBRES SIGNIFICATIVOS --> DEBE DECIR PARA QUE SE USA
        String nombre;// declaracion de la variedad;
        
        System.out.print("captura el nombre:");
        //
        Scanner captu = new Scanner(System.in);
        //captura del teclado y ponerlo en la variable nombre
        //escribir en la variable (oner un valor) ASIGNACION
        nombre = captu.nextLine();
        System.out.println("El valor capturado es ");
        System.out.println(nombre);//USO LA VARIABLE -->LECTURA
                
    }
    
}
