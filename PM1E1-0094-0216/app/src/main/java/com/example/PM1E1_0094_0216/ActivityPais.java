package com.example.PM1E1_0094_0216;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.pm1e1_0087_0012.configuraciones.SQLiteConexion;
import com.example.pm1e1_0087_0012.configuraciones.Transacciones;
public class ActivityPais extends AppCompatActivity {
    EditText aptxtCodigo,aptxtPaís;
    Button apbtnGuardar, aptnAtras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitypais2);

        aptxtCodigo = (EditText) findViewById(R.id.aptxtCodigo);
        aptxtPaís = (EditText) findViewById(R.id.aptxtPaís);
        apbtnGuardar = (Button) findViewById(R.id.apbtnGuardar);
        aptnAtras = (Button) findViewById(R.id.apbtnAtras);

        apbtnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InsertarPais();
            }
        });

        aptnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void InsertarPais() {
        SQLiteConexion conexion = new SQLiteConexion(this, Transacciones.NameDatabase,null,1);
        SQLiteDatabase db = conexion.getWritableDatabase();

        ContentValues valores = new ContentValues();
        valores.put(Transacciones.codigo,aptxtCodigo.getText().toString());
        valores.put(Transacciones.p_país,aptxtPaís.getText().toString());

        Long resultado = db.insert(Transacciones.tblPaises,Transacciones.codigo,valores);

        Toast.makeText(getApplicationContext(),"¡¡¡ Actualización Exitosa !!!"+resultado.toString(),Toast.LENGTH_LONG).show();
        db.close();

        limpiarPantalla();

    }

    private void limpiarPantalla() {
        aptxtPaís.setText("");
        aptxtCodigo.setText("");
    }
}