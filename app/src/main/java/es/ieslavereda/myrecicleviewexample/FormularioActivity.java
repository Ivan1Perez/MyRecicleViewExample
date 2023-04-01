package es.ieslavereda.myrecicleviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.List;

public class FormularioActivity extends AppCompatActivity {

    private TextInputEditText editTextNombre;
    private TextInputEditText editTextApellidos;
    private Spinner spinner;
    private Button buttonAdd;
    private Button cancel;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        editTextNombre = findViewById(R.id.editTextNombre);
        editTextApellidos = findViewById(R.id.editTextApellidos);
        buttonAdd = findViewById(R.id.buttonAceptar);
        cancel = findViewById(R.id.buttonCancelar);
        spinner = findViewById(R.id.spinner);

        List<String> ocupacion = new ArrayList<>();
        ocupacion.add("Actor");
        ocupacion.add("Albanyil");
        ocupacion.add("Banquero");
        ocupacion.add("Cocinero");
        ocupacion.add("Estudiante");
        ocupacion.add("Instagramer");
        ocupacion.add("Pintor");
        ocupacion.add("Policia");
        ocupacion.add("Político Activo");
        ocupacion.add("Político Retirado");
        ocupacion.add("Vendedor");
        ocupacion.add("Youtuber");

        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,ocupacion);
        spinner.setAdapter(myAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                adapterView.getItemAtPosition(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}