package com.example.miapicacion;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Definir el tiempo de retraso (en milisegundos)
    private static final int SPLASH_DELAY = 3000; // 3 segundos

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  // Asegúrate de tener este layout

        // Usamos un Handler para ejecutar el código después del tiempo de retraso
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Intent para pasar a la siguiente actividad
                Intent intent = new Intent(MainActivity.this, InicioActivity.class);  // Reemplaza con la actividad que deseas iniciar
                startActivity(intent);

                // Cerrar la actividad actual (MainActivity)
                finish();
            }
        }, SPLASH_DELAY); // Establecer el retraso
    }
}
