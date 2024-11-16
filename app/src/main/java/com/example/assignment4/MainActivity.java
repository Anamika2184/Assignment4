package com.example.assignment4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView citrusFruitsTextView, berriesTextView, tropicalFruitsTextView;
    private ImageView fruitImageView;
    private Button learnMoreButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize TextViews
        citrusFruitsTextView = findViewById(R.id.citrus_fruits);
        berriesTextView = findViewById(R.id.berries);
        tropicalFruitsTextView = findViewById(R.id.tropical_fruits);

        // Initialize ImageView
        fruitImageView = findViewById(R.id.fruit);

        // Initialize Button
        learnMoreButton = findViewById(R.id.learn_more_button);

        // Set Click Listener for TextViews
        citrusFruitsTextView.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Citrus Fruits: Orange, Lemon, Lime", Toast.LENGTH_SHORT).show());

        berriesTextView.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Berries: Strawberry, Blueberry, Raspberry", Toast.LENGTH_SHORT).show());

        tropicalFruitsTextView.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Tropical Fruits: Mango, Pineapple, Papaya", Toast.LENGTH_SHORT).show());

        // Set Click Listener for Button
        learnMoreButton.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Explore more about fruits!", Toast.LENGTH_SHORT).show());
    }
}
