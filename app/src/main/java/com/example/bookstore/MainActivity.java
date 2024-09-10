package com.example.bookstore;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.Button;
import android.view.View;
import java.util.List;
import android.content.Intent;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private BooksSelector bs = new BooksSelector();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });


    }
    public void searchBooks(View view){
        //TextView result = (TextView) findViewById(R.id.result);
        Spinner writer = (Spinner) findViewById(R.id.writers);
        String selectedWriter = String.valueOf(writer.getSelectedItem());
        //result.setText(selectedWriter);
        List<String> bookList = bs.getResult(selectedWriter);
        String[] BookArray = bookList.toArray(new String[0]);


        Intent intent = new Intent(this,Second_Activity.class);
        intent.putExtra("selectedWriter",selectedWriter);
        intent.putExtra("books",BookArray);
        startActivity(intent);

    }


}