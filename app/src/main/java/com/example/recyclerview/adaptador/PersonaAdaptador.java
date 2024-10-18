package com.example.recyclerview.adaptador;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.modelos.Persona;

import java.util.List;

public class PersonaAdaptador extends RecyclerView.Adapter<PersonaAdaptador.viewholder> {

    List<Persona> LP;

    public PersonaAdaptador(List<Persona> LP) {
        this.LP = LP;
    }


    // Diseño
    @NonNull
    @Override
    public PersonaAdaptador.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater ly = LayoutInflater.from(parent.getContext());
        View v=ly.inflate(R.layout.activity_item,parent, false);
        return new viewholder(v);
    }


    @Override
    public void onBindViewHolder(@NonNull PersonaAdaptador.viewholder holder, int position) {
        holder.setData(LP.get(position));
    }

    @Override
    public int getItemCount() {
        return LP.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        TextView txtNombre; // id del xml
        TextView txtTelefono;
        Color color;
        ImageView imview;
        Persona personaholder;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            txtNombre = itemView.findViewById(R.id.txtNombre);
            txtTelefono = itemView.findViewById(R.id.txtTelefono);
            imview = itemView.findViewById(R.id.imageView);

        }
        public void setData(Persona p){
            personaholder = p;
            txtNombre.setText(p.getNombre());
            txtTelefono.setText(p.getTelefono());
            imview.setImageResource(p.getImagen());
            try {
                itemView.setBackgroundColor(Color.parseColor(personaholder.getColor()));
            } catch (IllegalArgumentException e) {
                itemView.setBackgroundColor(Color.LTGRAY);
            }
        }
    }
}
