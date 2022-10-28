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

    public void inciar_contador(View view){
        Intent i5 = new Intent(this, Contador.class);
        startActivity(i5);
    }
    public void iniciar_spinner(View view){
        Intent i6 = new Intent( this, SpinnerActivity.class);
        startActivity(i6);
    }

    public void iniciar_list_view(View view){
        Intent i7 = new Intent( this, ListViewActivity.class);
        startActivity(i7);
    }

    public void iniciar_data_base(View view){
        Intent i8 = new Intent( this, Firebase.class);
        startActivity(i8);
    }

    public void iniciar_agenda(View view){
        Intent i9 = new Intent( this, AgendaActivity.class);
        startActivity(i9);
    }

}