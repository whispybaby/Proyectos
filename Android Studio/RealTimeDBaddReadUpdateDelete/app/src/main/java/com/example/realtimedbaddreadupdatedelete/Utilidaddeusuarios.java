package com.example.realtimedbaddreadupdatedelete;

public class Utilidaddeusuarios {
    String usuarioID;
    String usuarioNombre;
    String usuarioEmail;
    String usuarioCiudad;

    public Utilidaddeusuarios() {
    }

    public Utilidaddeusuarios(String usuarioID, String usuarioNombre, String usuarioEmail, String usuarioCiudad){
        this.usuarioID = usuarioID;
        this.usuarioCiudad = usuarioCiudad;
        this.usuarioEmail = usuarioEmail;
        this.usuarioNombre = usuarioNombre;
    }

    public String getUsuarioNombre() {
        return usuarioNombre;
    }

    public void setUsuarioNombre(String usuarioNombre) {
        this.usuarioNombre = usuarioNombre;
    }

    public String getUsuarioCiudad() {
        return usuarioCiudad;
    }

    public void setUsuarioCiudad(String usuarioCiudad) {
        this.usuarioCiudad = usuarioCiudad;
    }

    public String getUsuarioEmail() {
        return usuarioEmail;
    }

    public void setUsuarioEmail(String usuarioEmail) {
        this.usuarioEmail = usuarioEmail;
    }

    public String getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(String usuarioID) {
        this.usuarioID = usuarioID;
    }
}
