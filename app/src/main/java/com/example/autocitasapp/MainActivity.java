package com.example.autocitasapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View; // Importante para manejar el clic en el botón

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Vincula el archivo XML
    }

    // Este método se llama cuando se hace clic en el botón Iniciar sesión
    public void onLoginClick(View view) {
        try {
            // Redirige a InicioActivity sin cerrar la aplicación
            Intent intent = new Intent(MainActivity.this, InicioActivity.class);
            startActivity(intent); // Lanza la actividad InicioActivity
        } catch (Exception e) {
            e.printStackTrace(); // Si ocurre un error, lo muestra en Logcat
        }
    }

    // Este método se llama cuando se hace clic en el botón Registrarse
    public void onRegisterClick(View view) {
        try {
            // Redirige a RegisterActivity
            Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(intent); // Lanza la actividad RegisterActivity
        } catch (Exception e) {
            e.printStackTrace(); // Si ocurre un error, lo muestra en Logcat
        }
    }
}
