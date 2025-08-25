package com.interview.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupFirstLetter {
public static void main(String[] args) {
	String[] names= {"Alice","Bob","Charlie","Amy","Bill","Anna"};
	Map<Character, Long> namesMap = Arrays.stream(names)
			.collect(Collectors.groupingBy(
				name -> name.charAt(0),  // group by first letter
				Collectors.counting()
			));
    
	System.out.println(namesMap);
}
}
