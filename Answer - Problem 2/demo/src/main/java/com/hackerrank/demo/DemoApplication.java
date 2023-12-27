package com.hackerrank.demo;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println("Duplicated Numbers: " + countDuplicate(numbers));

		numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 1,9);
		System.out.println("Duplicated Numbers: " + countDuplicate(numbers));

	}

	public static int countDuplicate(List<Integer> numbers) {
		List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
		Integer repeatedValues = 0;
		Integer lastValue = null;
		for (int i = 0; i < sortedNumbers.size() - 1; i++) {
			if(sortedNumbers.get(i) == lastValue) {
				continue;
			}
			if(sortedNumbers.get(i) == sortedNumbers.get(i+1)) {
				repeatedValues++;
				lastValue = sortedNumbers.get(i);
			}
		}
		return repeatedValues;
	}

	// https://www.youtube.com/watch?v=9_R6xZpLqGc

}
