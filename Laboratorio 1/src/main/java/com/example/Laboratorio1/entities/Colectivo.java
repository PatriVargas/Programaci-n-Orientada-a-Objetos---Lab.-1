package com.example.Laboratorio1.entities;

//Clase Colectivo que extiende de Vehiculo

public class Colectivo extends Vehiculo {
    private Radio radio;

    //Constructor

    public Colectivo(String color, String marca, String modelo) {
        super(color, marca, modelo);
        this.radio = null;
    }

    //Getters y Setters

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
