package be.intecbrussel;

import be.intecbrussel.service.SearchValidWords;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    void helloIsValid() {
        List<String> output = searchValidWords.findAllCombination(List.of("hello", "he", "hel", "lo"));
        Assertions.assertLinesMatch(List.of("hello"), output);
    }

    @Test
    void WorldIsValid() {
        List<String> output = searchValidWords.findAllCombination(List.of("world", "wor", "ld", "ldd"));
        Assertions.assertLinesMatch(List.of("world"), output);
    }

}
