package com.iessaladillo.pablo.projectesperanza.ui.activity;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class ViewModelFactoryActivityMain implements ViewModelProvider.Factory{


    public ViewModelFactoryActivityMain() {
    }

    @NonNull
    @Override
    public <T extends ViewModel> T create(Class <T> modelClass){
        return (T) new ViewModelMainActivity();
    }
}
