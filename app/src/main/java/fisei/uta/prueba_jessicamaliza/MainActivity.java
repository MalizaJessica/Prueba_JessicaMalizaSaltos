package fisei.uta.prueba_jessicamaliza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etNombres;
    EditText etApellidos;
    EditText etBase;
    EditText etExponente;
    EditText etFactorial;
    EditText etPotencia;
    Button btnSiguiente;
    Button btnMostrarResultados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}