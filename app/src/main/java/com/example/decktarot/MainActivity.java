package com.example.decktarot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;

import com.example.decktarot.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<CarouselModel> categoryList = new ArrayList<>();
        categoryList.add(new CarouselModel(R.drawable.category_love, "Amor"));
        categoryList.add(new CarouselModel(R.drawable.category_work, "Trabalho"));
        categoryList.add(new CarouselModel(R.drawable.o_diabo, "Pessoal"));
        categoryList.add(new CarouselModel(R.drawable.o_eremita, "Sim ou não"));
        categoryList.add(new CarouselModel(R.drawable.o_mundo, "Todas as cartas"));


        CarouselAdapter adapter = new CarouselAdapter(categoryList);
        binding.carousel.setAdapter(adapter);
        binding.carousel.set3DItem(true);
        binding.carousel.setInfinite(true);
        binding.carousel.setAlpha(false);




    }


}