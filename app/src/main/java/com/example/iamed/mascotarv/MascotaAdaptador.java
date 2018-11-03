package com.example.iamed.mascotarv;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {

    private ArrayList<Mascotas> mascotas;

    public MascotaAdaptador(ArrayList<Mascotas> mascotas) {
        this.mascotas=mascotas;
    }

    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MascotaViewHolder mascotaViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MascotaViewHolder extends RecyclerView.ViewHolder {
    }
}
