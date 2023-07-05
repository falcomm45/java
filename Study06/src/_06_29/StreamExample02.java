package _06_29;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample02 {
	public static void main(String[] args) {
		
		String s = WORDS.stream()
				.filter(x -> x.length() > 1)
				.map(x -> x.toUpperCase())
				.map(x -> x.substring(0,1))
				.collect(Collectors.joining(" "));
		
		System.out.println(s);
		System.out.println("----------------");
		
		List<Integer[]> list = numbers1.stream()
		.flatMap(n -> numbers2.stream().map(m -> new Integer[] {n,m}))
		.collect(Collectors.toList());
		
		
	}
	
	private final static List<String> WORDS = 
			Arrays.asList("TONY", "a", "hULK", "B", "america", "X", "nebula", "Korea");
	
	private static final List<Integer> numbers1 = Arrays.asList(1, 2, 3);
	private static final List<Integer> numbers2 = Arrays.asList(3, 4);
}
