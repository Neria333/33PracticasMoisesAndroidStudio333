package com.example.practica_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnSiguiente, btnPasoNombre;
    EditText txtNombre;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      btnSiguiente = findViewById(R.id.referencia1);
      btnPasoNombre = findViewById(R.id.btnPasoNombre);
      txtNombre = findViewById(R.id.txtNombre);

        btnPasoNombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pasaParametro(view);
            }
        });



    }


    public void sigPantalla(View v){

        //DEFINIMOS EL INTERT
        Intent intent = new Intent (this, pantalla2.class);
        startActivity(intent);
    }

    public void pasaParametro(View v){

     Intent Intent = new Intent(this,pantalla3.class);
     Intent.putExtra("nombre", txtNombre.getText().toString());
     startActivity(Intent);
    }


}