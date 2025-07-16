package com.interview.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyWord {
public static void main(String[] args) {
	String sentence="Java is programing language Java is Vesatile";
	Map<String,Long> frequencyWord=Arrays.stream(sentence.split("\\s+")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(frequencyWord);
	
}
}
