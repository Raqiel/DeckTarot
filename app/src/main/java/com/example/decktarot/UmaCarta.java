package com.example.decktarot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class UmaCarta extends AppCompatActivity {

    private static final Random rgenerador = new Random();
    private static final Integer[] imagenesID =
            {R.drawable.as_de_copas, R.drawable.cinco_de_copas, R.drawable.dois_de_copas, R.drawable.as_de_espadas};

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

