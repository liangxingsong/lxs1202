package com.bawei.lxs1202.contract;

import com.bawei.lxs1202.model.bean.Bean;

/**
 * 作者：梁兴松
 * 时间：2019/12/2  15:01
 * 类名：com.bawei.lxs1202.contract
 */

public interface Mycontract {
    interface IView{
        void onMySuccess(Bean bean);
        void onMyFailure(Throwable throwable);
    }
    interface ModelCallBack{
        void onMySuccess(Bean bean);
        void onMyFailure(Throwable throwable);
    }
}
