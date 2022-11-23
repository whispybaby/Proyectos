package com.example.firebasecharlotte.DAO;

import java.io.Serializable;

public class Contacto implements Serializable {
    private String ID;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    private String nombre;
    private String numero;


    @Override
    public String toString() {
        if (nombre == null){
            return "Error al obtener el nombre";
        }
        else {
            return nombre;
        }

    }

    public  Contacto() {
    }

    public Contacto(String  nombre, String numero){
        this.nombre = nombre;
        this.numero = numero;
    }
    public String getNombre() {
        if (nombre == null){
            return "Error al obtener el nombre";
        }
        else {
            return nombre;
        }
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        if (numero == null){
            return "Error al obtener el numero";
        }
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}


