package com.example.banmi.base;

import android.view.View;

public abstract class BaseActivity<V,P extends BasePresenter<V>> extends SimpleActivity{

    public P mPresenter;

    @Override
    protected void viewCreate(View view) {
        mPresenter = createPresenter();
        mPresenter.attachView((V) this);
    }

    protected abstract P createPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mPresenter == null){
            mPresenter.deachView();
            mPresenter = null;
        }
    }
}
