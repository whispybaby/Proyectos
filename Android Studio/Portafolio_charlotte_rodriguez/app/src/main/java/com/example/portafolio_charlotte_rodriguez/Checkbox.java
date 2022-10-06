package com.example.portafolio_charlotte_rodriguez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class Checkbox extends AppCompatActivity {
    EditText numero1, numero2;
    CheckBox sumar , restar;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        numero1 = findViewById(R.id.etn1);
        numero2 = findViewById(R.id.etn2);
        sumar = findViewById(R.id.cb_sumar_checkbox);
        restar = findViewById(R.id.cb_restar_checkbox);
        resultado = findViewById(R.id.checkboxResultado);
    }
    public void calcular(View view){
        //Esto obtiene el string dentro del elemento int
        String obtenerElemento1 = numero1.getText().toString();
        String obtenerElemento2 = numero2.getText().toString();

        //Si uno no tiene ningun elemento añadido no hacer nada y devolver
        if (obtenerElemento1.equals("") || obtenerElemento2.equals("")){
            return;
        }

        //Pasar a  entero
        int variable1 = Integer.parseInt(obtenerElemento1);
        int variable2 = Integer.parseInt(obtenerElemento2);


        if (restar.isChecked()&& sumar.isChecked()){
            int resultadosuma= variable1 + variable2;
            int resultadoresta = variable1 - variable2;
            resultado.setText(String.valueOf(resultadosuma)+"// "+String.valueOf(resultadoresta));
        }
        else if (sumar.isChecked()){
            int resultadosuma =   variable1 + variable2;
            resultado.setText(String.valueOf(resultadosuma));
        }
        else if (restar.isChecked()){
            int resultadosuma =  variable1 - variable2;
            resultado.setText(String.valueOf(resultadosuma));
        }
    }
}