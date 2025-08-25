package com.interview.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCharacter {
public static void main(String[] args) {
String input="acbcd";
Map<String,Long> frequencyChar=Arrays.stream(input.split("")).collect(Collectors.groupingBy(
Function.identity(),
Collectors.counting()));
System.out.println(frequencyChar);
}
}
