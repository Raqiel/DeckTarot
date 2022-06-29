package com.example.decktarot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class SeisCartas extends AppCompatActivity {

    private Button voltar;

    private static final Random rgenerador = new Random();
    private static final Integer[] imagenesID =
            {       R.drawable.as_de_copas,
                    R.drawable.dois_de_copas,
                    R.drawable.tres_de_copas,
                    R.drawable.quatro_de_copas,
                    R.drawable.cinco_de_copas,
                    R.drawable.seis_de_copas,
                    R.drawable.sete_de_copas,
                    R.drawable.oito_de_copas,
                    R.drawable.nove_de_copas,
                    R.drawable.dez_de_copas,
                    R.drawable.valete_de_copas,
                    R.drawable.rainha_de_copas,
                    R.drawable.rei_de_copas,
                    R.drawable.cavaleiro_de_copas,
                    R.drawable.as_de_espadas,
                    R.drawable.dois_de_espadas,
                    R.drawable.tres_de_espadas,
                    R.drawable.quatro_de_espadas,
                    R.drawable.cinco_de_espadas,
                    R.drawable.seis_de_espadas,
                    R.drawable.sete_de_espadas,
                    R.drawable.oito_de_espadas,
                    R.drawable.nove_de_espadas,
                    R.drawable.dez_de_espadas,
                    R.drawable.valete_de_espadas,
                    R.drawable.rainha_de_espadas,
                    R.drawable.rei_de_espadas,
                    R.drawable.as_de_ouros,
                    R.drawable.dois_de_ouros,
                    R.drawable.tres_de_ouros,
                    R.drawable.quatro_de_ouros,
                    R.drawable.cinco_de_ouros,
                    R.drawable.seis_de_ouros,
                    R.drawable.sete_de_ouros,
                    R.drawable.oito_de_ouros,
                    R.drawable.nove_de_ouros,
                    R.drawable.dez_de_ouros,
                    R.drawable.valete_de_ouros,
                    R.drawable.rainha_de_ouros,
                    R.drawable.rei_de_ouros,
                    R.drawable.cavaleiro_de_ouros,
                    R.drawable.as_de_paus,
                    R.drawable.dois_de_paus,
                    R.drawable.tres_de_paus,
                    R.drawable.quatro_de_paus,
                    R.drawable.cinco_de_paus,
                    R.drawable.seis_de_paus,
                    R.drawable.sete_de_paus,
                    R.drawable.oito_de_paus,
                    R.drawable.nove_de_paus,
                    R.drawable.dez_de_paus,
                    R.drawable.valete_de_paus,
                    R.drawable.rainha_de_paus,
                    R.drawable.rei_de_paus,
                    R.drawable.cavaleiro_de_paus,
                    R.drawable.o_louco,
                    R.drawable.o_mago,
                    R.drawable.a_sacerdotiza,
                    R.drawable.a_imperatriz,
                    R.drawable.o_imperador,
                    R.drawable.o_papa,
                    R.drawable.os_enamorados,
                    R.drawable.o_carro,
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
        setContentView(R.layout.activity_seis_cartas);


        Integer q = imagenesID[rgenerador.nextInt(imagenesID.length)];
        final ImageView iv = (ImageView) findViewById(R.id.imageView_primeira_carta_taça_seis_cartas);

        Integer r = imagenesID[rgenerador.nextInt(imagenesID.length)];
        final ImageView iv2 = (ImageView) findViewById(R.id.imageView_segunda_carta_taça_seis_cartas);

        Integer s = imagenesID[rgenerador.nextInt(imagenesID.length)];
        final ImageView iv3 = (ImageView) findViewById(R.id.imageView_terceira_carta_taça_seis_cartas);

        Integer t = imagenesID[rgenerador.nextInt(imagenesID.length)];
        final ImageView iv4 = (ImageView) findViewById(R.id.imageView_quarta_carta_taça_seis_cartas);

        Integer u = imagenesID[rgenerador.nextInt(imagenesID.length)];
        final ImageView iv5 = (ImageView) findViewById(R.id.imageView_quinta_carta_taça_seis_cartas);

        Integer v = imagenesID[rgenerador.nextInt(imagenesID.length)];
        final ImageView iv6 = (ImageView) findViewById(R.id.imageView_sexta_carta_taça_seis_cartas);
        voltar = findViewById(R.id.button_voltar_taça_seis_cartas);




        View nextButton = findViewById(R.id.embaralhar_taca_seis);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int resource =
                        imagenesID[rgenerador.nextInt(imagenesID.length)];
                int resource2 =
                        imagenesID[rgenerador.nextInt(imagenesID.length)];
                int resource3 =
                        imagenesID[rgenerador.nextInt(imagenesID.length)];
                int resource4 =
                        imagenesID[rgenerador.nextInt(imagenesID.length)];
                int resource5 =
                        imagenesID[rgenerador.nextInt(imagenesID.length)];
                int resource6 =
                        imagenesID[rgenerador.nextInt(imagenesID.length)];
                iv.setImageResource(resource);
                iv2.setImageResource(resource2);
                iv3.setImageResource(resource3);
                iv4.setImageResource(resource4);
                iv5.setImageResource(resource5);
                iv6.setImageResource(resource6);

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