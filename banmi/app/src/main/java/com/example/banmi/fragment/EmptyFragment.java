package com.example.banmi.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.banmi.R;
import com.example.banmi.base.BaseFragment;
import com.example.banmi.presenter.EmptyPresenter;
import com.example.banmi.view.EmptyView;

/**
 * A simple {@link Fragment} subclass.
 */
public class EmptyFragment extends BaseFragment<EmptyView,EmptyPresenter<EmptyView>> implements EmptyView {


    @Override
    protected EmptyPresenter<EmptyView> createPresenter() {
        return new EmptyPresenter<>();
    }

    @Override
    protected void initService() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected int createLayout() {
        return R.layout.fragment_empty;
    }
}
