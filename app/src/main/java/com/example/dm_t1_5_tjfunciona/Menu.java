package com.example.dm_t1_5_tjfunciona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    Button btn_container;
    Button btn_helper;
    Button btn_google;
    Button btn_legacy;
    Button btn_acerca;
    Button btn_salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn_container =  findViewById(R.id.btn_container);
        btn_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Container.class);
                startActivity(intent);
            }
        });

        btn_helper = findViewById(R.id.btn_helpers);
        btn_helper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(view.getContext(), Help.class);
                //startActivity(intent);
            }
        });

        btn_google = findViewById(R.id.btn_legacy);
        btn_google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(view.getContext(), Google.class);
                //startActivity(intent);
            }
        });

        btn_legacy = findViewById(R.id.btn_acerca);
        btn_legacy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(view.getContext(), Legacy.class);
                //startActivity(intent);
            }
        });
        btn_acerca = findViewById(R.id.btn_acerca);
        btn_acerca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(view.getContext(), Acerca.class);
                //startActivity(intent);
            }
        });

        btn_salir = findViewById(R.id.btn_cerrar);
        btn_salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}