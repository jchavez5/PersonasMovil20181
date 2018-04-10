package com.jose.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.*;
import android.widget.Toast;

public class registar extends AppCompatActivity {
    private EditText txtCedula,txtNombre,txtApellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registar);
        txtCedula=findViewById(R.id.txtCedula);
        txtNombre=findViewById(R.id.txtNombre);
        txtApellido=findViewById(R.id.txtApellido);
        }

        public void guardar(View v){
        String ced,nomb, apell;
        ced =txtCedula.getText().toString();
        nomb=txtNombre.getText().toString();
        apell=txtApellido.getText().toString();

        Persona p=new Persona(ced,nomb,apell);
        p.guardar();
        Toast.makeText(this,getString(R.string.mensaje_guardado),Toast.LENGTH_SHORT).show();
        borrar();
        }
        public void limpiar (View v){
            borrar();
        }
        public void borrar(){
            txtCedula.setText("");
            txtNombre.setText("");
            txtApellido.setText("");
        }
}
