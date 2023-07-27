package io.github.jieba;

import java.io.IOException;
import java.io.InputStream;

public interface DictStreamFetcher {

    InputStream getDictStream() throws IOException;

    InputStream getProcessedDictStream() throws IOException;

    InputStream getProbStream() throws IOException;
}
