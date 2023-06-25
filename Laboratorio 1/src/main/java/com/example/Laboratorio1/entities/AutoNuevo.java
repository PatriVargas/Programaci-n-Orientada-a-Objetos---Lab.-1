package com.example.Laboratorio1.entities;

//Clase AutoNuevo que extiende de Vehiculo

public class AutoNuevo extends Vehiculo {
    private Radio radio;

    //Constructor

    public AutoNuevo(String color, String marca, String modelo) {
        super(color, marca, modelo);
        this.radio = new Radio("Phillips",100);        
    }

    //Getter y Setter de radio

    public Radio getRadio(){
        return radio;
    }

    public void setRadio(Radio radio){
        this.radio = radio;
    }

    //Implementación de métodos abstractos 

    @Override
    public void agregarRadio(Radio radio){
        this.radio = radio;
    }

    @Override
    public void cambiarRadio(Radio radio){
        this.radio = radio;
    }
   
}
