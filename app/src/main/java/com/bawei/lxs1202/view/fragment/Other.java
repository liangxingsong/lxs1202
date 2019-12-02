package com.bawei.lxs1202.view.fragment;

import android.view.View;
import android.widget.Button;

import com.bawei.lxs1202.R;
import com.bawei.lxs1202.base.BaseFragment;
import com.bawei.lxs1202.view.activity.MainActivity;

/**
 * 作者：梁兴松
 * 时间：2019/12/2  14:38
 * 类名：com.bawei.lxs1202.view.fragment
 */

public class Other extends BaseFragment {
    private Button button;
    @Override
    protected void initView(View view) {
        button = view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.data();
            }
        });
    }

    @Override
    protected int LayoutId() {
        return R.layout.other;
    }

    @Override
    protected void initData() {

    }
}
