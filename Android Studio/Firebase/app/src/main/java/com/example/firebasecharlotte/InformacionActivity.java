package com.example.firebasecharlotte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.firebasecharlotte.DAO.Contacto;
import com.example.firebasecharlotte.DAO.DAOContacto;

public class InformacionActivity extends AppCompatActivity {
    EditText nombre;
    EditText numero;
    String id;
    Contacto contacto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
        nombre = findViewById(R.id.nombre);
        numero = findViewById(R.id.numero);
        Bundle uwu = getIntent().getExtras();
        contacto =(Contacto) uwu.get("contacto");
        id = contacto.getID();
        String nombreContacto = contacto.getNombre();
        String numeroContacto = contacto.getNumero();
        nombre.setText(nombreContacto);
        numero.setText(numeroContacto);
    }
    public void eliminar(View view){
        DAOContacto daoContacto = new DAOContacto();
        daoContacto.getReferencia().child(contacto.getID()).removeValue();
        finish();
    }

    public  void actualizar(View view){
        String nombresito = nombre.getText().toString();
        String numerito = numero.getText().toString();
        Contacto contactito = new Contacto(nombresito, numerito);
        contactito.setID(id);

        DAOContacto dao =new DAOContacto();
        dao.actualizarcontacto(contactito);
        finish();
    }

}