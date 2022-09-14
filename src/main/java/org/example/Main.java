package org.example;

import org.example.Builder.CocheBuilder;
import org.example.Builder.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo coche = new CocheBuilder("Ford")
                .setPuertas(5)
                .setMotor("Electrico")
                .build();

        System.out.println("Original: " + coche.getMarca() + " tipo "+ coche.getMotor() + " " + coche.getPuertas() + " puertas");

        try{
            Vehiculo clonado = coche.clonar();
            clonado.puertas = 3;
            System.out.println("Clonado: " + clonado.getMarca()+ " tipo "+ clonado.getMotor() + " " + clonado.getPuertas() + " puertas");
        }catch (CloneNotSupportedException e){
            System.out.println("No se puede clonar: " + e.getMessage());
        }
    }
}
