package com.huwen.imagelibrary;

import android.content.Context;
import android.util.AttributeSet;

import com.huwen.imagelibrary.fresco.FrescoCircleImageView;

public class HWCircleImageView extends FrescoCircleImageView {
    public HWCircleImageView(Context context) {
        super(context);
        init();
    }

    public HWCircleImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public HWCircleImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public HWCircleImageView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }
    @Override
    public void setBorderColor(int color) {
        super.setBorderColor(color);
    }

    @Override
    public void setBorderWidth(int width) {
        super.setBorderWidth(width);
    }
}
