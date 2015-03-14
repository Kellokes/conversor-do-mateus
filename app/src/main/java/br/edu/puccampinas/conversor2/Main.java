package br.edu.puccampinas.conversor2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.edu.puccampinas.conversor2.enums.Scale;


public class Main extends ActionBarActivity {

    private EditText etValue;
    private Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etValue = (EditText)this.findViewById(R.id.etValue);
        btnConvert = (Button)this.findViewById(R.id.btnConvert);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ler o valor digitado, usar em conversor e devolver o resultado em mensagem
                Temperature tConverter = new Temperature();
                tConverter.setValue(Double.parseDouble(etValue.getText().toString()));
                tConverter.setScale(Scale.FAHRENHEIT);

                Temperature tConvertida = Conversor.converter(tConverter,Scale.CELSIUS);

                Toast.makeText(Main.this,"Em Celsius = " + tConvertida.getValue().toString(),Toast.LENGTH_LONG).show();
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
