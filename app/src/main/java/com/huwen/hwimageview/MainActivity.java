package com.huwen.hwimageview;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.huwen.imagelibrary.HWGifImageView;
import com.huwen.imagelibrary.HWImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private HWImageView mIvImg;
    private HWGifImageView mIvImggif;
    private HWGifImageView mIvImgwebp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mIvImg = (HWImageView) findViewById(R.id.iv_img);
        mIvImg.setWrapContentEnable(true);
        mIvImggif = (HWGifImageView) findViewById(R.id.iv_imggif);
        mIvImggif.setOnClickListener(this);
        mIvImggif.setWrapContentEnable(true);
        mIvImgwebp = (HWGifImageView) findViewById(R.id.iv_imgwebp);
        mIvImgwebp.setOnClickListener(this);
        mIvImgwebp.setWrapContentEnable(true);

        mIvImg.setImageUrl("http://oss.whowen.com/img/1578985644961.png");
        mIvImggif.setImageUrl("http://oss.whowen.com/img/1578985546937.gif");
        mIvImgwebp.setImageUrl("http://oss.whowen.com/img/1578985575058.webp");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.iv_imggif:
                break;
            case R.id.iv_imgwebp:
                break;
            case R.id.iv_img:
                break;
        }
    }
}
