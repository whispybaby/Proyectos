package com.example.portafolio_charlotte_rodriguez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Firebase extends AppCompatActivity {
    private EditText nombrecontactouwu, numerocontactouwu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase);
        nombrecontactouwu = findViewById(R.id.nombre_contacto);
        numerocontactouwu = findViewById(R.id.numero_contacto);
   }

   public void  AgregarContacto(View view){
        String nombre = nombrecontactouwu.getText().toString();
        String numero = numerocontactouwu.getText().toString();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference referencia = database.getReference("usuarios");

        Contacto contacto = new Contacto(nombre, numero);
        referencia.push().setValue(contacto);
    }
}