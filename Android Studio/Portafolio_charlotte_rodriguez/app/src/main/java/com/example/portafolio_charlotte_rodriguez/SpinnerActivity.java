package com.example.portafolio_charlotte_rodriguez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinnerActivity extends AppCompatActivity {
    private EditText numero1, numero2;
    private Spinner lista;
    private TextView mostrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        numero1 = findViewById(R.id.ednSpinerNum1);
        numero2 = findViewById(R.id.ednSpinerNum2);
        lista = findViewById(R.id.MetodoSpinner);
        mostrar = findViewById(R.id.tvSpinnerResultado);
        //si lo dejo como spinner no me pesca D:

        String[] opciones = {"Sumar", "Restar", "Multiplicar", "Dividir",};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item,
                opciones);
        lista.setAdapter(adaptador);
    }

    public  void OperarSpinner(View view) {
        int num1 = Integer.parseInt(numero1.getText().toString());
        int num2 = Integer.parseInt(numero2.getText().toString());
        String seleccion = lista.getSelectedItem().toString();

        if(seleccion.equals("Multiplicar")) {
            mostrar.setText(String.valueOf(num1 * num2));
        }else if (seleccion.equals("Restar")){
            mostrar.setText(String.valueOf(num1-num2));
        }

        else if (seleccion.equals("Dividir")){
            if (num2 == 0){
                return;
            }
            mostrar.setText(String.valueOf(}
        else if (seleccion.equals("Sumar")){
            mostrar.setText(String.valueOf(num1+num2));
        }
    }

}