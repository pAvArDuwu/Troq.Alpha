package com.example.miapicacion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ValidarActivity extends AppCompatActivity {

    private Button btnValidarCodigo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_validar);


        btnValidarCodigo = findViewById(R.id.btnValidarCodigo);

        // Le ponemos acción al botón
        btnValidarCodigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para abrir InicioActivity
                Intent intent = new Intent(ValidarActivity.this, InicioActivity.class);
                startActivity(intent);
                finish(); // Esto cierra ValidarActivity para que no puedan volver atrás
            }
        });
    }
}
