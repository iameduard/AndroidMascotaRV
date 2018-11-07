package com.example.iamed.mascotarv;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
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

        View v=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_mascota,viewGroup,false);

        return new MascotaViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MascotaViewHolder mascotaViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return mascotas.size;
    }

    public class MascotaViewHolder extends RecyclerView.ViewHolder {
        private
        public MascotaViewHolder(View v) {
            super();
        }
    }
}
