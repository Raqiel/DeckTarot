package com.example.decktarot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView umacarta = findViewById(R.id.card_view_uma_carta);
        CardView duascartas = findViewById(R.id.card_view_duas_cartas);
        CardView trescartas = findViewById(R.id.card_view_tres_cartas);
        CardView quatrocartas = findViewById(R.id.card_view_quatro_cartas);

        umacarta.setOnClickListener(this);
        duascartas.setOnClickListener(this);
        trescartas.setOnClickListener(this);
        quatrocartas.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.card_view_uma_carta:
                Intent intent1 = new Intent(getApplicationContext(),UmaCarta.class);
                startActivity(intent1);
                break;
            case R.id.card_view_duas_cartas:
                Intent intent2 = new Intent(getApplicationContext(),DuasCartas.class);
                startActivity(intent2);
                break;
            case R.id.card_view_tres_cartas:
                Intent intent3 = new Intent(getApplicationContext(),TresCartas.class);
                startActivity(intent3);
                break;
            case R.id.card_view_quatro_cartas:
                Intent intent4 = new Intent(getApplicationContext(),QuatroCartas.class);
                startActivity(intent4);
                break;

        }

    }
}