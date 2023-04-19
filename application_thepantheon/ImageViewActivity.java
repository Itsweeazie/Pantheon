package com.example.application_thepantheon;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ImageViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);

        // Récupération de l'item envoyé depuis ExercicesActivity
        Item item = getIntent().getParcelableExtra("item");

        // Récupération de l'ImageView et affichage de l'image correspondante
        ImageView imageView = findViewById(R.id.iv1);
        imageView.setImageResource(item.getimageId());
    }
}