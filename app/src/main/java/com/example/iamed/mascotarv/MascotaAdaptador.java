package com.example.iamed.mascotarv;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {

    private ArrayList<Mascotas> mascotas;

    public MascotaAdaptador(ArrayList<Mascotas> mascotas) {

        this.mascotas=mascotas;

    }
    //Inflar el layout y lo pasara al viewholder para que obtenga los views..
    @NonNull
    @Override
    public MascotaViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardview_mascota,viewGroup,false);
        return new MascotaViewHolder(v);
    }
    //Asociar cada elemento de a vista con cada view...
    @Override
    public void onBindViewHolder(@NonNull MascotaViewHolder mascotaViewHolder, int i) {

        Mascotas mascota = mascotas.get(i);
        mascotaViewHolder.imFotoRV.setImageResource(mascota.getFoto());
        //Casting de int a String.. OJOOOO!!!!
        mascotaViewHolder.tvRating.setText(mascota.getRate());
        mascotaViewHolder.tvNombreRV.setText(mascota.getNombre());

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public static class MascotaViewHolder extends RecyclerView.ViewHolder {
        private ImageView imFotoRV;
        private TextView tvNombreRV;
        private TextView tvRating;

        public MascotaViewHolder(View v) {
            super(v);
            imFotoRV    = (ImageView) v.findViewById(R.id.imFotoRV);
            tvNombreRV  = (TextView)  v.findViewById(R.id.tvNombreRV);
            tvRating    = (TextView)  v.findViewById(R.id.tvRating);
        }
    }
}
