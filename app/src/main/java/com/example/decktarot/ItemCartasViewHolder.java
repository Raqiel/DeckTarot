package com.example.decktarot;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ItemCartasViewHolder extends RecyclerView.ViewHolder {

    ImageView imagemID;
    TextView nome;
    TextView texto;

    public ItemCartasViewHolder(@NonNull View itemView) {
        super(itemView);
        imagemID = itemView.findViewById(R.id.imagem_carta);
        nome = itemView.findViewById(R.id.nome_carta);
        texto = itemView.findViewById(R.id.texto);
    }
}
