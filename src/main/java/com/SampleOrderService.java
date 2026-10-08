package com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LargestString {
    public static void main(String[] args) {
        //find the biggest word
        String st = "Hello world. India is a great Country";
        List<String> stArray = Arrays.asList(st.split(" "));
        String result = stArray.stream().max(Comparator.comparing(String :: length)).get();
        System.out.println(result);
    }
}
