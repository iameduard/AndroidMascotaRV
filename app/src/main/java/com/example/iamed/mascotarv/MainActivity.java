package com.example.iamed.mascotarv;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.view.View;

import java.util.ArrayList;

import static com.example.iamed.mascotarv.R.*;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascotas> mascotas;
    private RecyclerView ListaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        ListaMascotas = (RecyclerView) findViewById(id.rvMascota);

        Toolbar miActionBar = (Toolbar) findViewById(id.miActionBar);
        //La siguiente instruccion genera que no se muestre al app
        //setSupportActionBar(miActionBar);

        //Crear el Intent que sera llamado al hacer click en la estrella..
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        agregarBotonEstrella();

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        ListaMascotas.setLayoutManager(llm);

        iniciarListaMascotas();
        inicializarAdaptador();

    }

    private void agregarBotonEstrella() {
        Button btn_estrella=(Button) findViewById(id.btn_estrella);
        btn_estrella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(MainActivity.this,DetalleMascota.class);
                //startActivities(intent);

                Intent intent = new Intent(getApplicationContext(), DetalleMascota.class);
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
        mascotas.add(new Mascotas(drawable.perro01,"Catty","4"));
        mascotas.add(new Mascotas(drawable.perro02,"Ronny","5"));
        mascotas.add(new Mascotas(drawable.perro03,"gufy","4"));
        mascotas.add(new Mascotas(drawable.perro04,"plutoo","3"));
        mascotas.add(new Mascotas(drawable.perro05,"layka","2"));
        mascotas.add(new Mascotas(drawable.perro06,"Coco","5"));

    }
}
