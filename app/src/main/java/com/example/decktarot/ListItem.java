package com.example.decktarot;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ListItem extends LinearLayout {
    private ImageView imageView;
    private TextView textView;

    public ListItem(Context context) {
        super(context);
        setOrientation(LinearLayout.HORIZONTAL);

        imageView = new ImageView(context);
        textView = new TextView(context);

        addView(imageView);
        addView(textView);
    }

    public void setImage(int imageResource) {
        imageView.setImageResource(imageResource);
    }

    public void setText(String text) {
        textView.setText(text);
    }
}
