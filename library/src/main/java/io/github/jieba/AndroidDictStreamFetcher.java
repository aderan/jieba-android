package io.github.jieba;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

public class AndroidDictStreamFetcher implements DictStreamFetcher {

    private static final String MAIN_DICT = "jieba/dict.txt";

    private static final String PROCESSED_DICT = "jieba/dict_processed.txt";

    private static final String PROB_EMIT = "jieba/prob_emit.txt";

    private final AssetManager assetManager;

    AndroidDictStreamFetcher(Context context) {
        assetManager = context.getAssets();
    }

    @Override
    public InputStream getDictStream() throws IOException {
        return assetManager.open(MAIN_DICT);
    }

    @Override
    public InputStream getProcessedDictStream() throws IOException {
        return assetManager.open(PROCESSED_DICT);
    }

    @Override
    public InputStream getProbStream() throws IOException {
        return assetManager.open(PROB_EMIT);
    }
}
