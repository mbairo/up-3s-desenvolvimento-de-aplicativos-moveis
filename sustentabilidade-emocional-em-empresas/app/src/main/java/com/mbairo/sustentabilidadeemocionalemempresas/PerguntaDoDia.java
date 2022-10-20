package com.mbairo.sustentabilidadeemocionalemempresas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PerguntaDoDia extends AppCompatActivity {
    private Button btn_voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta_do_dia);
        getSupportActionBar().hide();
        InstanciarElementos();

        // TODO: voltar para a página anterior e não sempre para a Main
        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PerguntaDoDia.this, NivelSentimento.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void InstanciarElementos() {
        btn_voltar = findViewById(R.id.btn_voltar);
    }
}