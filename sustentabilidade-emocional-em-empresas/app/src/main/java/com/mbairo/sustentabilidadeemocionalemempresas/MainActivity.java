package com.mbairo.sustentabilidadeemocionalemempresas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button btn_click_aqui;
    private ImageView imageView_duvidas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        InstanciarElementos();

        btn_click_aqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, NivelSentimento.class);
                startActivity(intent);
                finish();
            }
        });

        imageView_duvidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, DuvidasEProblemas.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void InstanciarElementos() {
        btn_click_aqui = findViewById(R.id.btn_click_aqui);
        imageView_duvidas = findViewById(R.id.imageView_duvidas);
    }
}