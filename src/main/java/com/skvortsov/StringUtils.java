package com.skvortsov;

import java.util.ArrayList;

public class StringUtils {
    public String getShortestWord(ArrayList<String> words) {
        String shortestWord = words.get(0);
        for (int i = 0; i < words.size(); i++) {
            if (shortestWord.length() > words.get(i).length()) {
                shortestWord = words.get(i);
            }
        }
        return shortestWord;
    }
}