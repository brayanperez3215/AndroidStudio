package darkdesigner.buscarsalon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Salon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salon);

    }

    public void BuscarSalon (View vista){

        TextView Etiqueta = (TextView) findViewById(R.id.etiqueta);
        EditText Cuadro = (EditText) findViewById(R.id.cuadro);
        TextView Boton = (Button) findViewById(R.id.boton);

    }

    String salon = Cuadro.getText().toString();

    if (salon.equals("333")){
        Etiqueta.setText("sede ingenieria");

        }else{
            Etiqueta.setText("salon " + cuadro.getText() + "no existe");
        }


    }



