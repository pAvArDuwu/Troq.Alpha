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

public class RegistrarseActivity extends AppCompatActivity {

    // Declaramos el botón
    private Button registerNormalButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registrarse);

        // Ajustes de insets (lo que ya tenías)

        // Conectar el botón
        registerNormalButton = findViewById(R.id.registerNormalButton);

        // Agregar el evento de click
        registerNormalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crear el Intent para ir a ValidarActivity
                Intent intent = new Intent(RegistrarseActivity.this, ValidarActivity.class);
                startActivity(intent);
            }
        });
    }
}
