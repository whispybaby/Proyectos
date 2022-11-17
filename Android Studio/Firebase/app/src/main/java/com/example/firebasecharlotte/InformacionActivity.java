package com.example.firebasecharlotte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.firebasecharlotte.DAO.Contacto;

public class InformacionActivity extends AppCompatActivity {
    TextView nombre;
    TextView numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
        nombre = findViewById(R.id.nombre);
        numero = findViewById(R.id.numero);
        Bundle uwu = getIntent().getExtras();
        Contacto contacto =(Contacto) uwu.get("contacto");
        String nombreContacto = contacto.getNombre();
        String numeroContacto = contacto.getNumero();

        nombre.setText(nombreContacto);
        numero.setText(numeroContacto);
    }
}