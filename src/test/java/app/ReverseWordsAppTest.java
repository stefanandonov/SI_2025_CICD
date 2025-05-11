package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsAppTest {

    @Test
    public void testReverseWords() {
        assertEquals("olleH dlroW", ReverseWordsApp.reverseWords("Hello World"));
        assertEquals("avaJ", ReverseWordsApp.reverseWords("Java"));
        assertEquals("", ReverseWordsApp.reverseWords(""));
    }
}