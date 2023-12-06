package com.example.mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SobreActivity extends AppCompatActivity {

    private Integer contador;
    private TextView textContador;
    private Button backToHomeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.activity_sobre);
        this.contador = intent.getIntExtra("contador", 0);
        textContador = findViewById(R.id.textContadorSobre);
        backToHomeBtn = findViewById(R.id.backToHomeBtn);
        textContador.setText(String.valueOf(this.contador));
    }

    public void backToHome(View view) {
        Intent home = new Intent(SobreActivity.this, MainActivity.class);
        home.putExtra("contador", this.contador);
        startActivity(home);
    }
}