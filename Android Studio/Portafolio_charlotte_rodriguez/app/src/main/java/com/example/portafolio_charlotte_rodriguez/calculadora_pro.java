package com.example.portafolio_charlotte_rodriguez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class calculadora_pro extends AppCompatActivity {
    EditText num1, num2;
    RadioButton radioSumar, radioMultiplicar, radioDividir, radioRestar;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_pro);
        num1 = findViewById(R.id.numerito1);
        num2 = findViewById(R.id.numerito2);
        radioSumar = findViewById(R.id.radio_s);
        radioMultiplicar = findViewById(R.id.radio_m);
        radioDividir = findViewById(R.id.radio_d);
        radioRestar = findViewById(R.id.radio_r);
        result = findViewById(R.id.tv_resultado);
    }

    public void calcular(View view){
        String textoNumero1 = num1.getText().toString();
        String textoNumero2 = num2.getText().toString();
        //solo son == los que son int poll bool ect pero os que son con clases como string uwu como clases
        //en java los string son objeto955
        if(textoNumero1.equals("") ||  textoNumero2.equals("")  ) {
            return;
        }
        int numero1Entero = Integer.parseInt(textoNumero1);
        int numero2Entero = Integer.parseInt(textoNumero2);
        int resultadoOperacion ;

        if(radioSumar.isChecked()){
            resultadoOperacion = numero1Entero + numero2Entero;
        }
        else  if(radioRestar.isChecked()){
            resultadoOperacion = numero1Entero - numero2Entero;
        }
        else if(radioMultiplicar.isChecked()){
            resultadoOperacion = numero1Entero * numero2Entero;
        }
        else if(radioDividir.isChecked()){
            resultadoOperacion = numero1Entero / numero2Entero;
        }
        //si no hay ninguno seleccionado no haremos nada
        else{
            return;
        }
        result.setText(String.valueOf(resultadoOperacion));
    }
}