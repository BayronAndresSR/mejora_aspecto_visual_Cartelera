package com.example.cartelera;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private AlertDialog.Builder dialogBuilder;
    private AlertDialog dialog;
    private Button btnCancelar;

    private List<com.example.cartelera.Persona> personas;
    private void inicializarDatos(){
        personas = new ArrayList<>();


        personas.add(new com.example.cartelera.Persona(getResources().getString(R.string.pelicula_1),"Genero de pelicula : "+getResources().getString(R.string.genero_1),R.drawable.anillos,0,getResources().getString(R.string.descripcion_1),getResources().getString(R.string.web_1)));
        personas.add(new com.example.cartelera.Persona(getResources().getString(R.string.pelicula_2),"Genero de pelicula : "+getResources().getString(R.string.genero_2),R.drawable.lamosca,1,getResources().getString(R.string.descripcion_2),getResources().getString(R.string.web_2)));
        personas.add(new com.example.cartelera.Persona(getResources().getString(R.string.pelicula_3),"Genero de pelicula : "+getResources().getString(R.string.genero_3),R.drawable.nemo,2,getResources().getString(R.string.descripcion_3),getResources().getString(R.string.web_3)));
        personas.add(new com.example.cartelera.Persona(getResources().getString(R.string.pelicula_4),"Genero de pelicula : "+getResources().getString(R.string.genero_4),R.drawable.sin_perdon,3,getResources().getString(R.string.descripcion_4),getResources().getString(R.string.web_4)));
        personas.add(new com.example.cartelera.Persona(getResources().getString(R.string.pelicula_5),"Genero de pelicula : "+getResources().getString(R.string.genero_4),R.drawable.ciudad_dios,4,getResources().getString(R.string.descripcion_5),getResources().getString(R.string.web_5)));
        personas.add(new com.example.cartelera.Persona(getResources().getString(R.string.pelicula_6),"Genero de pelicula : "+getResources().getString(R.string.genero_3),R.drawable.hableconella,5,getResources().getString(R.string.descripcion_6),getResources().getString(R.string.web_6)));
        personas.add(new com.example.cartelera.Persona(getResources().getString(R.string.pelicula_7),"Genero de pelicula : "+getResources().getString(R.string.genero_2),R.drawable.elcielosobre,6,getResources().getString(R.string.descripcion_7),getResources().getString(R.string.web_7)));
        personas.add(new com.example.cartelera.Persona(getResources().getString(R.string.pelicula_8),"Genero de pelicula : "+getResources().getString(R.string.genero_1),R.drawable.lamiradadeulises,7,getResources().getString(R.string.descripcion_8),getResources().getString(R.string.web_8)));

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager =
                new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        inicializarDatos();

        com.example.cartelera.RVAdapter rvAdapter = new com.example.cartelera.RVAdapter(personas,getApplicationContext());
        recyclerView.setAdapter(rvAdapter);
    }
}