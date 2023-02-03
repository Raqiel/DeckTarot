package com.example.decktarot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;
public class UmaCarta extends AppCompatActivity {

    static class Carta {
        int imagemID;
        String nome;
        String texto;

        public Carta(String nome, int imagemID, String texto) {
            this.nome = nome;
            this.imagemID = imagemID;
            this.texto = texto;
        }
    }

    private Button voltar;

    private static final Random rgenerador = new Random();
    private static final Carta[] cartas = {
            new Carta("Ás de espadas", R.drawable.as_de_espadas, " Pare de ser emocionado, em compensação cuidado com o sentimento da pessoa que você gosta"),
            new Carta("Dois de espadas", R.drawable.dois_de_espadas, "Se você tem um relacionamento, ele é muito tóxico, e tem tido muitas brigas, que tal repensar essa situação?\nSe está sozinho, continue assim, antes só do que mal acompanhado"),
            new Carta("Três de espadas", R.drawable.tres_de_espadas, "TODO"),
            new Carta("Quatro de espadas", R.drawable.quatro_de_espadas, "TODO"),
            new Carta("Cinco de espadas", R.drawable.cinco_de_espadas, "TODO"),
            new Carta("Seis de espadas", R.drawable.seis_de_espadas, "TODO"),
            new Carta("Sete de espadas", R.drawable.sete_de_espadas, "TODO"),
            new Carta("Oito de espadas", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Nove de espadas", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Dez de espadas", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Valete de espadas", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Cavaleiro de espadas", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Rainha de espadas", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Rei de espadas", R.drawable.oito_de_espadas, "TODO"),


            new Carta("Ás de copas", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Dois de copas", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Três de copas", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Quatro de copas", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Cinco de copas", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Seis de copas", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Sete de copas", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Oito de copas", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Nove de copas", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Dez de copas", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Valete de copas", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Cavaleiro de copas", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Rainha de copas", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Rei de copas", R.drawable.oito_de_espadas, "TODO"),


            new Carta("Ás de pentáculos", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Dois de pentáculos", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Três de pentáculos", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Quatro de pentáculos", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Cinco de pentáculos", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Seis de pentáculos", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Sete de pentáculos", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Oito de pentáculos", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Nove de pentáculos", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Dez de pentáculos", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Valete de pentáculos", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Cavaleiro de pentáculos", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Rainha de pentáculos", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Rei de pentáculos", R.drawable.oito_de_espadas, "TODO"),


            new Carta("Ás de ouros", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Dois de ouros", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Três de ouros", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Quatro de ouros", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Cinco de ouros", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Seis de ouros", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Sete de ouros", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Oito de ouros", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Nove de ouros", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Dez de ouros", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Valete de ouros", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Cavaleiro de ouros", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Rainha de ouros", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Rei de ouros", R.drawable.oito_de_espadas, "TODO"),


            new Carta("O Louco", R.drawable.oito_de_espadas, "TODO"),
            new Carta("O Mago", R.drawable.oito_de_espadas, "TODO"),
            new Carta("A Suma Sacerdotisa", R.drawable.oito_de_espadas, "TODO"),
            new Carta("A Imperatriz", R.drawable.oito_de_espadas, "TODO"),
            new Carta("O Imperador", R.drawable.oito_de_espadas, "TODO"),
            new Carta("O Papa", R.drawable.oito_de_espadas, "TODO"),
            new Carta("Os Enamorados", R.drawable.oito_de_espadas, "TODO"),
            new Carta("A Carruagem", R.drawable.oito_de_espadas, "TODO"),
            new Carta("A Justiça", R.drawable.oito_de_espadas, "TODO"),
            new Carta("O Eremita", R.drawable.oito_de_espadas, "TODO"),
            new Carta("A Força", R.drawable.oito_de_espadas, "TODO"),
            new Carta("O Enforcado", R.drawable.oito_de_espadas, "TODO"),
            new Carta("A Morte", R.drawable.oito_de_espadas, "TODO"),
            new Carta("A Temperança", R.drawable.oito_de_espadas, "TODO"),
            new Carta("O Diabo", R.drawable.oito_de_espadas, "TODO"),
            new Carta("A Torre", R.drawable.oito_de_espadas, "TODO"),
            new Carta("A Estrela", R.drawable.oito_de_espadas, "TODO"),
            new Carta("A Lua", R.drawable.oito_de_espadas, "TODO"),
            new Carta("O Sol", R.drawable.oito_de_espadas, "TODO"),
            new Carta("O Julgamento", R.drawable.oito_de_espadas, "TODO"),
            new Carta("O Mundo", R.drawable.oito_de_espadas, "TODO")



    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uma_carta);

        Carta q = cartas[rgenerador.nextInt(cartas.length)];
        final ImageView iv = (ImageView) findViewById(R.id.imagem_carta);
        final TextView nomeCarta = (TextView) findViewById(R.id.nome_carta);
        final TextView textoCarta = (TextView) findViewById(R.id.texto);
        voltar = findViewById(R.id.button_voltar_taça_uma_carta);

        nomeCarta.setText(q.nome);
        iv.setImageResource(q.imagemID);
        textoCarta.setText(q.texto);

        View nextButton = findViewById(R.id.button_embaralhar_taça_um);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Carta q = cartas[rgenerador.nextInt(cartas.length)];
                nomeCarta.setText(q.nome);
                iv.setImageResource(q.imagemID);
                textoCarta.setText(q.texto);
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