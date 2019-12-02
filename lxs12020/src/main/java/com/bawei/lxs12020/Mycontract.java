package com.bawei.lxs12020;

/**
 * 作者：梁兴松
 * 时间：2019/12/2  15:59
 * 类名：com.bawei.lxs12020
 */

public interface Mycontract {
    interface IView{
        void onSuccess(Bean bean);
        void onFailed(Throwable throwable);
    }
    interface IModelCallBack{
        void onSuccess(Bean bean);
        void onFailed(Throwable throwable);
    }
}
