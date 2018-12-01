package com.example.iamed.mascotarv;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetalleMascota extends AppCompatActivity {
    ArrayList<Mascotas> mascotas;
    private RecyclerView ListaMascotas;
    private int imgFoto;
    private TextView tvNombre;
    private TextView tvRate;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_mascota);

        ListaMascotas = (RecyclerView) findViewById(R.id.rvFavoritas);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        agregarBotonRegresar();
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        ListaMascotas.setLayoutManager(llm);

        iniciarListaMascotas();
        inicializarAdaptador();
    }

    private void agregarBotonRegresar() {
        Button btn_estrella=(Button) findViewById(R.id.btn_estrella);
        btn_estrella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }

        });
    }

    private void inicializarAdaptador() {
        MascotaAdaptador adaptador=new MascotaAdaptador(mascotas);
        ListaMascotas.setAdapter(adaptador);

    }

    private void iniciarListaMascotas() {
        mascotas=new ArrayList<Mascotas>();
        //
        //Verificar si hace falta pasar el rating OJOOOOO!!!!!
        //
        mascotas.add(new Mascotas(R.drawable.perro01,"Catty","4"));
        mascotas.add(new Mascotas(R.drawable.perro02,"Ronny","5"));
        mascotas.add(new Mascotas(R.drawable.perro03,"gufy","4"));
        mascotas.add(new Mascotas(R.drawable.perro04,"plutoo","3"));
        mascotas.add(new Mascotas(R.drawable.perro05,"layka","2"));
        mascotas.add(new Mascotas(R.drawable.perro06,"Coco","5"));

    }
}
