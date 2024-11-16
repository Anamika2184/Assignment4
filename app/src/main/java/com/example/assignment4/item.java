package com.example.assignment4;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private ImageView appleImage, bananaImage, orangeImage, strawberryImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize ImageViews with correct IDs
        appleImage = findViewById(R.id.apple);
        bananaImage = findViewById(R.id.banana);
        orangeImage = findViewById(R.id.orange);
        strawberryImage = findViewById(R.id.strawberry);

        // Add functionality (e.g., click listeners)
        appleImage.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Apple: A sweet and nutritious fruit!", Toast.LENGTH_SHORT).show());

        bananaImage.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Banana: Great source of potassium!", Toast.LENGTH_SHORT).show());

        orangeImage.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Orange: Packed with Vitamin C!", Toast.LENGTH_SHORT).show());

        strawberryImage.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Strawberry: A tasty, antioxidant-rich berry!", Toast.LENGTH_SHORT).show());
    }
}
