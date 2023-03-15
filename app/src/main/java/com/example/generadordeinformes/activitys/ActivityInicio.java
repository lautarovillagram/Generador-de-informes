package com.example.generadordeinformes.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.generadordeinformes.R;
import com.example.generadordeinformes.clases.InicioOperativo;

public class ActivityInicio extends AppCompatActivity {

    EditText fldNombreBase;
    EditText fldTipoOperativo;
    EditText fldLugarOperativo;
    EditText fldHorarioInicio;
    EditText fldHorarioFin;
    EditText fldApellidosAgentes;
    EditText fldDominioMoviles;
    EditText fldFuerza;
    EditText fldObservaciones;
    Button btnGenerar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        fldNombreBase = (EditText) findViewById(R.id.fldNombreDeBase);
        fldTipoOperativo = (EditText) findViewById(R.id.fldTipoDeOperativo);
        fldLugarOperativo = (EditText) findViewById(R.id.fldTipoDeOperativo);
        fldHorarioInicio = (EditText) findViewById(R.id.fldHorarioInicio);
        fldHorarioFin = (EditText) findViewById(R.id.fldHorarioFin);
        fldApellidosAgentes = (EditText) findViewById(R.id.fldApellidosAgentes);
        fldDominioMoviles = (EditText) findViewById(R.id.fldDominiosMoviles);
        fldFuerza = (EditText) findViewById(R.id.fldFuerzaInvolucrada);
        fldObservaciones = (EditText) findViewById(R.id.fldObservaciones);
        btnGenerar = (Button) findViewById(R.id.btnGenerarInformeInicio);

        btnGenerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InicioOperativo informeDeInicio = creacionDeInicio();

                Toast.makeText(getApplicationContext(), "informe generado y copiado al portapapeles", Toast.LENGTH_LONG).show();


            }
        });

    }

    public InicioOperativo creacionDeInicio() {

        return new InicioOperativo(fldNombreBase.getText().toString(), fldTipoOperativo.getText().toString(), fldLugarOperativo.getText().toString(),
                fldHorarioInicio.getText().toString(), fldHorarioFin.getText().toString(), fldApellidosAgentes.getText().toString(),
                fldDominioMoviles.getText().toString(), fldFuerza.getText().toString(), fldObservaciones.getText().toString());
    }






}