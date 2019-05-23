package com.example.banmi.base;

import java.lang.ref.WeakReference;

public class BasePresenter<V> {

    //弱引用
    private WeakReference<V> weakReference;

    public V mView;
    public void attachView(V v){
        weakReference = new WeakReference<V>(v);
        mView = weakReference.get();
    }

    public void deachView(){
        if(weakReference != null){
            weakReference.clear();
        }
    }
}
