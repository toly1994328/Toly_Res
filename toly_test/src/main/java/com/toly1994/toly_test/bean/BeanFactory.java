package com.toly1994.toly_test.bean;


import com.toly1994.toly_test.Cons.ResData;
import com.toly1994.toly_test.R;
import com.toly1994.toly_test.random.ZRandom;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：张风捷特烈<br/>
 * 时间：2018/12/4 0004:8:48<br/>
 * 邮箱：1981462002@qq.com<br/>
 * 说明：
 */
public class BeanFactory {

    public static List<GoodsBean> getGoodsBean() {
        List<GoodsBean> beans = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            beans.add(new GoodsBean(R.mipmap.pic_30, "混沌战士,等比例人形,附加刀及盔甲,2030年爆款,限额三百件,先到先得,售完为止", 6666, 277, "店铺优惠,满100送10"));
            beans.add(new GoodsBean(R.mipmap.pic_1, "蓝夜皮肤,2030年爆款,限额三件,先到先得,售完为止", 99999, 2));

            beans.add(new GoodsBean(R.mipmap.pic_17, "古典美女,等比例人形,2030年爆款,限额三百件,先到先得,售完为止", 999, 177, "店铺优惠,满100送1000"));
            beans.add(new GoodsBean(R.mipmap.pic_35, "珍藏,非卖品", 9999999, 1));
            beans.add(new GoodsBean(R.mipmap.pic_7, "黑夜皮肤,附加魔法加成,2030年爆款,限额三百件,先到先得,售完为止", 8888, 277, "店铺优惠,满100送100000"));


            beans.add(new GoodsBean(R.mipmap.pic_13, "买洞爷湖送银时,只要998,绝对良心价,2030年爆款,限额三百件,先到先得,售完为止", 998, 277, "店铺优惠,满100送100000"));

        }

        return beans;
    }

    /**
     * 获取头像信息
     * @param len
     * @return
     */
    public static List<IconInfo> getHeadInfo(int len) {
        List<IconInfo> beans = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            beans.add(new IconInfo(ResData.REA_HEAD_ICON[ZRandom.rangeInt(0, 90-1)], ZRandom.randomCnName()));
        }
        return beans;
    }

    /**
     * 获取随机聊天消息
     *
     * @return
     */
    public static List<MsgBean> getMsgBeans(int count) {
        List<MsgBean> beans = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (i % 10 == 0) {
                beans.add(new MsgBean(2, ""));
                continue;
            }
            beans.add(new MsgBean(ZRandom.rangeInt(0, 1),
                    "Hello"));
        }
        return beans;
    }


}
