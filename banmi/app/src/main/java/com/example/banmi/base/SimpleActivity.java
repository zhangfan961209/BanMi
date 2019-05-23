package com.example.banmi.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public abstract class SimpleActivity extends AppCompatActivity {

    private Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = LayoutInflater.from(this).inflate(creataLayout(), null);
        setContentView(view);
        unbinder = ButterKnife.bind(this);
        viewCreate(view);
        initData();
    }

    protected abstract void initData();

    protected void viewCreate(View view){}

    protected abstract int creataLayout();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(unbinder == null){
            unbinder.unbind();
        }
    }
}
