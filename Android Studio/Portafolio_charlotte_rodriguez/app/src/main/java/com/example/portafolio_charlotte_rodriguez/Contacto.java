package com.example.portafolio_charlotte_rodriguez;

public class Contacto {
    private String nombre;
    private String numero;



    public Contacto(String  numero, String nombre){
        this.nombre = nombre;
        this.numero = numero;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
