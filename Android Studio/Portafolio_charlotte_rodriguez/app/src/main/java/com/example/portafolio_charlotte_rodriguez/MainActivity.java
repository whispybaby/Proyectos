package com.example.portafolio_charlotte_rodriguez;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void iniciar_calculador(View view) {
        Intent i = new Intent(this, calculadora.class);
        startActivity(i);
    }

    public void iniciar_calculadora1(View view) {
        Intent i1 = new Intent(this, calculadora_pro.class);
        startActivity(i1);
    }

    public void iniciar_evaluacion(View view){
        Intent i2 = new Intent(this, Evaluacion.class);
        startActivity(i2);
    }

    public void iniciar_calculadora_binaria(View view){
        Intent i3 = new Intent(this, Binario.class);
        startActivity(i3);
    }
    public void iniciar_checkbox(View view){
        Intent i4 = new Intent(this, Checkbox.class);
        startActivity(i4);
    }
}