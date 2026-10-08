 package com.practice.test;

public class RemoveDuplicate {
public static void main(String[] args) {
    //remove duplicate
    String s = "dbcadefg";
    s.chars().distinct().mapToObj(x -> (char)x).forEach(System.out::print);

}
    
}