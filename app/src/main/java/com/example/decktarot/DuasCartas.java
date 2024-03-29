package com.example.decktarot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class DuasCartas extends AppCompatActivity {

    private Button voltar;

    private static final Random rgenerador = new Random();
    private static final Integer[] imagenesID =
            {       R.drawable.as_copas,
                    R.drawable.dois_copas,
                    R.drawable.tres_copas,
                    R.drawable.quatro_copas,
                    R.drawable.cinco_copas,
                    R.drawable.seis_copas,
                    R.drawable.sete_copas,
                    R.drawable.oito_copas,
                    R.drawable.nove_copas,
                    R.drawable.dez_copas,
                    R.drawable.valete_copas,
                    R.drawable.rainha_copas,
                    R.drawable.rei_copas,
                    R.drawable.cavaleiro_copas,
                    R.drawable.as_espadas,
                    R.drawable.dois_espadas,
                    R.drawable.tres_espadas,
                    R.drawable.quatro_espadas,
                    R.drawable.cinco_espadas,
                    R.drawable.seis_espadas,
                    R.drawable.sete_espadas,
                    R.drawable.oito_espadas,
                    R.drawable.nove_espadas,
                    R.drawable.dez_espadas,
                    R.drawable.valete_espadas,
                    R.drawable.rainha_espadas,
                    R.drawable.rei_espadas,
                    R.drawable.as_ouros,
                    R.drawable.dois_ouros,
                    R.drawable.tres_ouros,
                    R.drawable.quatro_ouros,
                    R.drawable.cinco_ouros,
                    R.drawable.seis_ouros,
                    R.drawable.sete_ouros,
                    R.drawable.oito_ouros,
                    R.drawable.nove_ouros,
                    R.drawable.dez_ouros,
                    R.drawable.valete_ouros,
                    R.drawable.rainha_ouros,
                    R.drawable.rei_ouros,
                    R.drawable.cavaleiro_ouros,
                    R.drawable.as_paus,
                    R.drawable.dois_paus,
                    R.drawable.tres_paus,
                    R.drawable.quatro_paus,
                    R.drawable.cinco_paus,
                    R.drawable.seis_paus,
                    R.drawable.sete_paus,
                    R.drawable.oito_paus,
                    R.drawable.nove_paus,
                    R.drawable.dez_paus,
                    R.drawable.valete_paaus,
                    R.drawable.rainha_paus,
                    R.drawable.rei_paus,
                    R.drawable.cavaleiro_paus,
                    R.drawable.o_louco,
                    R.drawable.o_mago,
                    R.drawable.a_papisa,
                    R.drawable.a_imperatriz,
                    R.drawable.o_imperador,
                    R.drawable.o_papa,
                    R.drawable.os_enamorados,
                    R.drawable.o_carrp,
                    R.drawable.a_forca,
                    R.drawable.o_eremita,
                    R.drawable.a_roda_da_fortuna,
                    R.drawable.a_justica,
                    R.drawable.o_pendurado,
                    R.drawable.a_morte,
                    R.drawable.a_temperanca,
                    R.drawable.o_diabo,
                    R.drawable.a_torre,
                    R.drawable.a_estrela,
                    R.drawable.a_lua,
                    R.drawable.o_sol,
                    R.drawable.o_julgamento,
                    R.drawable.o_mundo
            };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duas_cartas);

        Integer q = imagenesID[rgenerador.nextInt(imagenesID.length)];
        final ImageView iv = (ImageView) findViewById(R.id.primeira_carta_taca_dois);

        Integer r = imagenesID[rgenerador.nextInt(imagenesID.length)];
        final ImageView iv2 = (ImageView) findViewById(R.id.segunda_carta_taca_dois);
        voltar = findViewById(R.id.button_voltar_taça_duas_cartas);



        View nextButton = findViewById(R.id.button_embaralhar_taca_dois);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int resource =
                        imagenesID[rgenerador.nextInt(imagenesID.length)];
                int resource2 =
                        imagenesID[rgenerador.nextInt(imagenesID.length)];
                iv.setImageResource(resource);
                iv2.setImageResource(resource2);

            }
        });

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



    }



}