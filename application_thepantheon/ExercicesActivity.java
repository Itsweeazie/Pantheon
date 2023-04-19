package com.example.application_thepantheon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class ExercicesActivity extends AppCompatActivity {

    ArrayList<Item> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercices_layout);

        // Ajouter des items
        items.add(new Item("Abdo", "Abdominaux", R.drawable.abdo));
        items.add(new Item("Butterfly", "Pectoraux", R.drawable.butterfly));
        items.add(new Item("Bucheron", "Dos et biceps", R.drawable.bucheron));
        items.add(new Item("Chaise romaine", "Abdominaux et dorsaux", R.drawable.chaiseromaine));
        items.add(new Item("Curl incliné", "Biceps", R.drawable.curlincline));
        items.add(new Item("Curl sur banc", "Biceps", R.drawable.curlsurbanc));
        items.add(new Item("Dévelopé couché haltère incliné", "Pectoraux", R.drawable.haltereincline));
        items.add(new Item("Développer militaire", "Epaules", R.drawable.developpermilitaire));
        items.add(new Item("Dip banc", "Triceps", R.drawable.dipsbanc));
        items.add(new Item("Dip", "Triceps", R.drawable.dip));
        items.add(new Item("Ecarté altères", "Pectoraux", R.drawable.ecartehaltere));
        items.add(new Item("Extension poulie", "Triceps", R.drawable.extensionpoulie));
        items.add(new Item("Fente", "Jambes et fessiers", R.drawable.fente));
        items.add(new Item("Flexion latéral", "Obliques", R.drawable.flexionlateral));
        items.add(new Item("Gainage", "Abdominaux", R.drawable.gainage));
        items.add(new Item("Kick back", "Triceps", R.drawable.kickback));
        items.add(new Item("Leg extension", "Quadriceps", R.drawable.legextension));
        items.add(new Item("Molet", "Mollets", R.drawable.molet));
        items.add(new Item("Oiseaux assis", "Epaules", R.drawable.oiseauxassis));
        items.add(new Item("Pull over", "Dos et pectoraux", R.drawable.pullover));
        items.add(new Item("Pull up", "Dos et biceps", R.drawable.pullup));
        items.add(new Item("Relevé de jambe sur banc", "Abdominaux", R.drawable.relevedejambes));
        items.add(new Item("Squat", "Jambes et fessiers", R.drawable.squat));
        items.add(new Item("Squat sumo", "Jambes et fessiers", R.drawable.squatsumo));
        items.add(new Item("Tirage horizontal", "Dos", R.drawable.tiragehorizontal));
        items.add(new Item("Tirage poitrine", "Dos et biceps", R.drawable.tiragepoitrine));
        items.add(new Item("Tirage vertical", "Dos et biceps", R.drawable.tiragevertical));
        items.add(new Item("Vélo", "Cardio et jambes", R.drawable.velo));

        // Création de l'adapter avec les items
        R1Adapter adapter = new R1Adapter(items);

        // Création du RecyclerView et configuration
        RecyclerView recyclerView = findViewById(R.id.r1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        // Définition de l'action à effectuer lors du clic sur un item
        adapter.setOnItemClickListener(new R1Adapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                // Ouverture de l'activité ImageViewActivity en envoyant l'item correspondant
                Intent intent = new Intent(ExercicesActivity.this, ImageViewActivity.class);
                intent.putExtra("item", items.get(position));
                startActivity(intent);
            }
        });
    }
}