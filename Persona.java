/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frecuenciacardiaca;

/**
 *
 * @author Cesar Perez
 */


public class Persona {

//Variables de instancia    
    private String nombre;
    private String apellido;
    private int dia;
    private String mes;
    private int anio;
    
 
   //Constructor 
public Persona(String nombre, String apellido, String mes, int dia, int anio){
    
    this.nombre= nombre;
    this.apellido= apellido;
    this.mes= mes;
    this.dia= dia;
    this.anio= anio;
    
}



//Metodo que calcula la edad de la persona
public int edadPersona(){
    
    int edad= 2023- anio;
    
    return edad;
}


//Metodo que calcula la frecuencia cardiaca
public double frecuencia(){
    
    int edad= 2023-anio;
    int cardio= 220-edad;
    
    return cardio;
   
}


//Metodo que calcula el rango de frecuencia cardiaca
public double frecuenciaEsperada(){
    
    int edad= 2023- anio;
    int cardio= 220-edad;
    double frecuencia= cardio*0.675;
    
    return frecuencia;
    
}


//Setters y Getters
public void setNombre(String nombre){
    this.nombre= nombre;
}


public String getNombre(){
    return nombre;
}



public void setApellido(String apellido){
    this.apellido= apellido;
}


public String getApellido(){
    return apellido;
}


public void setDia(int dia){
    this.dia= dia;
}


public int getDia(){
    return dia;
}


public void setMes(String mes){
    this.mes= mes;
}


public String getMes(){
    return mes;
}


public void setAnio(int anio){
    this.anio= anio;
}


public int getAnio(){
    return anio;
}

    
}



