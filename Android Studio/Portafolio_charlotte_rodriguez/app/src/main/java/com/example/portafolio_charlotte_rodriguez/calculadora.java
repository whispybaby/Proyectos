package com.example.portafolio_charlotte_rodriguez;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class calculadora extends AppCompatActivity {
    EditText numero1, numero2;
    TextView resultado;
   //**on create aqui van las asinaciones porque aqui es donde comienza todo
    //aqui es donde recien podemos acceder a los elementos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        numero1 = findViewById(R.id.et_num1);
        numero2 = findViewById(R.id.et_num2);
        resultado = findViewById(R.id.tv_result);
    }


    public void calcular(View view){
        //de esta manera obtenemos el string que esta dentro del elemento
        String numero_1 = numero1.getText().toString();
        String numero_2 = numero2.getText().toString();
        //para traformar a entero no hay metodo asi que hay tomarlo mediate argumento y concantenar
        //si no es con la letra mayuscula no es una clase y es nativo de java
        if (numero_1.equals("") || numero_2.equals("")){
            return;
        }
        int variable_num1 = Integer.parseInt(numero_1);
        int variable_num2 = Integer.parseInt(numero_2);

        int resultado_suma = variable_num1 + variable_num2;

        //para trasformar los elementos int a string y mostrar el resultado;
        resultado.setText(String.valueOf(resultado_suma));


        }

}
