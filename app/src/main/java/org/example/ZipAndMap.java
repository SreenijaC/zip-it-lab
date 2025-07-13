package org.example;

import java.util.*;

public class ZipAndMap {

    // combines two lists in alternating order
    public static <T> List<T> zip(List<T> list1, List<T> list2) { // takes 2 lists and returns
                                                                  // new one by alternating
                                                                  // their elements
        List<T> result = new ArrayList<>();

        int minSize = Math.min(list1.size(), list2.size());

        // alternate between both lists
        for (int i = 0; i < minSize; i++) {
            result.add(list1.get(i)); // take from first list
            result.add(list2.get(i)); // take from second list
        }

        // add the remaining items from whichever list is longer
        if (list1.size() > minSize) {
            result.addAll(list1.subList(minSize, list1.size()));
        } else if (list2.size() > minSize) {
            result.addAll(list2.subList(minSize, list2.size()));
        }

        return result;
    }

// takes two lists and builds map using one as keys and other as values
    public static <T> HashMap<String, T> hashmapify(List<String> keys, List<T> values) {
        if (keys.size() != values.size()) {
            throw new IllegalArgumentException("lists must be the same size");
        }

        HashMap<String, T> result = new HashMap<>();

        // add each key-value pair to map
        for (int i = 0; i < keys.size(); i++) {
            result.put(keys.get(i), values.get(i));
        }

        return result;
    }
}
