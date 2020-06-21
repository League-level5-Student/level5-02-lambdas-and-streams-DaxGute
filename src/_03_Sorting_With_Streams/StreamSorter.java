package _03_Sorting_With_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSorter {
	public static void main(String[] args) {
		Integer[] num = new Integer[50];
		for(int i = 0; i < num.length; i++) {
			Random rGen = new Random();
			num[i] = rGen.nextInt();
		}
		List <Integer> nums = Arrays.asList(num);
		//1. Convert the Integer array to Stream object.
		nums.stream().sorted().forEach((e)->System.out.println(e));
		//2. Use the sorted method of the stream to sort the numbers.
		
		//3. Use the forEach method with a lambda to print all the elements of the sorted Stream.
		//   They should be in ascending order.
	}
}
