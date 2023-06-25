package com.example.Laboratorio1.test;

import com.example.Laboratorio1.entities.AutoClasico;
import com.example.Laboratorio1.entities.AutoNuevo;
import com.example.Laboratorio1.entities.Colectivo;
import com.example.Laboratorio1.entities.Radio;
import com.example.Laboratorio1.entities.Vehiculo;

//Clase TestVehiculo para mostrar el funcionamiento con objetos Mocks

public class TestVehiculo {

    public static void main(String[]args){

        //Crear objetos Mocks para demostración 

        Vehiculo autoClasico = new AutoClasico("Negro", "Chevrolet", "Impala");
        Vehiculo autoNuevo = new AutoNuevo("Azul", "Toyota", "Corolla");
        Vehiculo Colectivo = new Colectivo("Blanco", "Mercedez-Benz","0-500");
        Radio radio1 = new Radio("Sony", 100);
        Radio radio2 = new Radio("Pioneer", 150);

        //Demostración de agregar radio

        autoClasico.agregarRadio(radio1);
        autoNuevo.agregarRadio(radio2);
        Colectivo.agregarRadio(radio1);

        //Demostración de cambiar radio

        autoClasico.cambiarRadio(radio2);
        autoNuevo.cambiarRadio(radio1);
        Colectivo.cambiarRadio(radio2);

   }
    
}
