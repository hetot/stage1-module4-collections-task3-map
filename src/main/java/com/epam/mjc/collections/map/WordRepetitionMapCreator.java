package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        sentence = sentence.toLowerCase();
        sentence = sentence.replace(".", "");
        sentence = sentence.replace(",", "");
        Map<String, Integer> result = new HashMap<>();
        if (sentence.length() == 0) {
            return result;
        }
        for (String key : sentence.split(" ")) {
            result.put(key, result.containsKey(key) ? result.get(key) + 1 : 1);
        }
        return result;
    }
}
