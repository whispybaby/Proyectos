package com.example.portafolio_charlotte_rodriguez;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.portafolio_charlotte_rodriguez.DAO.Contacto;
import com.example.portafolio_charlotte_rodriguez.DAO.DAOcontacto;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

public class AgendaActivity extends AppCompatActivity {
    private ListView listaContactos;
    private ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);

        //Asignar el listView a su elemento correspondiente en el .xml
        listaContactos = findViewById(R.id.agLvListView);
        //Asignar el adaptador con el contexto, ademas de indicar que tendra el estilo de
        // un elemento simple de una lista
        adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        //Vincular el listView con el adaptador
        listaContactos.setAdapter(adaptador);

        //Logica de firebase
        DAOcontacto dao = new DAOcontacto();
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


    public void iniciar_data_base(View view) {
        Intent i8 = new Intent(this, Firebase.class);
        startActivity(i8);
    }
}