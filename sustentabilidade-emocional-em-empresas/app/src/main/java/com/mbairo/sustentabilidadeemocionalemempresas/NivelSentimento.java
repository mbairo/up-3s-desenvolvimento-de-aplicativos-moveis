package com.mbairo.sustentabilidadeemocionalemempresas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class NivelSentimento extends AppCompatActivity {
    private ImageView imageView_duvidas, muito_feliz_empty, muito_feliz_full, feliz_empty, feliz_full, meio_chateado_empty, meio_chateado_full, triste_empty, triste_full, muito_triste_empty, muito_triste_full;
    private TextView textView_pergunta_do_dia, textView_dicas_de_saude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel_sentimento);
        getSupportActionBar().hide();
        InstanciarElementos();

        muito_feliz_empty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                feliz_full.setVisibility(View.INVISIBLE);
                meio_chateado_full.setVisibility(View.INVISIBLE);
                triste_full.setVisibility(View.INVISIBLE);
                muito_triste_full.setVisibility(View.INVISIBLE);
                muito_feliz_full.setVisibility(View.VISIBLE);
            }
        });
        feliz_empty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                muito_feliz_full.setVisibility(View.INVISIBLE);
                meio_chateado_full.setVisibility(View.INVISIBLE);
                triste_full.setVisibility(View.INVISIBLE);
                muito_triste_full.setVisibility(View.INVISIBLE);
                feliz_full.setVisibility(View.VISIBLE);
            }
        });
        meio_chateado_empty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                muito_feliz_full.setVisibility(View.INVISIBLE);
                triste_full.setVisibility(View.INVISIBLE);
                muito_triste_full.setVisibility(View.INVISIBLE);
                feliz_full.setVisibility(View.INVISIBLE);
                meio_chateado_full.setVisibility(View.VISIBLE);
            }
        });
        triste_empty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                muito_feliz_full.setVisibility(View.INVISIBLE);
                muito_triste_full.setVisibility(View.INVISIBLE);
                feliz_full.setVisibility(View.INVISIBLE);
                meio_chateado_full.setVisibility(View.INVISIBLE);
                triste_full.setVisibility(View.VISIBLE);
            }
        });
        muito_triste_empty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                muito_feliz_full.setVisibility(View.INVISIBLE);
                feliz_full.setVisibility(View.INVISIBLE);
                meio_chateado_full.setVisibility(View.INVISIBLE);
                triste_full.setVisibility(View.INVISIBLE);
                muito_triste_full.setVisibility(View.VISIBLE);
            }
        });

        // img Dúvidas
        imageView_duvidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(NivelSentimento.this, DuvidasEProblemas.class);
                startActivity(intent);
                finish();
            }
        });

        // Text PERGUNTA DO DIA
        textView_pergunta_do_dia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(NivelSentimento.this, PerguntaDoDia.class);
                startActivity(intent);
                finish();
            }
        });

        // Text PERGUNTA DO DIA
        textView_dicas_de_saude.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(NivelSentimento.this, DicasDeSaude.class);
                startActivity(intent);
                finish();
            }
        });

    }

    public void InstanciarElementos () {
        imageView_duvidas = findViewById(R.id.imageView_duvidas);
        textView_pergunta_do_dia = findViewById(R.id.textView_pergunta_do_dia);
        textView_dicas_de_saude = findViewById(R.id.textView_dicas_de_saude);

        muito_feliz_empty = findViewById(R.id.img_muito_feliz_empty);
        muito_feliz_full = findViewById(R.id.img_muito_feliz_full);

        feliz_empty = findViewById(R.id.img_feliz_empty);
        feliz_full = findViewById(R.id.img_feliz_full);

        meio_chateado_empty = findViewById(R.id.img_meio_chateado_empty);
        meio_chateado_full = findViewById(R.id.img_meio_chateado_full);

        triste_empty = findViewById(R.id.img_triste_empty);
        triste_full = findViewById(R.id.img_triste_full);

        muito_triste_empty = findViewById(R.id.img_muito_triste_empty);
        muito_triste_full = findViewById(R.id.img_muito_triste_full);
    }
}