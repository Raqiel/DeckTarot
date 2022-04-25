package com.example.decktarot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class UmaCarta extends AppCompatActivity {

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
        setContentView(R.layout.activity_uma_carta);

        Integer q = imagenesID[rgenerador.nextInt(imagenesID.length)];
        final ImageView iv = (ImageView) findViewById(R.id.imageView_primeira_carta_taça_um);

        View nextButton = findViewById(R.id.button_embaralhar_taça_um);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int resource =
                        imagenesID[rgenerador.nextInt(imagenesID.length)];
                iv.setImageResource(resource);

            }
        });
    }
}

