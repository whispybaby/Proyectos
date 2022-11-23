package com.example.firebasecharlotte;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.firebasecharlotte.DAO.Contacto;
import com.example.firebasecharlotte.DAO.DAOContacto;

public class AgregarContactoActivity extends AppCompatActivity {
    private EditText nombrecontactouwu, numerocontactouwu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_contacto);
        nombrecontactouwu = findViewById(R.id.nombre_contacto1);
        numerocontactouwu = findViewById(R.id.numero_contacto);
    }
    public void  AgregarContacto(View view){
        String nombre = nombrecontactouwu.getText().toString();
        String numero = numerocontactouwu.getText().toString();


        Contacto contacto = new Contacto(nombre, numero);
        DAOContacto enviodao = new DAOContacto();
        enviodao.InsertarContacto(contacto);
    }
}