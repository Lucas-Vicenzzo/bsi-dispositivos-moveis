package com.example.mobileapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Integer contador = 0;
    private TextView txtContador;
    private Button btMais;
    private Button btMenos;
    private Button buttonSobre;

    @Override
    protected void onCreate(Bundle savedInstaceState) {
        super.onCreate(savedInstaceState);
        setContentView(R.layout.activity_main);
        txtContador = findViewById(R.id.textContador);
        btMais = findViewById(R.id.buttonMais);
        btMenos = findViewById(R.id.buttonMenos);
        buttonSobre = findViewById(R.id.buttonSobre);
        txtContador.setText(String.valueOf(this.getContador()));
    }

    public Integer getContador() {
        return this.contador;
    }

    public void adicionar(View view) {
        this.contador++;
        txtContador.setText(String.valueOf(this.getContador()));
    }
    public void subtrair(View view) {
        this.contador--;
        txtContador.setText(String.valueOf(this.getContador()));
    }

    public void abreSobre(View view) {
        Intent i = new Intent(MainActivity.this, SobreActivity.class);
        i.putExtra("contador", this.contador);
        startActivity(i);
    }


}