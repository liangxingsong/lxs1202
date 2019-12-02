package com.bawei.lxs1202.presenter;

import com.bawei.lxs1202.contract.Mycontract;
import com.bawei.lxs1202.model.Mymodel;
import com.bawei.lxs1202.model.bean.Bean;

/**
 * 作者：梁兴松
 * 时间：2019/12/2  15:09
 * 类名：com.bawei.lxs1202.presenter
 */

public class Mypresenter  {

    private Mymodel mymodel;

    public void getMyData(final Mycontract.IView iView){
        mymodel = new Mymodel();
        mymodel.getMyData(new Mycontract.ModelCallBack() {
            @Override
            public void onMySuccess(Bean bean) {
                iView.onMySuccess(bean);
            }

            @Override
            public void onMyFailure(Throwable throwable) {
                iView.onMyFailure(throwable);
            }
        });
    }
}
