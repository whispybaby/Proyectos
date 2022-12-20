package com.example.evaluacion3charlotterodriguez.DAO;

import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DAOUsuario {
    private final DatabaseReference referencia;

    public DAOUsuario() {
        referencia = FirebaseDatabase.getInstance().getReference("usuario");
    }

    public DatabaseReference getReferencia() {
        return referencia;
    }

    public void InsertarUsuario(Usuario usuario) {
        referencia.child(usuario.getRut()).setValue(usuario);
    }

    public void ActualizarUsuario(Usuario usuario) {
        String Rut = usuario.getRut();
        referencia.child(Rut).setValue(usuario);
    }

    public void Eliminarusuario(String rut) {
        referencia.child(rut).removeValue();
    }


}
