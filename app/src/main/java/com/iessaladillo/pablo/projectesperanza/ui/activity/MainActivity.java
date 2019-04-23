package com.iessaladillo.pablo.projectesperanza.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;

import com.iessaladillo.pablo.projectesperanza.R;
import com.iessaladillo.pablo.projectesperanza.databinding.ActivityMainBinding;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding b;
    private ViewModelMainActivity vm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b = DataBindingUtil.setContentView(this, R.layout.activity_main);
        vm = ViewModelProviders.of(this).get(ViewModelMainActivity.class);
        initView();

    }

    private void initView() {
        b.Boca.getEditText().setText(String.valueOf(vm.radio));
        b.Boca.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (TextUtils.isEmpty(b.Boca.getEditText().getText().toString()))
                    vm.setRadio(0);
                else
                    vm.setRadio(Float.parseFloat(b.Boca.getEditText().getText().toString()));
            }
        });
        b.nuevoVolante.getEditText().setText(String.valueOf(vm.perimetro));
        b.nuevoVolante.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                if (TextUtils.isEmpty(b.nuevoVolante.getEditText().getText().toString()))
                    vm.setPerimetro(0);
                else
                    vm.setPerimetro(Float.parseFloat(b.nuevoVolante.getEditText().getText().toString()));

            }
        });

        b.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularRadio();
            }
        });
        b.nuevoVolanteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularPerimetroVolante();
            }
        });


    }

    public void calcularRadio() {
        if (Objects.requireNonNull(b.Boca.getEditText()).getText() != null)
            b.radio.setText(String.valueOf(Float.parseFloat(b.Boca.getEditText().getText().toString()) / (2 * Math.PI)));
        else
            b.radio.setText("0");
    }


    public void calcularPerimetroVolante() {
        b.radio.setText(String.valueOf(Float.parseFloat(b.radio.getText().toString()) + Float.parseFloat(b.nuevoVolante.getEditText().getText().toString())));
        b.editText2.setText(String.valueOf(Math.PI * (Float.parseFloat(b.radio.getText().toString()) * 2)));
    }

}
