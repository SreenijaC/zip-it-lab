package org.example;

import java.util.*;

public class App {
    public static void main(String[] args) {

        // example 1: integers - equal size
        List<Integer> intList1 = List.of(1, 2, 3);
        List<Integer> intList2 = List.of(4, 5, 6);
        System.out.println("Example 1 - input intList1: " + intList1);
        System.out.println("Example 1 - input intList2: " + intList2);
        System.out.println("Example 1 - zipped ints: " + ZipAndMap.zip(intList1, intList2));
        System.out.println();

        // example 2: strings - first list longer
        List<String> strList1 = List.of("a", "e", "i", "o", "u");
        List<String> strList2 = List.of("w", "x", "y");
        System.out.println("Example 2 - input strList1: " + strList1);
        System.out.println("Example 2 - input strList2: " + strList2);
        System.out.println("Example 2 - zipped strings: " + ZipAndMap.zip(strList1, strList2));
        System.out.println();

        // example 3: doubles - second list longer
        List<Double> doubleList1 = List.of(1.5, 2.6);
        List<Double> doubleList2 = List.of(0.5, 7.8, 12.6, 13.4);
        System.out.println("Example 3 - input doubleList1: " + doubleList1);
        System.out.println("Example 3 - input doubleList2: " + doubleList2);
        System.out.println("Example 3 - zipped doubles: " + ZipAndMap.zip(doubleList1, doubleList2));
        System.out.println();

        // example 4: booleans - first list longer
        List<Boolean> boolList1 = List.of(true, false, true);
        List<Boolean> boolList2 = List.of(false, false);
        System.out.println("Example 4 - input boolList1: " + boolList1);
        System.out.println("Example 4 - input boolList2: " + boolList2);
        System.out.println("Example 4 - zipped booleans: " + ZipAndMap.zip(boolList1, boolList2));
        System.out.println();

        // example 5: characters - equal size
        List<Character> charList1 = List.of('A', 'B', 'C');
        List<Character> charList2 = List.of('X', 'Y', 'Z');
        System.out.println("Example 5 - input charList1: " + charList1);
        System.out.println("Example 5 - input charList2: " + charList2);
        System.out.println("Example 5 - zipped chars: " + ZipAndMap.zip(charList1, charList2));
        System.out.println();

        // example 6: custom objects - Points
        class Point {
            int x, y;

            Point(int x, int y) {
                this.x = x;
                this.y = y;
            }

            public String toString() {
                return "(" + x + "," + y + ")";
            }
        }
        List<Point> pointList1 = List.of(new Point(1, 2), new Point(3, 4));
        List<Point> pointList2 = List.of(new Point(5, 6));
        System.out.println("Example 6 - input pointList1: " + pointList1);
        System.out.println("Example 6 - input pointList2: " + pointList2);
        System.out.println("Example 6 - zipped points: " + ZipAndMap.zip(pointList1, pointList2));
        System.out.println();

        // example 7: hashmapify strings → integers
        List<String> keys1 = List.of("White", "Black", "Orange", "Pink");
        List<Integer> vals1 = List.of(1, 3, 5, 7);
        System.out.println("Example 7 - input keys1: " + keys1);
        System.out.println("Example 7 - input vals1: " + vals1);
        System.out.println("Example 7 - hashmapify result1: " + ZipAndMap.hashmapify(keys1, vals1));
        System.out.println();

        // example 8: hashmapify strings → strings
        List<String> keys2 = List.of("first", "second", "third");
        List<String> vals2 = List.of("one", "two", "three");
        System.out.println("Example 8 - input keys2: " + keys2);
        System.out.println("Example 8 - input vals2: " + vals2);
        System.out.println("Example 8 - hashmapify result2: " + ZipAndMap.hashmapify(keys2, vals2));
        System.out.println();

        // example 9: hashmapify size mismatch (exception case)
        List<String> badKeys = List.of("one", "two");
        List<String> badVals = List.of("uno");
        System.out.println("Example 9 - input badKeys: " + badKeys);
        System.out.println("Example 9 - input badVals: " + badVals);
        try {
            ZipAndMap.hashmapify(badKeys, badVals);
        } catch (IllegalArgumentException e) {
            System.out.println("Example 9 - error: " + e.getMessage());
        }
    }
}
