/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo04 {
    public static void main(String[] args) {
        String nombreEstudiante = "René Rolando";
        String apellidoEstudiante = "Elizalde Solano";
        int nacimiento = 1983;
        
        // Diferencias entre println y print
        
        // Print imprime un valor y no se salta de linea, sigue imprimiendo mas valores en una misma linea
        System.out.print(nombreEstudiante + " ");
        System.out.print(apellidoEstudiante + " ");
        System.out.print(nacimiento + " ");
        System.out.print(nombreEstudiante + " ");
        
        System.out.println("-------------------");
        
        // Println imprime un valor y automaticamente salta de linea
        System.out.println(nombreEstudiante + " ");
        System.out.println(apellidoEstudiante + " ");
        System.out.println(nacimiento + " ");
        System.out.println(nombreEstudiante + " ");
        
        
        
       
        
        
    }
}
