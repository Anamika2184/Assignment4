package com.example.assignment4;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Declare ImageViews and TextViews
    private ImageView appleImage, bananaImage, orangeImage, strawberryImage;
    private TextView appleText, bananaText, orangeText, strawberryText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Set the layout from XML file

        // Initialize the ImageViews
        appleImage = findViewById(R.id.apple);
        bananaImage = findViewById(R.id.banana);
        orangeImage = findViewById(R.id.orange);
        strawberryImage = findViewById(R.id.strawberry);

        // Initialize the TextViews
        appleText = findViewById(R.id.apple_text);
        bananaText = findViewById(R.id.banana_text);
        orangeText = findViewById(R.id.orange_text);
        strawberryText = findViewById(R.id.strawberry_text);
    }
}
