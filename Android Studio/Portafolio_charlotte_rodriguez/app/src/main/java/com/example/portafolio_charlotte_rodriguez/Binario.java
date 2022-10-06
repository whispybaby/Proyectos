package com.example.portafolio_charlotte_rodriguez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class Binario extends AppCompatActivity {
    CheckBox checkBox128, checkBox64, checkBox32, checkBox16 ,checkBox8, checkBox4, checkBox2, checkBox1;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binario);
        // No vincular más de un layout
        checkBox128 = findViewById(R.id.cb_128);
        checkBox64 = findViewById(R.id.cb_64);
        checkBox32 = findViewById(R.id.cb_32);
        checkBox16 = findViewById(R.id.cb_16);
        checkBox8  = findViewById(R.id.cb_8);
        checkBox4  = findViewById(R.id.cb_4);
        checkBox2 = findViewById(R.id.cb_2);
        checkBox1 = findViewById(R.id.cb_1);
        resultado = findViewById(R.id.mostrarTextoresultado);

    }

    public void transformar(View view) {
        int x = 0;

        if (checkBox1.isChecked()){
            x = x + 1 ;
        }
        if (checkBox2.isChecked()){
            x = x + 2;
        }
        if(checkBox4.isChecked()){
            x = x + 4;
        }
        if (checkBox8.isChecked()){
            x = x + 8;
        }
        if (checkBox16.isChecked()){
            x = x + 16;
        }
        if (checkBox32.isChecked()){
            //Es la manera compacta de decir que x es igual a  osea  0  que es x +32
            x += 32;
        }
        if (checkBox64.isChecked()){
            x = x +64;
        }
        if (checkBox128.isChecked()){
            x = x + 128;
        }
        resultado.setText(String.valueOf(x));
    }
}
