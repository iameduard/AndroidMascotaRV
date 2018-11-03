package com.example.iamed.mascotarv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import static com.example.iamed.mascotarv.R.*;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascotas> mascotas;
    private RecyclerView ListaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        ListaMascotas = (RecyclerView) findViewById(id.rvMascotas);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        ListaMascotas.setLayoutManager(llm);
        iniciarListaMascotas();
        inicializarAdaptador();
        


    }

    private void inicializarAdaptador() {
        MascotaAdaptador adaptador=new MascotaAdaptador(mascotas);

    }

    private void iniciarListaMascotas() {
        mascotas=new ArrayList<Mascotas>();

        mascotas.add(new Mascotas("Catty",drawable.perro01));
        mascotas.add(new Mascotas("Ronny",drawable.perro02));
        mascotas.add(new Mascotas("gufy",drawable.perro03));
        mascotas.add(new Mascotas("plutoo",drawable.perro04));
        mascotas.add(new Mascotas("layka",drawable.perro05));
        mascotas.add(new Mascotas("Coco",drawable.perro06));

    }
}
