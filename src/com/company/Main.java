package com.company;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    static <E> List<E> noDuplicate(E[] array) {
        List<E> list = new ArrayList<>();
        Map<E, E> map = new HashMap<>();
        for (E arr : array) {
            map.put(arr, arr);
        }

        Set<Map.Entry<E, E>> set = map.entrySet();
        for (Map.Entry<E, E> st : set) {
            list.add(st.getKey());
        }
        return list;
    }

    static List<String> noDuplicate(String value) {
        String text = value;
        text = text.replace(" ", "");
        String[] arrayString = text.split(",");

        return Main.<String>noDuplicate(arrayString);
    }

    public static void main(String[] args) {
        Integer[] arrayInt = {0, 1, 9, 2, 8, 3, 7, 4, 6, 5, 5, 6, 4, 7, 3, 8, 2, 9, 1, 0};
        List<Integer> listInt = Main.<Integer>noDuplicate(arrayInt);

        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(listInt.toArray()));
        System.out.println("The number of repetitions = " + (arrayInt.length - listInt.size()));

        System.out.println();

        System.out.println("Enter a set of numbers:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        List<String> listString = Main.<String>noDuplicate(text);

        System.out.println(text);
        System.out.println(Arrays.toString(listString.toArray()));
    }

}
