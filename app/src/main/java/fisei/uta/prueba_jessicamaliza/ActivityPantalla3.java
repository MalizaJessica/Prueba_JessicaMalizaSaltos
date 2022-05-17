package fisei.uta.prueba_jessicamaliza;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityPantalla3 extends AppCompatActivity {
    EditText editTextn;
    EditText editTexta;
    EditText editTextb;
    EditText editTexte;
    EditText editTextnn;
    Button button_cerrar;


    String datos;
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
        editTextn=findViewById(R.id.editTextn);
        editTexta=findViewById(R.id.editTexta);
        editTextb=findViewById(R.id.editTextb);
        editTexte=findViewById(R.id.editTexte);
        editTextnn=findViewById(R.id.editTextnn);

    }




    }
