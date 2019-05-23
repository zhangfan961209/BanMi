package com.example.banmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.banmi.base.BaseActivity;
import com.example.banmi.presenter.EmptyPresenter;
import com.example.banmi.view.EmptyView;
//石骚洋
public class MainActivity extends BaseActivity<EmptyView,EmptyPresenter<EmptyView>> implements EmptyView {

    @Override
    protected EmptyPresenter<EmptyView> createPresenter() {
        return new EmptyPresenter<>();
    }

    @Override
    protected void initData() {

    }

    @Override
    protected int creataLayout() {
        return R.layout.activity_main;
    }
}
