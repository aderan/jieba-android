package io.github.jieba;

import java.io.IOException;
import java.io.InputStream;

/**
 * 用于解除对 Android 系统的依赖，方便在其他平台使用，方便测试。
 * <p>
 * 此接口只提供流，不提供流的关闭操作，具体需要调用方自行关闭。
 */
public interface DictStreamFetcher {

    InputStream getDictStream() throws IOException;

    InputStream getProcessedDictStream() throws IOException;

    InputStream getProbStream() throws IOException;
}
