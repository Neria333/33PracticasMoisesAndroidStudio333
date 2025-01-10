package com.example.autocitasapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class InicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        // Obtener los botones usando findViewById
        Button btnRegistrarCita = findViewById(R.id.btnRegistrarCita);
        Button btnVerificarVehiculo = findViewById(R.id.btnVerificarVehiculo);
        Button btnAdministrarPerfil = findViewById(R.id.btnAdministrarPerfil);
        Button btnAsignarPerfiles = findViewById(R.id.btnAsignarPerfiles);
        Button btnPagarServicio = findViewById(R.id.btnPagarServicio);

        // Configurar listeners para cada botón
        btnRegistrarCita.setOnClickListener(v ->
                Toast.makeText(this, "Registrar cita", Toast.LENGTH_SHORT).show()
        );

        btnVerificarVehiculo.setOnClickListener(v ->
                Toast.makeText(this, "Verificar vehículo", Toast.LENGTH_SHORT).show()
        );

        btnAdministrarPerfil.setOnClickListener(v -> {
            Intent intent = new Intent(InicioActivity.this, AdministradorActivity.class);
            startActivity(intent);
        });

        btnAsignarPerfiles.setOnClickListener(v ->
                Toast.makeText(this, "Asignar perfiles", Toast.LENGTH_SHORT).show()
        );

        btnPagarServicio.setOnClickListener(v ->
                Toast.makeText(this, "Pagar servicio", Toast.LENGTH_SHORT).show()
        );
    }
}
