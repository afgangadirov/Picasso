package com.example.picassocalismasi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewImageHolder;
    private Button buttonLocal, buttonInternet1, buttonInternet2, buttonChange;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewImageHolder = findViewById(R.id.imageViewImageHolder);
        buttonLocal = findViewById(R.id.buttonLocal);
        buttonInternet1 = findViewById(R.id.buttonInternet1);
        buttonInternet2 = findViewById(R.id.buttonInternet2);
        buttonChange = findViewById(R.id.buttonChange);


        buttonLocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Picasso.get()
                        .load(R.drawable.img)
                        .resize(600,800)
                        .into(imageViewImageHolder);
            }
        });


        buttonInternet1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = "http://kasimadalan.pe.hu/filmler/resimler/thehatefuleight.png";

                Picasso.get()
                        .load(url)
                        .placeholder(R.drawable.placeholder)
                        .into(imageViewImageHolder);


            }
        });


        buttonInternet2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://kasimadalan.pe.hu/filmler/resimler/django.png";

                Picasso.get()
                        .load(url)
                        .into(imageViewImageHolder);
            }
        });



        buttonChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String url = "http://kasimadalan.pe.hu/filmler/resimler/django.png";

                Picasso.get()
                        .load(url)
                        .resize(600,800)
                        .into(imageViewImageHolder);

            }
        });





    }
}