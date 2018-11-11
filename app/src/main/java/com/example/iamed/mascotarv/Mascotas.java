package com.example.iamed.mascotarv;

public class Mascotas {
    private String nombre;
    private String rate;
    private int foto;

    public Mascotas(int foto, String nombre, String rate) {
            this.nombre=nombre;
            this.rate=rate;
            this.foto=foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
