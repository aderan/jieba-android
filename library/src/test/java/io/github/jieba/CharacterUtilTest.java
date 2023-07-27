package io.github.jieba;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CharacterUtilTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testRegularSpace() {
        char input = 12288;
        char expected = 32;

        char actual = CharacterUtil.regularize(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testRegularPunctuation() {
        char input = 65292;
        char expected = ',';

        char actual = CharacterUtil.regularize(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testLowercaseLetter() {
        char input = 'A';
        char expected = 'a';

        char actual = CharacterUtil.regularize(input);

        assertEquals(expected, actual);
    }

    @Test
    public void testNoChange() {
        char input = 'a';
        char expected = 'a';

        char actual = CharacterUtil.regularize(input);

        assertEquals(expected, actual);
    }
}