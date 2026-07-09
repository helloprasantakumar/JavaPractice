package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(20);
        System.out.println("Old Array List"+arrayList);
        List<Integer> newArrayList=arrayList.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println("newArrayList"+newArrayList);
    }
}
