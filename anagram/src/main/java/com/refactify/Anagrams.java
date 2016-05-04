package com.refactify;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.sort;
import static java.util.Collections.emptyMap;

public class Anagrams {
    public static Map<String, Integer> compute(List<String> words) {
        Map<String, Integer> anagrams = new HashMap<>();
        for(String word : words) {
            char[] characters = word.toCharArray();
            sort(characters);
            String signature = new String(characters);
            if(anagrams.containsKey(signature)) {
                anagrams.put(signature, anagrams.get(signature) + 1);
            }
            else {
                anagrams.put(signature, 1);
            }
        }
        System.out.println(anagrams);
        return anagrams;
    }

    public static void filterAnagrams(Map<String, Integer> anagrams) {
        Iterator<String> iterator = anagrams.keySet().iterator();
        while(iterator.hasNext()) {
            String key = iterator.next();
            if(anagrams.get(key) == 1) {
                iterator.remove();
            }
        }
    }
}
