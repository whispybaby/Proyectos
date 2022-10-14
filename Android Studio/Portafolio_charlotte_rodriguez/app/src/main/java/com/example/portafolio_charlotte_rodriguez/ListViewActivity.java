package com.example.portafolio_charlotte_rodriguez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListViewActivity extends AppCompatActivity {
    private ListView nombres;
    private TextView numeros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        nombres = findViewById(R.id.id_nombres_agenda_telefonica);
        numeros = findViewById(R.id.id_numero_agenda_telefonica);

        String[] lista_nombres = {"Karen Garces", "Alfonso leon", "Rafaella Toledo", "Unax Franco", "Adan Solano" , "Ariana Singh", "Francis Garces", "Geraldo leon"};
        String[] lista_numeros = {"1111111111", "222222222", "33333333" , "5977098743"  , "59773409843", "59770987454", "11312311111", "254534222" };

        ArrayAdapter adaptador = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, lista_nombres);
        nombres.setAdapter(adaptador);
        nombres.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                numeros.setText(lista_numeros[position]);
            }
        });
    }
}