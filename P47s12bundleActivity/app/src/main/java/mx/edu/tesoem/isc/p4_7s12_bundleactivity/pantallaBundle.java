package mx.edu.tesoem.isc.p4_7s12_bundleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class pantallaBundle extends AppCompatActivity {
    TextView nombre,correo,telefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_bundle);

        Datos datos = getIntent().getParcelableExtra("datosParce");
        nombre = findViewById(R.id.lblA2Nombre);
        correo = findViewById(R.id.lblA2Correo);
        telefono = findViewById(R.id.lblA2Telefono);

        nombre.setText(datos.getNombre());
        correo.setText(datos.getCorreo());
        telefono.setText(datos.getTelefono());

    }
}