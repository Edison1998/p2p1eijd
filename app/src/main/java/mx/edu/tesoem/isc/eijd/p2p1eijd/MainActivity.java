package mx.edu.tesoem.isc.eijd.p2p1eijd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

import mx.edu.tesoem.isc.eijd.p2p1eijd.R;

public class MainActivity extends AppCompatActivity {

    RadioButton visc, vitics, vambiental, vgastro;
    CheckBox chcasa, chescuela,chtrabajo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        visc = (RadioButton)findViewById(R.id.rdisc);
        vitics=(RadioButton)findViewById(R.id.rdtics);
        vambiental=(RadioButton)findViewById(R.id.rdambiental);
        vgastro=(RadioButton)findViewById(R.id.rdgastro);
        chcasa=(CheckBox)findViewById(R.id.cbcasa);
        chescuela=(CheckBox)findViewById(R.id.cbescuela);
        chtrabajo=(CheckBox)findViewById(R.id.cbtrabajo);

    }

    public void seleccion(View view){
        if(visc.isChecked()) Toast.makeText(this, "INGENIERIA EN SISTEMAS COMPUTACIONALES", Toast.LENGTH_SHORT).show();
        if(vitics.isChecked()) Toast.makeText(this, "INGENIERIA EN TECNOLOGIAS DE LA INFORMACION Y COMUNICACION", Toast.LENGTH_SHORT).show();
        if(vambiental.isChecked()) Toast.makeText(this, "INGENIERIA AMBIENTAL", Toast.LENGTH_SHORT).show();
        if(vgastro.isChecked()) Toast.makeText(this, "LICENCIATURA EN GASTRONOMIA", Toast.LENGTH_SHORT).show();
        if(chescuela.isChecked()) Toast.makeText(this, "ESCUELA", Toast.LENGTH_SHORT).show();
        if(chtrabajo.isChecked()) Toast.makeText(this, "TRABAJO", Toast.LENGTH_SHORT).show();
        if(chcasa.isChecked()) Toast.makeText(this, "CASA", Toast.LENGTH_SHORT).show();
    }
}
