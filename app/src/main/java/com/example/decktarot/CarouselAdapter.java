package com.example.decktarot;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.decktarot.databinding.CarouselItemBinding;

import java.util.List;

public class CarouselAdapter extends RecyclerView.Adapter<CarouselAdapter.CarouselViewHolder> {

    private List<CarouselModel> categoryList;
    private AdapterView.OnItemClickListener onItemClickListener;

    public CarouselAdapter(List<CarouselModel> categoryList) {
        this.categoryList = categoryList;
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public CarouselViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        CarouselItemBinding binding = CarouselItemBinding.inflate(layoutInflater, parent, false);
        return new CarouselViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CarouselViewHolder holder, @SuppressLint("RecyclerView") int position) {
        CarouselModel carousel = categoryList.get(position);
        ImageView cardImage = holder.binding.cardImage;
        TextView cardName = holder.binding.cardName;
        Glide.with(cardImage.getContext()).load(carousel.getImage()).into(cardImage);
        cardName.setText(carousel.getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(view.getContext(), UmaCarta.class);
                        view.getContext().startActivity(intent);
                        break;
                    case 1:
                        Intent intent2 = new Intent(view.getContext(), DuasCartas.class);
                        view.getContext().startActivity(intent2);
                        break;
                    case 2:
                        Intent intent3 = new Intent(view.getContext(), TresCartas.class);
                        view.getContext().startActivity(intent3);
                        break;
                    case 3:
                        Intent intent4 = new Intent(view.getContext(), QuatroCartas.class);
                        view.getContext().startActivity(intent4);
                        break;
                    case 4:
                        Intent intent5 = new Intent(view.getContext(), AllCards.class);
                        view.getContext().startActivity(intent5);
                        break;

                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public static class CarouselViewHolder extends RecyclerView.ViewHolder {
        private final CarouselItemBinding binding;

        public CarouselViewHolder(CarouselItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
