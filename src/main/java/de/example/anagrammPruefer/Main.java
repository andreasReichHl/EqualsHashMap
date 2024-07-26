package de.example.anagrammPruefer;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String text1 = "qpxzabwelcoyftsigsshjk";
        String text2 = "gi syftoc lewbazx pq";
        String text3 = "kj hg isyftoclewbaz xpq";
        String text4 = "qpxzabwelcoyftsigsshjk";

        System.out.println(compareStrings(text1, text2));
    }


    public static HashMap<Character, Integer> charInHashMap(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        while (!text.isEmpty()) {
            char c = text.charAt(0);
            if (Character.isLetter(c))
                map.put(c, map.getOrDefault(c, 0) + 1);
            text = text.substring(1);
        }
        return map;
    }

    public static boolean compareStrings(String text, String text1) {
        HashMap<Character, Integer> map1 = charInHashMap(text);
        HashMap<Character, Integer> map2 = charInHashMap(text1);
        for (Character key : map1.keySet()) {
            if (!(map1.get(key).equals(map2.get(key))))
                return false;
        }
        return true;
    }
}
