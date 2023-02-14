package com.example.decktarot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class AllCards extends AppCompatActivity {

    private Button voltar;
    private RecyclerView recyclerView;
    private ItemCartaAdapter adapter;
    private ArrayList<ItemCartas> itens;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_cards);

        recyclerView = findViewById(R.id.recycler);
        itens = new ArrayList<ItemCartas>();
        itens.add(new ItemCartas("Ás de espadas", R.drawable.as_espadas, null));
        itens.add(new ItemCartas("Dois de espadas", R.drawable.dois_espadas, null));
        itens.add(new ItemCartas("Três de espadas", R.drawable.tres_espadas, null));
        itens.add(new ItemCartas("Quatro de espadas", R.drawable.quatro_espadas, null));
        itens.add(new ItemCartas("Cinco de espadas", R.drawable.cinco_espadas, null));
        itens.add(new ItemCartas("Seis de espadas", R.drawable.seis_espadas, null));
        itens.add(new ItemCartas("Sete de espadas", R.drawable.sete_espadas, null));
        itens.add(new ItemCartas("Oito de espadas", R.drawable.oito_espadas, null));
        itens.add(new ItemCartas("Nove de espadas", R.drawable.nove_espadas, null));
        itens.add(new ItemCartas("Dez de espadas", R.drawable.dez_espadas, null));
        itens.add(new ItemCartas("Valete de espadas", R.drawable.valete_espadas, null));
        itens.add(new ItemCartas("Cavaleiro de espadas", R.drawable.cavaleiro_espadas, null));
        itens.add(new ItemCartas("Rainha de espadas", R.drawable.rainha_espadas, null));
        itens.add(new ItemCartas("Rei de espadas", R.drawable.rei_espadas, null));


        itens.add(new ItemCartas("Ás de copas", R.drawable.as_copas, null));
        itens.add(new ItemCartas("Dois de copas", R.drawable.dois_copas, null));
        itens.add(new ItemCartas("Três de copas", R.drawable.tres_copas, null));
        itens.add(new ItemCartas("Quatro de copas", R.drawable.quatro_copas, null));
        itens.add(new ItemCartas("Cinco de copas", R.drawable.cinco_copas, null));
        itens.add(new ItemCartas("Seis de copas", R.drawable.seis_copas, null));
        itens.add(new ItemCartas("Sete de copas", R.drawable.sete_copas, null));
        itens.add(new ItemCartas("Oito de copas", R.drawable.oito_copas, null));
        itens.add(new ItemCartas("Nove de copas", R.drawable.nove_copas, null));
        itens.add(new ItemCartas("Dez de copas", R.drawable.dez_copas, null));
        itens.add(new ItemCartas("Valete de copas", R.drawable.valete_copas, null));
        itens.add(new ItemCartas("Cavaleiro de copas", R.drawable.cavaleiro_copas, null));
        itens.add(new ItemCartas("Rainha de copas", R.drawable.rainha_copas, null));
        itens.add(new ItemCartas("Rei de copas", R.drawable.rei_copas, null));


        itens.add(new ItemCartas("Ás de paus", R.drawable.as_paus, null));
        itens.add(new ItemCartas("Dois de paus", R.drawable.dois_paus, null));
        itens.add(new ItemCartas("Três de paus", R.drawable.tres_paus, null));
        itens.add(new ItemCartas("Quatro de paus", R.drawable.quatro_paus, null));
        itens.add(new ItemCartas("Cinco de paus", R.drawable.cinco_paus, null));
        itens.add(new ItemCartas("Seis de paus", R.drawable.seis_paus, null));
        itens.add(new ItemCartas("Sete de paus", R.drawable.sete_paus, null));
        itens.add(new ItemCartas("Oito de paus", R.drawable.oito_paus, null));
        itens.add(new ItemCartas("Nove de paus", R.drawable.nove_paus, null));
        itens.add(new ItemCartas("Dez de paus", R.drawable.dez_paus, null));
        itens.add(new ItemCartas("Valete de paus", R.drawable.valete_paaus, null));
        itens.add(new ItemCartas("Cavaleiro de paus", R.drawable.cavaleiro_paus, null));
        itens.add(new ItemCartas("Rainha de paus", R.drawable.rainha_paus, null));
        itens.add(new ItemCartas("Rei de paus", R.drawable.rei_paus, null));


        itens.add(new ItemCartas("Ás de ouros", R.drawable.as_ouros, null));
        itens.add(new ItemCartas("Dois de ouros", R.drawable.dois_ouros, null));
        itens.add(new ItemCartas("Três de ouros", R.drawable.tres_ouros, null));
        itens.add(new ItemCartas("Quatro de ouros", R.drawable.quatro_ouros, null));
        itens.add(new ItemCartas("Cinco de ouros", R.drawable.cinco_ouros, null));
        itens.add(new ItemCartas("Seis de ouros", R.drawable.seis_ouros, null));
        itens.add(new ItemCartas("Sete de ouros", R.drawable.sete_ouros, null));
        itens.add(new ItemCartas("Oito de ouros", R.drawable.oito_ouros, null));
        itens.add(new ItemCartas("Nove de ouros", R.drawable.nove_ouros, null));
        itens.add(new ItemCartas("Dez de ouros", R.drawable.dez_ouros, null));
        itens.add(new ItemCartas("Valete de ouros", R.drawable.valete_ouros, null));
        itens.add(new ItemCartas("Cavaleiro de ouros", R.drawable.cavaleiro_ouros, null));
        itens.add(new ItemCartas("Rainha de ouros", R.drawable.rainha_ouros, null));
        itens.add(new ItemCartas("Rei de ouros", R.drawable.rei_ouros, null));


        itens.add(new ItemCartas("O Louco", R.drawable.o_louco, null));
        itens.add(new ItemCartas("O Mago", R.drawable.o_mago, null));
        itens.add(new ItemCartas("A Suma Sacerdotisa", R.drawable.a_papisa, null));
        itens.add(new ItemCartas("A Imperatriz", R.drawable.a_imperatriz, null));
        itens.add(new ItemCartas("O Imperador", R.drawable.o_imperador, null));
        itens.add(new ItemCartas("O Papa", R.drawable.o_papa, null));
        itens.add(new ItemCartas("Os Enamorados", R.drawable.os_enamorados, null));
        itens.add(new ItemCartas("A Carruagem", R.drawable.o_carrp, null));
        itens.add(new ItemCartas("A Justiça", R.drawable.a_justica, null));
        itens.add(new ItemCartas("O Eremita", R.drawable.o_eremita, null));
        itens.add(new ItemCartas("A Força", R.drawable.a_forca, null));
        itens.add(new ItemCartas("O Enforcado", R.drawable.o_pendurado, null));
        itens.add(new ItemCartas("A Morte", R.drawable.a_morte, null));
        itens.add(new ItemCartas("A Temperança", R.drawable.a_temperanca, null));
        itens.add(new ItemCartas("O Diabo", R.drawable.o_diabo, null));
        itens.add(new ItemCartas("A Torre", R.drawable.a_torre, null));
        itens.add(new ItemCartas("A Estrela", R.drawable.a_estrela, null));
        itens.add(new ItemCartas("A Lua", R.drawable.a_lua, null));
        itens.add(new ItemCartas("O Sol", R.drawable.o_sol, null));
        itens.add(new ItemCartas("O Julgamento", R.drawable.o_julgamento, null));
        itens.add(new ItemCartas("O Mundo", R.drawable.o_mundo, null));
                adapter = new ItemCartaAdapter(AllCards.this, itens);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(AllCards.this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);





    }
}