package com.toly1994.tolytest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.toly1994.toly_test.bean.BeanFactory;
import com.toly1994.tolytest.rv.ChatRvAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ChatActivity extends AppCompatActivity {

    @BindView(R.id.id_rv_content)
    RecyclerView mIdRvContent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a12_swipe_refresh);
        ButterKnife.bind(this);

        mIdRvContent.setAdapter(new ChatRvAdapter(BeanFactory.getMsgBeans(60)));
        mIdRvContent.setLayoutManager(new LinearLayoutManager(this));

    }

}
