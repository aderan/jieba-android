package io.github.jieba;

import io.github.jieba.JiebaSegmenter.SegMode;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JiebaSegmenterTest {

    public static final TestDictStreamFetcher DICT_STREAM_FETCHER = new TestDictStreamFetcher();

    @Before
    public void setUp() throws Exception {
        JiebaSegmenter.getInstance().init(DICT_STREAM_FETCHER);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void getDividedString() {
        JiebaSegmenter segmenter = JiebaSegmenter.getInstance();
        segmenter.waitForReady();
        for (int i = 0; i < TestData.sentences.length; i++) {
            String sentence = TestData.sentences[i];
            String[] expected = TestData.sentencesCutForSearch[i];
            String[] actual = segmenter.getDividedString(sentence).toArray(new String[0]);

            Assert.assertArrayEquals(expected, actual);
        }
    }

    @Test
    public void process_CutIndex() {
        JiebaSegmenter segmenter = JiebaSegmenter.getInstance();

        for (int i = 0; i < TestData.sentences.length; i++) {
            String sentence = TestData.sentences[i];
            String[] expected = TestData.sentencesCutForIndex[i];
            String[] actual = segmenter.process(sentence, SegMode.INDEX).stream()
                .map(token -> token.word)
                .toArray(String[]::new);

            Assert.assertArrayEquals(expected, actual);
        }
    }

    @Test
    public void process_CutSearch() {
        JiebaSegmenter segmenter = JiebaSegmenter.getInstance();

        for (int i = 0; i < TestData.sentences.length; i++) {
            String sentence = TestData.sentences[i];
            String[] expected = TestData.sentencesCutForSearch[i];
            String[] actual = segmenter.process(sentence, SegMode.SEARCH).stream()
                .map(token -> token.word)
                .toArray(String[]::new);

            Assert.assertArrayEquals(expected, actual);
        }
    }

    @Test
    public void sentenceProcess() {
        JiebaSegmenter segmenter = JiebaSegmenter.getInstance();
        segmenter.waitForReady();

        for (int i = 0; i < TestData.sentences.length; i++) {
            String sentence = TestData.sentences[i];
            String[] expected = TestData.sentencesProcessExpected[i];
            String[] actual = segmenter.sentenceProcess(sentence).toArray(new String[0]);

            Assert.assertArrayEquals(expected, actual);
        }
    }
}