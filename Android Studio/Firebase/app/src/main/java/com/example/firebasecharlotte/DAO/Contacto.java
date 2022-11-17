package com.example.firebasecharlotte.DAO;

public class Contacto {
    private String nombre;
    private String numero;
    public  Contacto(){

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


