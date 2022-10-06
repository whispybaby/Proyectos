package com.example.portafolio_charlotte_rodriguez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Contador extends AppCompatActivity {
    TextView numero;
    RadioButton radioAumenta, radioReincia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador);
        numero = findViewById(R.id.id_incremental);
        radioAumenta = findViewById(R.id.id_contador);
        radioReincia = findViewById(R.id.id_reinciador);
    }
    public void  contar (View view){
        int  contador = 0;
         if ( radioAumenta.isChecked()){
            contador = contador  + 1;
        }
         else if (radioReincia.isChecked()){
             contador = contador - contador;
         }

}
    }
