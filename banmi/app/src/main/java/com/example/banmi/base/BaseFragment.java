package com.example.banmi.base;

import android.view.View;

public abstract class BaseFragment <V,P extends BasePresenter<V>> extends SimpleFragment{

    public P mPresenter;

    @Override
    protected void viewCreate(View inflate) {
        mPresenter = createPresenter();
        mPresenter.attachView((V) this);
    }

    protected abstract P createPresenter();

    @Override
    public void onDestroy() {
        super.onDestroy();
        if(mPresenter == null){
            mPresenter.deachView();
            mPresenter = null;
        }
    }
}
