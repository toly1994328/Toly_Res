package com.toly1994.tolytest.rv;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.toly1994.tolytest.R;


/**
 * 作者：张风捷特烈<br/>
 * 时间：2018/12/5 0005:10:57<br/>
 * 邮箱：1981462002@qq.com<br/>
 * 说明：
 */
public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView mItemTV;
    public TextView mItemTVInfo;
    public ImageView mItemIV;

    public MyViewHolder(View itemView) {
        super(itemView);
        mItemTV = itemView.findViewById(R.id.id_tv_qq_name);
        mItemIV = itemView.findViewById(R.id.id_iv_qq_head);
        mItemTVInfo = itemView.findViewById(R.id.id_tv_info);
    }
}