package com.huwen.hwimageview;

import android.app.Application;

import com.huwen.imagelibrary.HWGifImageView;
import com.huwen.imagelibrary.HWImageView;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        HWImageView.init(this);
        HWGifImageView.init(this);
    }
}
