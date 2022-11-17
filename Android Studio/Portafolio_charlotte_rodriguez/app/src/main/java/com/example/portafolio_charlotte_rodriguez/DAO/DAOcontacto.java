package com.example.portafolio_charlotte_rodriguez.DAO;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.portafolio_charlotte_rodriguez.Firebase;
import com.example.portafolio_charlotte_rodriguez.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class DAOcontacto {
    private  final DatabaseReference referencia;

    public  DAOcontacto(){
        referencia = FirebaseDatabase.getInstance().getReference("contactos");
    }
    public  DatabaseReference getReferencia(){
        return  referencia;
    }
    public  void InsertarContacto(Contacto contacto){
        referencia.push().setValue(contacto);
    }


}


