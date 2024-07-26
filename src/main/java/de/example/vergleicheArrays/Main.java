package de.example.vergleicheArrays;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {9, 4, 6, 4, 7, 4, 9, 8, 8, 3, 7, 7, 6, 3, 5, 7, 6, 8, 8, 3};
        int[] array2 = {9, 4, 6, 4, 7, 4, 9, 8, 8, 3, 7, 7, 6, 3, 5, 7, 6, 8, 8, 3};
        int[] array3 = {6, 6, 2, 1, 3, 3, 7, 1, 6, 7, 5, 4, 1, 7, 4, 3, 2, 3, 8, 8};

        System.out.println(compareInnerValue(array1, array2)); // true
        System.out.println(compareInnerValue(array1, array3)); // false
    }


    public static boolean compareInnerValue(int[] array1, int[] array2) {
        HashMap<Integer, Integer> map1 = numbersInHashMap(array1);
        HashMap<Integer, Integer> map2 = numbersInHashMap(array2);
        for (Integer key : map1.keySet()) {
//            System.out.println(map1.get(key).equals(map2.get(key)));
            if (!(map1.get(key).equals(map2.get(key))))
                return false;
        }
        return true;
    }

    public static HashMap<Integer, Integer> numbersInHashMap(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int number : array) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }
        return map;
    }
}


