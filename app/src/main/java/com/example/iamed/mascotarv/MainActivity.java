package com.example.iamed.mascotarv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

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

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        ListaMascotas.setLayoutManager(llm);

        iniciarListaMascotas();
        inicializarAdaptador();

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
