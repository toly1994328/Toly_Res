package com.toly1994.tolytest;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.id_iv)
    ImageView mIdIv;
    @BindView(R.id.id_back)
    ImageView mIdBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.id_iv)
    public void onViewClicked() {
        Drawable drawable = mIdIv.getDrawable();

        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }

    }

    @OnClick(R.id.id_back)
    public void onViewClicked2() {

        Drawable drawable = mIdBack.getDrawable();

        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }
}
