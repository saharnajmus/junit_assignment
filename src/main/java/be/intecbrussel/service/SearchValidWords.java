package be.intecbrussel.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchValidWords {

    public List<String> findAllCombinations(List<String> list) {
        if(list==null){
            return null;
        }
        List<String> validWords = new ArrayList();
        String word = "";
        String combination = "";
        for (int i = 0; i < list.size(); i++) {
            word = list.get(i);
            for (int j = 1; j < list.size(); j++) {
                combination = word + list.get(j);
                if (list.contains(combination)) {
                    // System.out.println(combination + " *****************is a valid word********** ");
                    validWords.add(combination);
                }/* else {
                    System.out.println(combination + " is not a valid word ");
                }*/
            }
        }
        return validWords;
    }
}