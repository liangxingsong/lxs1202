package com.bawei.lxs1202.model;

import com.bawei.lxs1202.contract.Mycontract;
import com.bawei.lxs1202.model.bean.Bean;
import com.bawei.lxs1202.util.NetUtil;
import com.google.gson.Gson;

/**
 * 作者：梁兴松
 * 时间：2019/12/2  15:02
 * 类名：com.bawei.lxs1202.model
 */

public class Mymodel {
    public void getMyData(final Mycontract.ModelCallBack modelCallBack){
        NetUtil.getInstance().doget("http://blog.zhaoliang5156.cn/api/shop/shop1.json", new NetUtil.MyCallBack() {
            @Override
            public void doget(String json) {
                Bean bean = new Gson().fromJson(json, Bean.class);
                modelCallBack.onMySuccess(bean);
            }

            @Override
            public void Error(Throwable throwable) {
                modelCallBack.onMyFailure(throwable);
            }
        });
    }
}
