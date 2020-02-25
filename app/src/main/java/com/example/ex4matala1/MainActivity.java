package com.example.ex4matala1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b;
    int x=0;
    int y=7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = findViewById(R.id.b);
    }

    public void boom(View view) {

        b.setText("This is a click number:"+x);


        if((x%y==0)||((x%10)==y)) {
            if (x == 0)
            {
            }
            else
             {
                b.setText("boom");
             }
        }
         x++;
    }
}
