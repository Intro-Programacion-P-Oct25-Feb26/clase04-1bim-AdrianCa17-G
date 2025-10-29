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
public class Ejemplo061 {
    public static void main(String[] args) {
        // Uso de printf
        // f: formato
        
        String nombreEstudiante = "Adrian Steven";
        String apellidoEstudiante = "Guaman Carrion";
        int edad = 17;
        String direccion = "Pitas II";
        String universidad = "Universidad Tecnica Particular de Loja";
        int ciclo = 1;
        String asignatura = "Introduccion a la programacion";
        String paralelo = "A";
        
        // System.out.println(nombreEstudiante+" "+apellidoEstudiante+ " "+ 
        // nacimiento);
        // En printf; 
        // usamos %s para reemplazar las cadenas, enteros, decimales
        // usamos %d para reemplazar los valores enteros
        // usamos %f para reemplazar los valore decimales
        // System.out.printf("%s\n\n%s\n\n%s\n", nombreEstudiante, 
        //        apellidoEstudiante, nacimiento);
        System.out.printf("Nombre:\n\t%s\n Apellido: \n\t%s\n Edad:\t%d\n Direccion:\n\n\t%s\n ----\n Universidad:\t%s\n Ciclo:\t%d\n Asignatura:\t%s\n Paralelo:\n\t%s\n", nombreEstudiante, 
                apellidoEstudiante, edad, direccion, universidad, ciclo, asignatura, paralelo);
        
    }
}
