package io.github.jieba;

/**
 * Created by JackMeGo on 2017/7/5.
 */

public interface RequestCallback<E> {

    void onSuccess(E result);

    void onError(String errorMsg);
}
