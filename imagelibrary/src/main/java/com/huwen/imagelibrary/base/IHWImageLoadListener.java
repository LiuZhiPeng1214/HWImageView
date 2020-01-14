package com.huwen.imagelibrary.base;

public interface IHWImageLoadListener {
    void onSuccess(String id, int width, int height);

    void onFailure(String id, Throwable throwable);
}
