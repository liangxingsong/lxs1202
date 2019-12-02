package com.bawei.lxs12020;

/**
 * 作者：梁兴松
 * 时间：2019/12/2  16:02
 * 类名：com.bawei.lxs12020
 */

public class MyModel {
    public void getMyData(Mycontract.IModelCallBack iModelCallBack){
        NetUtil.getInstance().doget();
    }
}
