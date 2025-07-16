package com.interview.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterPalindrom {
	public static void main(String[] args) {
		List<String> str = List.of("hello", "radar", "telephone", "world", "deed");
		List<String> palindromWords = str.stream().filter(s -> s.equals(new StringBuilder(s).reverse().toString()))
				.collect(Collectors.toList());
		System.out.println(palindromWords);
	}
}
