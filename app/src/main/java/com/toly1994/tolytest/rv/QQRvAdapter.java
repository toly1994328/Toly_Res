package com.toly1994.tolytest.rv;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.toly1994.toly_test.bean.IconInfo;
import com.toly1994.toly_test.commom.ToastUtil;
import com.toly1994.tolytest.R;

import java.util.List;

/**
 * 作者：张风捷特烈<br/>
 * 时间：2018/12/2 0002:9:22<br/>
 * 邮箱：1981462002@qq.com<br/>
 * 说明：qq信息列表Adapter
 */
public class QQRvAdapter extends RecyclerView.Adapter<MyViewHolder>  {
    private static final String TAG = "TolyRvAdapter";
    private List<IconInfo> mData;

    private Context mContext;
    private RecyclerView mRecyclerView;

    public QQRvAdapter(List<IconInfo> data) {
        mData = data;
    }

    @NonNull
    @Override//将item布局文件与ViewHolder结合
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        mRecyclerView = (RecyclerView) parent;
        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.item_qq_msg, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        IconInfo name = mData.get(position);
        holder.itemView.setOnClickListener(v -> {
            ToastUtil.show(mContext, "第" + position + "个:" + name);
        });
        holder.mItemTV.setText(name.getInfo());
//        holder.mItemTVInfo.setText(ZRandom.randomChar(ZData.SEN_CONG_CONG));
        holder.mItemIV.setImageResource(name.getIcon());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }



}
