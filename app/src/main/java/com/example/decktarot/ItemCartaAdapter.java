package com.example.decktarot;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemCartaAdapter extends RecyclerView.Adapter<ItemCartasViewHolder> {

    private Context context;
    private ArrayList<ItemCartas> itens;

    public ItemCartaAdapter(Context context, ArrayList<ItemCartas> itens) {
        this.context = context;
        this.itens = itens;
    }

    @NonNull
    @Override
    public ItemCartasViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_cartas, parent, false);
        ItemCartasViewHolder viewHolder = new ItemCartasViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemCartasViewHolder holder, int position) {
        ItemCartas itemCartas = itens.get(position);
        holder.imagemID.setImageResource(itemCartas.getImagemID());
        holder.texto.setText(itemCartas.getTexto());
        holder.nome.setText(itemCartas.getNome());
    }

    @Override
    public int getItemCount() {
        return itens.size() ;
    }
}
