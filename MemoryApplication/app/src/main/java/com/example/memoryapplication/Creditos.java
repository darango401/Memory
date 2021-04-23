package com.example.memoryapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;


public class Creditos extends Activity {
    Button regresar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creditos);
        regresar = findViewById(R.id.button_second);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent regresar = new Intent(Creditos.this,MainActivity.class);
                startActivity(regresar);
            }
        });

    };

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {

    }
}