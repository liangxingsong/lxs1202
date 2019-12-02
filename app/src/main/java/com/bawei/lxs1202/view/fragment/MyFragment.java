package com.bawei.lxs1202.view.fragment;

import android.view.View;
import android.widget.GridView;
import android.widget.Toast;

import com.bawei.lxs1202.R;
import com.bawei.lxs1202.base.BaseFragment;
import com.bawei.lxs1202.contract.Mycontract;
import com.bawei.lxs1202.model.bean.Bean;
import com.bawei.lxs1202.presenter.Mypresenter;
import com.bawei.lxs1202.view.adapter.MyAdapter;

/**
 * 作者：梁兴松
 * 时间：2019/12/2  14:40
 * 类名：com.bawei.lxs1202.view.fragment
 */

public class MyFragment extends BaseFragment implements Mycontract.IView {
    private GridView gridView;
    private Mypresenter mypresenter;
    @Override
    protected void initView(View view) {
        gridView = view.findViewById(R.id.gv);

    }

    @Override
    protected int LayoutId() {
        return R.layout.my;
    }

    @Override
    protected void initData() {
        mypresenter = new Mypresenter();
        mypresenter.getMyData(this);
    }

    @Override
    public void onMySuccess(Bean bean) {
        Toast.makeText(getActivity(), "成功", Toast.LENGTH_SHORT).show();
        MyAdapter myAdapter = new MyAdapter(getActivity(),bean.getData());
        gridView.setAdapter(myAdapter);
    }

    @Override
    public void onMyFailure(Throwable throwable) {
        Toast.makeText(getActivity(), "失败", Toast.LENGTH_SHORT).show();
    }
}
