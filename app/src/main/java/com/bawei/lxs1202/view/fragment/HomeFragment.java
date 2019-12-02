package com.bawei.lxs1202.view.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bawei.lxs1202.R;
import com.bawei.lxs1202.base.BaseFragment;
import com.bawei.lxs1202.util.NetUtil;

/**
 * 作者：梁兴松
 * 时间：2019/12/2  14:36
 * 类名：com.bawei.lxs1202.view.fragment
 */

public class HomeFragment extends BaseFragment {
    private TextView textView;
    private ImageView imageView;
    @Override
    protected void initView(View view) {
        textView = view.findViewById(R.id.tv);
        imageView = view.findViewById(R.id.iv);
    }

    @Override
    protected int LayoutId() {
        return R.layout.home;
    }

    @Override
    protected void initData() {
        if (NetUtil.getInstance().hasNet(getActivity())){
            textView.setVisibility(View.VISIBLE);
            imageView.setVisibility(View.GONE);
        }else{
            textView.setVisibility(View.GONE);
            imageView.setVisibility(View.VISIBLE);
        }
    }
}
