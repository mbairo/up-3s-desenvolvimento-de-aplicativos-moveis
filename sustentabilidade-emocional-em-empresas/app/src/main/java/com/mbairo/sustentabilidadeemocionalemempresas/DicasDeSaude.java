package com.mbairo.sustentabilidadeemocionalemempresas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DicasDeSaude extends AppCompatActivity {
    private Button btn_voltar, btn_dicas, btn_beneficios, btn_liks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dicas_de_saude);
        getSupportActionBar().hide();
        InstanciarElementos();

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DicasDeSaude.this, NivelSentimento.class);
                startActivity(intent);
                finish();
            }
        });
        btn_dicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // goToPage();
                Uri webpage = Uri.parse("https://vidasaudavel.einstein.br/como-cuidar-da-saude-mental/");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
            }
        });

        btn_beneficios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // goToPage();
                Uri webpage = Uri.parse("https://www.infojobs.com.br/blog/lista_completa_dos_beneficios_mais_queridinhos_dos_funcionarios__14668.aspx?t=2");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
            }
        });
        btn_liks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // goToPage();
                Uri webpage = Uri.parse("https://www.planodesaude.net/");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(webIntent);
            }
        });
    }

    public void InstanciarElementos() {
        btn_voltar = findViewById(R.id.btn_voltar);
        btn_dicas = findViewById(R.id.btn_dicas);
        btn_beneficios = findViewById(R.id.btn_beneficios);
        btn_liks = findViewById(R.id.btn_links);
    }

//    private void goToPage() {
//        Uri webpage = Uri.parse("https://vidasaudavel.einstein.br/como-cuidar-da-saude-mental/");
//        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
//        startActivity(webIntent);
//    }
}