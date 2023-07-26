package io.github.jieba.demo;

import android.app.Application;
import io.github.jieba.JiebaSegmenter;

/**
 * Created by JackMeGo on 2017/7/4.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // 异步初始化
        JiebaSegmenter.init(getApplicationContext());
    }
}
