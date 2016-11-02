package com.c9mj.platform.explore.ui;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.c9mj.platform.R;
import com.c9mj.platform.widget.fragment.LazyFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * author: LMJ
 * date: 2016/9/1
 */
public class ExploreFragment extends LazyFragment {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.fab)
    FloatingActionButton fab;
    @BindView(R.id.text)
    TextView text;

    public static ExploreFragment newInstance() {
        ExploreFragment fragment = new ExploreFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_explore, container, false);
        ButterKnife.bind(this, view);

        return view;
    }

    @Override
    protected void initLazyView(@Nullable Bundle savedInstanceState) {
        initToolBar();
    }

    private void initToolBar() {
        toolbar.setTitle(getString(R.string.title_explore));
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
    }

}
