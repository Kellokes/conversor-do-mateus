package br.edu.puccampinas.conversor2;

import br.edu.puccampinas.conversor2.enums.Scale;

/**
 * Created by mateusdias on 14/03/15.
 */
public class Temperature {

    private Scale scale;
    private Double value;

    public Scale getScale() {
        return scale;
    }

    public void setScale(Scale scale) {
        this.scale = scale;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }


}
