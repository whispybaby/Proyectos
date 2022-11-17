package com.example.firebasecharlotte;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ScrollView;

import com.example.firebasecharlotte.DAO.Contacto;
import com.example.firebasecharlotte.DAO.DAOContacto;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class VistaContactoActivity extends AppCompatActivity {
    public ScrollView listacontactos ;

    private ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_contacto);
        //Asigna la lista de contacto a ScrollView
        listacontactos = findViewById(R.id.ScrollView);
        //listavista =findViewById(R.id.Listview);

        adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        //listaContactos.setAdapter(adaptador);

        DAOContacto dao = new DAOContacto();

        //Añadir  un escuchador de evento de firebase
        dao.getReferencia().addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                adaptador.clear();
                //Iterar por cada uno de los contactos
                for (DataSnapshot contacto_actual : snapshot.getChildren()){
                    Contacto contacto = contacto_actual.getValue(Contacto.class);
                    //  Agrega los datos si no esta nulo
                    if (contacto != null) {
                        adaptador.add(contacto.getNombre());

                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }

        public void iniciarAgregarContacto(View view) {
            Intent i = new Intent(this, AgregarContactoActivity.class);
            startActivity(i);
        }
        public void iniciarVistaContacto(View view) {
            Intent i = new Intent(this, VistaContactoActivity.class);
            startActivity(i);
        }
    }