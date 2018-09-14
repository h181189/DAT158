package no.hvl.dat158;

import org.junit.Test;

public class TextProcessorTest {

    private final TextProcessor tp = new TextProcessor();

    @Test
    public void sidesShouldBeZero() {
        var result = tp.lcsRecursive("bbabbaaab", "babbabab");

        System.out.println(result);
    }

}
