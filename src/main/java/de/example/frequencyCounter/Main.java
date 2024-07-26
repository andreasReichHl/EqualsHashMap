package de.example.frequencyCounter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class Main {

    static HashMap<Character, Integer> charMap = new HashMap<>();

    public static void main(String[] args) {


        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";

//        countChars(text).forEach((key, value) -> System.out.println(key + ": '" + value + "'"));

        countWords(text);
    }

    public static HashMap<Character, Integer> countChars(String text) {
        if (!Objects.equals(text, "") && text != null) {
            while (!text.isEmpty()) {
                char c = text.charAt(0);
                if (Character.isLetter(c))
                    charMap.put(c, charMap.getOrDefault(c, 0) + 1);
                text = text.substring(1);
            }
        }
        return charMap;
    }

    public static String[] textToArray(String text) {
        text = text.replace(",", "");
        text = text.replace(".", "");
        return text.split(" ");
    }

    public static void countWords(String text) {
        String[] arrayList = textToArray(text);
        HashMap<String, Integer> map = new HashMap<>();
        int index = 0;
        while (index < arrayList.length) {
            String string = arrayList[index];
            if (map.containsKey(string)) {
                map.replace(string, map.get(string) + 1);
            } else {
                map.put(string, 1);
            }
            index++;
        }
        map.forEach((key, value) -> System.out.println(key + ": '" + value + "'"));
    }
}
