package com.example.iamed.mascotarv;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalleMascota extends AppCompatActivity {
    private int imgFoto;
    private TextView tvNombre;
    private TextView tvRate;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_mascota);

        Bundle parametros=getIntent().getExtras();
        //int foto = parametros.getInt(getResources().getInteger(R.drawable.perro01));
        String nombre=parametros.getString(getResources().getString(R.string.nombre));
        String rating=parametros.getString(getResources().getString(R.string.rating));

        tvNombre=(TextView) findViewById(R.id.tvNombreRV);

    }
}
