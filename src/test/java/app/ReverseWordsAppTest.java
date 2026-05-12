package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsAppTest {

    @Test
    public void testReverseOnlyLettersInWords() {
        assertEquals("olleH dlroW", ReverseWordsApp.reverseOnlyLettersInWords("Hello World"));
        assertEquals("avaJ", ReverseWordsApp.reverseOnlyLettersInWords("Java"));
        assertEquals("", ReverseWordsApp.reverseOnlyLettersInWords(""));
    }
}