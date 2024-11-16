package com.example.practica_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class pantalla3 extends AppCompatActivity {

    TextView lblA3Nombrew;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla3);
        lblA3Nombrew = findViewById(R.id.lbl3Datos);

        Bundle parametro = getIntent().getExtras();
        lblA3Nombrew.setText("bienvenido: "+parametro.getString("nombre"));
    }

}