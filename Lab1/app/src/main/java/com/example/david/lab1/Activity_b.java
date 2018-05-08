package com.example.david.lab1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Activity_b extends AppCompatActivity {

        TextView prueba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        usuario item = intent.getParcelableExtra(Activity_a.PARCELABLE_ITEM);
        String objeto = item.toString();
        System.out.print(objeto);
        prueba = findViewById(R.id.textView);
        prueba.setText(objeto);

    }

}
