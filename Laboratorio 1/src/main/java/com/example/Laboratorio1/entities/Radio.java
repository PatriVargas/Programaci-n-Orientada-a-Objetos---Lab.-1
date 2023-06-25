package com.example.Laboratorio1.entities;

public class Radio {
    private String marca;
    private int potencia;


    //Constructor

    public Radio(String marca, int potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }


    //Getters y Setters

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public int getPotencia(){
        return potencia;
    }

    public void setPotencia(int potencia){
        this.potencia = potencia;
    }

}
    

