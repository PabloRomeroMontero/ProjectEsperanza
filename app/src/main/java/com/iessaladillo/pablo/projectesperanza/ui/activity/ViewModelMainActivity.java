package com.iessaladillo.pablo.projectesperanza.ui.activity;

import androidx.lifecycle.ViewModel;

public class ViewModelMainActivity extends ViewModel {
    float radio;
    float perimetro;


    public ViewModelMainActivity(){
        radio=0;
        perimetro = 0;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }
}
