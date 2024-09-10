package com.example.bookstore;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Second_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        TextView result = (TextView) findViewById(R.id.result);

        String writer = getIntent().getStringExtra("selectedWriter");
        String[] books = getIntent().getStringArrayExtra("books");

        StringBuilder resultFormatted = new StringBuilder("Books of "+ writer + " are: \n\n");
        for (String results : books){
            resultFormatted.append(results).append('\n');
        }
        result.setText(resultFormatted.toString());


    }
}