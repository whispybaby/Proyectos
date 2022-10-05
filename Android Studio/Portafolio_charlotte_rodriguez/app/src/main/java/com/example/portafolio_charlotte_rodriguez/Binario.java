package com.example.portafolio_charlotte_rodriguez;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class Binario extends AppCompatActivity {
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binario);
        // No vincular más de un layout
        checkBox1  = findViewById(R.id.cb_8);
        checkBox2  = findViewById(R.id.cb_4);
        checkBox3 = findViewById(R.id.cb_2);
        checkBox4 = findViewById(R.id.cb_1);
        resultado = findViewById(R.id.mostrarTextoresultado);

    }

    public void transformar(View view) {
        int x = 0;
        resultado.setText(String.valueOf(x));
    }
}
