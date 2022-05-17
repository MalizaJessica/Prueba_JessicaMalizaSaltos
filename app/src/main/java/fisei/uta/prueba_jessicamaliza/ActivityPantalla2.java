package fisei.uta.prueba_jessicamaliza;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityPantalla2 extends AppCompatActivity {

    EditText editTextName2;
    EditText editTextBase2;
    Button button_Siguiente;
    Button button_cerrar;

    ActivityResultLauncher<Intent> resultado;

    String datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextName2 = findViewById(R.id.editTextName2);
        editTextBase2 = findViewById(R.id.editTextBase2);
        button_Siguiente = findViewById(R.id.buttonSiguiente2);
        button_cerrar = findViewById(R.id.button_Cerrar);


    }

    public void OnClickSiguiente(View view) {
        Intent intent = new Intent(this, ActivityPantalla2.class);
        // resultado.launch(intent);
    }

    public void OnClickCerrar(View view) {
        String items = editTextName2 .getText().toString() + "_" +  editTextBase2 .getText().toString();

        Intent intent = new Intent();
        intent.setData(Uri.parse(items));

        setResult(Activity.RESULT_OK, intent);

        finish();
    }
}