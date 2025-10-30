/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo11 {

    public static void main(String[] args) {
        // Ingreso de valores por teclado
        // La libreria scanner me permite poder ingresar datos de una variable a traves del teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // para ingresar los decimales con 
                                        // punto
                                        // no con coma
        // declarar las variables
        String nombreAsignatura1;
        double notaAsignatura1;
        
        System.out.println("Ingrese nombre de asignatura 1");
        nombreAsignatura1 = entrada.nextLine();  // nextLine me permite recibir una cadena
        System.out.println("Ingrese nota de asignatura 1");
        notaAsignatura1 = entrada.nextDouble();
        
        
        System.out.printf("Asignatura 1: %s\nNota 1:%.1f \n", 
                // %.2f significa que recibe un decimal y me va a dar 2 decimales despues de la coma,depende que numero ponga
                nombreAsignatura1,
                notaAsignatura1
        );
    }
                
    }
    

