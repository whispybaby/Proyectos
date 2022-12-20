package com.example.evaluacion3charlotterodriguez;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.example.evaluacion3charlotterodriguez.DAO.DAOUsuario;
import com.example.evaluacion3charlotterodriguez.DAO.Usuario;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {
    private EditText rutsito;
    private EditText nombresito;
    private EditText correito;
    private ListView listaUsuario;
    private ArrayAdapter<Usuario> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Aqui lo declaro
        findViewById(R.id.rut);
        findViewById(R.id.nombre);
        findViewById(R.id.correo);
        findViewById(R.id.agLvListView);
        //Ahora lo asigno
        listaUsuario = findViewById(R.id.agLvListView);
        rutsito = findViewById(R.id.rut);
        nombresito = findViewById(R.id.nombre);
        correito = findViewById(R.id.correo);

        adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        //Vincular  el listView con adaptador
        listaUsuario.setAdapter(adaptador);
        //Logica de firebase
        DAOUsuario dao = new DAOUsuario();

        //Añadir un escuchador a un evento de firebase
        dao.getReferencia().orderByChild("nombre").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                adaptador.clear();
                //Iterar por cada uno de los contactos
                for (DataSnapshot usuario_actual : snapshot.getChildren()) {
                    Usuario usuario = usuario_actual.getValue(Usuario.class);
                    //  Agrega los datos si no esta nulo
                    if (usuario != null) {
                        usuario.setRut(usuario_actual.getKey());
                        adaptador.add(usuario);
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });
    }

    public void InsertarUsuario(View view) {
        String rut = rutsito.getText().toString();
        if (rut.equals("")) {
            return;
        }
        String nombre = nombresito.getText().toString();
        if (nombre.equals("")) {
            return;
        }
        String correo = correito.getText().toString();
        if (correo.equals("")) {
            return;
        }
        Usuario usuario = new Usuario(rut, nombre, correo);

        DAOUsuario daoUsuario = new DAOUsuario();
        daoUsuario.InsertarUsuario(usuario);
    }

    public void EliminarUsuario(View view) {
        String rut = rutsito.getText().toString();
        if (rut.equals("")) {
            return;
        }
        
        DAOUsuario daoUsuario = new DAOUsuario();
        daoUsuario.Eliminarusuario(rut);
    }
}