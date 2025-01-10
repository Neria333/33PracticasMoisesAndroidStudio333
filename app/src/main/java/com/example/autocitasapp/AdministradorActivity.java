package com.example.autocitasapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Toast;

public class AdministradorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrador);

        // Obtener referencias a los checkboxes
        CheckBox checkBox101 = findViewById(R.id.checkBox101);
        CheckBox checkBox102 = findViewById(R.id.checkBox102);
        CheckBox checkBox103 = findViewById(R.id.checkBox103);
        CheckBox checkBox104 = findViewById(R.id.checkBox104);
        CheckBox checkBox105 = findViewById(R.id.checkBox105);

        CheckBox checkBoxAdmin = findViewById(R.id.checkBoxAdmin);
        CheckBox checkBoxConductor = findViewById(R.id.checkBoxConductor);
        CheckBox checkBoxVerificador = findViewById(R.id.checkBoxVerificador);

        // Seleccionar automáticamente las casillas requeridas
        checkBox101.setChecked(true);
        checkBox102.setChecked(true);
        checkBox103.setChecked(true);
        checkBox105.setChecked(true);
        checkBoxConductor.setChecked(true);

        // Botones
        Button btnEditar = findViewById(R.id.btnEditar);
        Button btnGuardar = findViewById(R.id.btnGuardar);

        // Botón con imagen
        ImageButton btnFotoConductor = findViewById(R.id.btnFotoConductor);
        btnFotoConductor.setOnClickListener(v ->
                Toast.makeText(this, "Foto del conductor seleccionada", Toast.LENGTH_SHORT).show()
        );

        // Configurar acciones para los botones
        btnEditar.setOnClickListener(v ->
                Toast.makeText(this, "Editar acción en construcción", Toast.LENGTH_SHORT).show()
        );

        btnGuardar.setOnClickListener(v -> {
            StringBuilder seleccionados = new StringBuilder("Seleccionados: ");

            // Verificar IDs seleccionados
            if (checkBox101.isChecked()) seleccionados.append("ID 101 ");
            if (checkBox102.isChecked()) seleccionados.append("ID 102 ");
            if (checkBox103.isChecked()) seleccionados.append("ID 103 ");
            if (checkBox104.isChecked()) seleccionados.append("ID 104 ");
            if (checkBox105.isChecked()) seleccionados.append("ID 105 ");

            // Verificar roles seleccionados
            if (checkBoxAdmin.isChecked()) seleccionados.append("- Admin ");
            if (checkBoxConductor.isChecked()) seleccionados.append("- Conductor ");
            if (checkBoxVerificador.isChecked()) seleccionados.append("- Verificador ");

            Toast.makeText(this, seleccionados.toString(), Toast.LENGTH_SHORT).show();
        });
    }
}
