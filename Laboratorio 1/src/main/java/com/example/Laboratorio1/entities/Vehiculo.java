package com.example.Laboratorio1.entities;

public abstract class Vehiculo {
    //Un Vehículo siempre tiene, Atributos: color, marca, modelo
    //Un Vehículo no siempre tiene precio

    private String color;
    private String marca;
    private String modelo;
    private double precio;


    //Constructores

    public Vehiculo(String color, String marca, String modelo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = 0.0;
    }

   

    @Override
    public String toString() {
        return "Vehiculo [color=" + color + ", marca=" + marca + ", modelo=" + modelo + "]";

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    //Una Radio siempre solo puede estaren un Vehículo a la vez.
    //En todos los Vehículos se puede agregar una Radio.

    public abstract void agregarRadio(Radio radio);

    public abstract void cambiarRadio(Radio radio);

}
