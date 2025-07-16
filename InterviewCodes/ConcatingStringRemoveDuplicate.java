package com.interview.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatingStringRemoveDuplicate {
public static void main(String[] args) {
	List<String>list1=List.of("apple","bannana","orange");
	List<String>list2=List.of("bannana","Kiwi","grapes");
	List<String>uniqueList=Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
	System.out.println(uniqueList);
}
}
