package io.github.jieba;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

public class TestDictStreamFetcher implements DictStreamFetcher {

    @Override
    public InputStream getDictStream() throws IOException {
        return Files.newInputStream(new File("src/main/assets/jieba/dict_out.txt").toPath());
    }

    @Override
    public InputStream getProcessedDictStream() throws IOException {
        return Files.newInputStream(new File("src/main/assets/jieba/dict_processed.txt").toPath());
    }

    @Override
    public InputStream getEmitProbStream() throws IOException {
        return Files.newInputStream(new File("src/main/assets/jieba/prob_emit.txt").toPath());
    }
}
