package com.example.evaluacion3charlotterodriguez.DAO;

import android.provider.ContactsContract;

public class Usuario {
    private String Rut;
    private String nombre;
    private String correo;

    public String getRut() {
        if (Rut == null) {
            return "Error al obtener el rut";
        } else {
            return Rut;
        }
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuario() {
    }

    public Usuario(String rut, String nombre, String correo) {
        this.Rut = rut;
        this.nombre = nombre;
        this.correo = correo;

    }

    public String getCorreo() {
        if (correo == null) {
            return "Error al obtener el correo";
        } else {
            return correo;
        }
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return  Rut + "\n" + nombre +"\n"+ correo;
    }
}

