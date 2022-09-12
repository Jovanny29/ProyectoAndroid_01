package com.example.dm_t1_5_tjfunciona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.security.Principal;

public class MainActivity extends AppCompatActivity {
    EditText et_user;
    EditText et_password;
    Button btn_ingresar;
    Button btn_salir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_user = findViewById(R.id.ed_amUser);
        et_password = findViewById(R.id.et_amPassword);
        btn_ingresar = findViewById(R.id.bt_am_ingresar);
        btn_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et_user.getText().toString().equals("") &&
                et_password.getText().toString().equals("")) {
                    Intent intent = new Intent(view.getContext(), Menu.class);
                    startActivity(intent);
                }
            }
        });
        btn_salir = findViewById(R.id.bt_am_salir);
        btn_salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hasta pronto", Toast.LENGTH_SHORT).show();
                finish();
            }
        });



    }
}