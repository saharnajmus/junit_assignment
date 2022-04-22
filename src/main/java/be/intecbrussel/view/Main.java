package be.intecbrussel.view;

import be.intecbrussel.service.SearchValidWords;


import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SearchValidWords svw = new SearchValidWords();
        svw.findAllCombinations(null);

    }
}
