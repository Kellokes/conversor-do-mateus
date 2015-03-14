package br.edu.puccampinas.conversor2;

import br.edu.puccampinas.conversor2.enums.Scale;

/**
 * Created by mateusdias on 14/03/15.
 */
public class Conversor {

    public static Temperature converter(Temperature t, Scale e){

        //ESTE CODIGO TEM PROBLEMAS, EXERCICIO: CONSERTAR...

        Temperature convertida = new Temperature();
        //°F = °C × 1,8 + 32
        if((t.getScale() == Scale.CELSIUS) && (e == Scale.FAHRENHEIT)){
            //de C para F
            convertida.setValue((t.getValue() * 1.8) + 32.0);
            convertida.setScale(Scale.FAHRENHEIT);
        } else {
            //de F para C
            convertida.setValue((t.getValue() -32) / 1.8);
            convertida.setScale(Scale.CELSIUS);
        }

        return convertida;
    }
}