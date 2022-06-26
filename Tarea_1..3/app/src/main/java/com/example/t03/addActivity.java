package com.example.t03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.t03.configuracion.SQLiteConexion;
import com.example.t03.configuracion.Transacciones;

    public class addActivity extends AppCompatActivity {
    EditText nombres, apellidos, edad, direccion, Correo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        nombres =(EditText) findViewById(R.id.txtNombre);
        apellidos =(EditText) findViewById(R.id.txtApellido);
        edad =(EditText) findViewById(R.id.txtEdad);
        direccion =(EditText) findViewById(R.id.txtDireccion);
        Correo =(EditText) findViewById(R.id.txtCorreo);

        Button btnAgregar = (Button) findViewById(R.id.btnGuardar);
        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AgregarPersonas();
            }
        });
    }
    private void AgregarPersonas(){
        SQLiteConexion conexion = new SQLiteConexion(this, Transacciones.NameDatabase, null,1);
        SQLiteDatabase db = conexion.getWritableDatabase();
        ContentValues valores = new ContentValues();
        valores.put(Transacciones.nombres , nombres.getText().toString());
        valores.put(Transacciones.apellidos , apellidos.getText().toString());
        valores.put(Transacciones.edad , edad.getText().toString());
        valores.put(Transacciones.direccion , direccion.getText().toString());
        valores.put(Transacciones.Correo , Correo.getText().toString());

        Long resultado = db.insert(Transacciones.tablaPersonas,Transacciones.id, valores);
        Toast.makeText(getApplicationContext(), "Registro Ingresado: Codigo: "
                        + resultado.toString(),Toast.LENGTH_LONG).show();
        db.close();
        LimpiarPantalla();
    }
    private void LimpiarPantalla(){
        nombres.setText("");
        apellidos.setText("");
        edad.setText("");
        direccion.setText("");
        Correo.setText("");
    }
}