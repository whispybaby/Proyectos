package com.example.portafolio_charlotte_rodriguez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Evaluacion extends AppCompatActivity {
    EditText num;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluacion);
        num = findViewById(R.id.numero);
        resultado = findViewById(R.id.idResultado);
    }
    public void calcular(View view){
        String textoNum = num.getText().toString();
        if(textoNum.equals ("")){
            return;
        };
        int numeroEntero = Integer.parseInt(textoNum);
        if(numeroEntero > 0){
            resultado.setText("Positivo");
        }
        else if (numeroEntero == 0) {
            resultado.setText("Neutro");
        }
        else {
            resultado.setText("Negativo");
        }



    }
}