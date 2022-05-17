package fisei.uta.prueba_jessicamaliza;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editTextNombres;
    EditText editTextApellidos;
    EditText editTextBase;
    EditText editTextExponente;
    EditText editTextFactorial;
    EditText editTextPotencia;
    Button button_Siguiente;
    Button button_MostrarResultados;
    //

    ///realizamos el metodo

    //OBTENER LOS DATOS  ENVIADOS AL CERRAR LA ACTIVIDAD (DESDE ATRAS-ADELANTE )
    ActivityResultLauncher<Intent> activityResult =
            registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {

                    //procesasr los datos
                    if (result.getResultCode() == Activity.RESULT_OK)
                    {
                        //obtener los datos regresados
                        Intent data = result.getData();
                        //Toast.makeText(MainActivity.this, "Datos regresados" + data.getDataString(), Toast.LENGTH_LONG).show();

                        //textViewDatos.setText(data.getDataString());

                    }
                }
            });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextNombres = findViewById(R.id.editTextName);
        editTextApellidos=findViewById(R.id.editTextApellido);
        editTextBase=findViewById(R.id.editTextBase);
        editTextExponente=findViewById(R.id.editTextExponente);
         editTextFactorial=findViewById(R.id.editTextFactorial);
        editTextPotencia=findViewById(R.id.editTextPotencia);
        button_Siguiente = findViewById(R.id.button_Siguiente);

    }
    public void OnClickSiguiente(View view){
        Intent intent = new Intent(this, ActivityPantalla2.class);
       // resultado.launch(intent);
    }


    public void onCLickMonstrarActivitie(View view){

        //Mostrar activitie

        Intent intent = new Intent(this, ActivityPantalla2.class);

        //this.startActivity(intent);
        //utilizar actividades que  van aregresar datos
        activityResult.launch(intent);
    }

}