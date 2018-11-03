package com.example.iamed.mascotarv;

public class Mascotas {
    String nombre;
    int rate;

    public Mascotas(String nombre, int rate) {
            this.nombre=nombre;
            this.rate=rate;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
