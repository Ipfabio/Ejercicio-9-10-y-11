package org.example.Builder;

public class Vehiculo implements Cloneable{

    public String marca;

    public String tipo;

    public String motor;

    public int puertas;

    public String getMarca() {return marca;}

    public String getTipo() {return tipo;}

    public String getMotor() {return motor;}

    public int getPuertas() {return puertas;}

    public Vehiculo clonar() throws CloneNotSupportedException{
        return (Vehiculo) this.clone();
    }

}
