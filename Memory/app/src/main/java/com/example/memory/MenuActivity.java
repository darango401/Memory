package com.example.memory;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;


public class MenuActivity extends Activity {
    Button play, salir, creditos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        /*Botones como objetos*/
        play = findViewById(R.id.botonMainJugar);
        salir = findViewById(R.id.botonMainSalir);
        creditos = findViewById(R.id.botonMainCreditos);

        /*Annado eventos a los botones*/
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Iniciando Juego...");
                iniciarJuego();
            }
        });

        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        creditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent creditos = new Intent(MenuActivity.this,CreditosActivity.class);
                startActivity(creditos);
            }
        });
        /*Hasta aqui los botones*/

        /*Toolbar toolbar = findViewById(R.id.toolbar);*/


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        return true;
    }



    /*Creo iniciarJuego que es llamada desde play set in click listenner*/
    private void iniciarJuego(){
        Intent i = new Intent(MenuActivity.this, Juego.class);
        startActivity(i);
    }
}
