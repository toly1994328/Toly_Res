package com.toly1994.tolytest;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.toly1994.toly_test.bean.IconInfo;
import com.toly1994.tolytest.rv.QQRvAdapter;
import com.toly1994.tolytest.rv.RVItemDivider;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class QQMsgActivity extends AppCompatActivity {
    private static final String TAG = "QQMsgActivity";
    @BindView(R.id.id_rv_content)
    RecyclerView mIdRvContent;

    private QQRvAdapter mACAdapter;
    private List<IconInfo> mData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a12_swipe_refresh);
        ButterKnife.bind(this);


//        mData = BeanFactory.getHeadInfo(50);

        mIdRvContent.addItemDecoration(new RVItemDivider(this, RVItemDivider.Type.HORIZONTAL, 2, Color.BLACK));
        mData = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            mData.add(new IconInfo(R.mipmap.ic_launcher, "test"));
        }

        mACAdapter = new QQRvAdapter(mData);

        mIdRvContent.setAdapter(mACAdapter);
        mIdRvContent.setLayoutManager(new LinearLayoutManager(this));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_tool_bar_op, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.tab_add:
                break;
            case R.id.tab_remove:
                break;
            case R.id.tab_refresh:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}
