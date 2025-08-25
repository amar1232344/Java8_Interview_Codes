package com.interview.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
//Find and Print duplicate numbers in an array if contain multiple duplicate

public class ArrayDuplicate {
	public static void main(String[] args) {
   int[] arr= {2,4,2,3,1,78,3,1,78};
   Arrays.stream(arr).boxed().collect(Collectors.groupingBy(e->e, Collectors.counting())).entrySet().stream()
   .filter(entry->entry.getValue()>1)
   .map(Map.Entry::getKey).forEach(System.out::println);
	}
}
