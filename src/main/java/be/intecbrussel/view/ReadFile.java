package be.intecbrussel.view;

import be.intecbrussel.service.SearchValidWords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        SearchValidWords flc = new SearchValidWords();
        List<String> list = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:/Users/uzair/Documents/junit_assignment/assignmentText.txt"))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line.trim());

            }
            List<String> validWordsList = flc.findAllCombination(list);
            validWordsList.forEach(System.out::println);
        } catch (IOException e) {
            e.getMessage();
            e.printStackTrace();
        }
    }
}
