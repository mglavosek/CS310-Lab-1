package com.example.lab1a;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

import com.example.lab1a.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private String[] plot_fragments;
    private Random random;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        plot_fragments = getResources().getStringArray(R.array.plot_fragments);
        random = new Random();

        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView t = binding.outputLabel;
                int randomIndex = random.nextInt(plot_fragments.length);
                t.setText(plot_fragments[randomIndex]);
            }
        });
    }

}

