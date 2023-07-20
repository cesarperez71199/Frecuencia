/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frecuenciacardiaca;

import java.util.Scanner;

/**
 *
 * @author Cesar Perez
 */
public class FrecuenciaCardiaca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada= new Scanner(System.in);
        
        
    //Pide datos al usuario desde teclado
        System.out.println("Dame tu nombre:");
            String nombre= entrada.nextLine();
            
        System.out.println("Dame tu Apellido:");
            String apellido= entrada.nextLine();
            
            
        System.out.println("Dame tu mes de nacimiento (con caracteres):");
            String mes= entrada.nextLine();
         
           
        System.out.println("Dame tu dia de nacimiento:");
            int dia= entrada.nextInt();
            
        System.out.println("Dame tu año de nacimiento:");
            int anio= entrada.nextInt();
            
           
            
        //Crea un objeto paciente1 para llamar a los metodos de la clase persona
            Persona paciente1= new Persona(nombre, apellido, mes, dia, anio);
            
            
        //Imprime los resultados del programa
        System.out.printf("La persona %s %s con edad %s%n", paciente1.getNombre(),paciente1.getApellido()
                            ,paciente1.edadPersona());
        
        System.out.printf("Tiene una Frecuencia cardiaca de: %s %ny un rango de frecuencia cardiaca de: %s "
                            , paciente1.frecuencia(),paciente1.frecuenciaEsperada());
                 
            
    }
    
}


