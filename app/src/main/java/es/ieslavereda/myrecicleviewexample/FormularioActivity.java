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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FormularioActivity extends AppCompatActivity {

    private TextInputEditText editTextNombre;
    private TextInputEditText editTextApellidos;
    private Spinner spinner;
    private Button buttonAdd;
    private Button buttonCancel;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        editTextNombre = findViewById(R.id.editTextNombre);
        editTextApellidos = findViewById(R.id.editTextApellidos);
        buttonAdd = findViewById(R.id.buttonAceptar);
        buttonCancel = findViewById(R.id.buttonCancelar);
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

        buttonAdd.setOnClickListener(view -> {
            String nombre = "", apellidos = "", spinnerItem = "";
            int spinnerPosition = spinner.getSelectedItemPosition();
            int imagenOcupacion;

            if(editTextNombre.getText()!=null && !editTextNombre.getText().toString().equals("")){
                nombre = editTextNombre.getText().toString();
                if(editTextApellidos.getText()!=null && !editTextApellidos.getText().toString().equals("")){
                    apellidos = editTextApellidos.getText().toString();

                    if (spinnerPosition != -1) {
                        spinnerItem = spinner.getItemAtPosition(spinnerPosition).toString();
                    } else {
                        spinnerItem = spinner.getItemAtPosition(0).toString();
                    }

                    imagenOcupacion = seleccionarImagenOcupacion(spinnerItem);
                    Usuario u = new Usuario(nombre, apellidos, spinnerItem, imagenOcupacion);
                    UsuarioRepository.getInstance().add(UsuarioRepository.getInstance().getSize(), u);
                }
            }


        });
    }

    private int seleccionarImagenOcupacion(String spinnerItem) {

        for(ImagenOcupacion img : ImagenOcupacion.values()){
            if(spinnerItem.equals(img.getNombre())){
                return img.getIdImagen();
            }
        }

        return 0;
    }
}