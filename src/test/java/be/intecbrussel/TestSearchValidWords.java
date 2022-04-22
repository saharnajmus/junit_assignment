package be.intecbrussel;

import be.intecbrussel.service.SearchValidWords;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class TestSearchValidWords {
    SearchValidWords searchValidWords;

    @BeforeEach
    void init() {
        this.searchValidWords = new SearchValidWords();
    }

    @AfterEach
    void cleanUp() {
        this.searchValidWords = null;

    }

    @Test
    void isHelloValid() {
        List<String> output = searchValidWords.findAllCombinations(List.of("hello", "he", "hel", "lo"));
        Assertions.assertLinesMatch(List.of("hello"), output);
    }

    @Test
    void isWorldValid() {
        List<String> output = searchValidWords.findAllCombinations(List.of("world", "wor", "ld", "ldd"));
        Assertions.assertLinesMatch(List.of("world"), output);
    }

    @Test
    void testEmptyList(){
        List<String> output = searchValidWords.findAllCombinations(Collections.emptyList());
        Assertions.assertTrue(output.isEmpty());
    }
    @Test
    void testNullList(){
        List<String> output = searchValidWords.findAllCombinations(null);
        Assertions.assertNull(output);
    }
}
