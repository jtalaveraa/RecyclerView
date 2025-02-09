package com.example.recyclerview;

import android.net.Uri;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import com.example.recyclerview.adaptador.PersonaAdaptador;
import com.example.recyclerview.modelos.Persona;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Persona> p = new ArrayList<Persona>();

        // Persona p1 = new Persona(nombre: "Jonathan", telefono: "8715066383");

        p.add(new Persona( "Jonathan",  "8715066383", new Intent(Intent.ACTION_VIEW, Uri.parse( "https://media.gq.com.mx/photos/66774829c12a54a09ddc8b23/1:1/w_2012,h_2012,c_limit/Cristiano%20Ronaldo.jpg"))));
        p.add(new Persona( "Jonathan 2",  "8718463764", new Intent(Intent.ACTION_VIEW, Uri.parse( "https://media.gq.com.mx/photos/66774829c12a54a09ddc8b23/1:1/w_2012,h_2012,c_limit/Cristiano%20Ronaldo.jpg"))));
        p.add(new Persona( "Jonathan 3",  "8701847564", new Intent(Intent.ACTION_VIEW, Uri.parse( "https://media.gq.com.mx/photos/66774829c12a54a09ddc8b23/1:1/w_2012,h_2012,c_limit/Cristiano%20Ronaldo.jpg"))));


        PersonaAdaptador adapersona = new PersonaAdaptador(p);

        RecyclerView listas = findViewById(R.id.rcvListaPersonas);
        listas.setAdapter(adapersona);
        listas.setLayoutManager(new LinearLayoutManager(this));
        listas.setHasFixedSize(true);
    }
}