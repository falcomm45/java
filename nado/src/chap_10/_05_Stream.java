package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {

	public static void main(String[] args) {

		// 스트림 생성

		// Arrays.stream 을 이용하여 생성
		int[] scores = { 100, 95, 90, 85, 80 };

		IntStream scoreStream = Arrays.stream(scores);

		String[] langs = { "python", "java", "java script", "c", "c++", "c#" };

		Stream<String> langStream = Arrays.stream(langs);

		// Collection.stream() 을 이용하여 생성
		List<String> langList = new ArrayList<>();
//		langList.add("python");
//		langList.add("java");

		// 리스트에 값을 한번에 정의
		langList = Arrays.asList("python", "java", "java script", "c", "c++", "c#");
		System.out.println(langList.size());
		// 리스트를 스트림으로
		Stream<String> langListStream = langList.stream();
		// Stream.of() 를 이용하여 생성
		// 스트림을 생성하면서 값을 정의
		Stream<String> langListOfStream = Stream.of("python", "java", "java script", "c", "c++", "c#");

		System.out.println("---------------------------------------------------------------");

		// 스트림 사용
		// 중간 연산 (Intermediate Operation) : filter, map, sorted, distinct, skip, ...
		// 최종 연산 (Terminal Operation) : count, min, max, sum, forEach, anyMatch,
		// allMatch, ...

		// 90점 이상인 점수만 출력
		Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
		// Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);

		System.out.println("------------");
		
		// 90점 이상인 사람의 수
		//double count = Arrays.stream(scores).filter(x -> x >= 90).count();
		int count = (int)Arrays.stream(scores).filter(x -> x >= 90).count();
		System.out.println(count);
		System.out.println("------------");
		
		// 90점 이상인 점수들의 합
		int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
		System.out.println(sum);
		System.out.println("------------");
		
		// 90점 이상인 점수들을 정렬
		Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);
		System.out.println("------------");

		// "python", "java", "java script", "c", "c++", "c#"
		// c 로 시작하는 문자열
		Arrays.stream(langs).filter(x -> x.startsWith("c")).forEach(System.out :: println);
		System.out.println("------------");
		
		// java 포함하는 언어
		Arrays.stream(langs).filter(x -> x.contains("java")).forEach(System.out::println);
		System.out.println("------------");
		
		// 4글자 이하의 문자열을 정렬해서 출력
		Arrays.stream(langs).filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
		System.out.println("------------");
		langList.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
		System.out.println("------------");
		
		// 4글자 이하의 문자열 중에서 c라는 글자를 포함하는 문자열
		langList.stream()
				.filter(x -> x.length() <= 4)
				.filter(x -> x.contains("c"))
				.forEach(System.out::println);
		System.out.println("------------");
		
		// 4글자 이하의 문자열 중 c 라는 글자를 포함하는 문자열이 하나라도 있는지 여부
		boolean anyMatch = langList.stream()
				.filter(x -> x.length() <= 4)
				.anyMatch(x -> x.contains("c"));
		System.out.println(anyMatch);
		System.out.println("------------");
		
		// 4글자 이하의 문자열이 모두 c 라는 글자를 포함하는지 여부
		boolean allMatch = langList.stream()
				.filter(x -> x.length() <= 4)
				.allMatch(x -> x.contains("c"));
		System.out.println(allMatch);
		System.out.println("------------");
		
		// 4글자 이하의 언어 중 c 라는 글자를 포함하는 언어 뒤에 (어려워요) 라는 글자를 함께 출력
		// map 
		langList.stream()
				.filter(x -> x.length() <= 4)
				.filter(x -> x.contains("c"))
				.map(x -> x + " 어려워요")
				.forEach(System.out::println);
		System.out.println("------------");
		
		// c 라는 글자를 포함하는 언어를 대문자로 출력
		langList.stream()
				.filter(x -> x.contains("c"))
				//.map(x -> x.toUpperCase())
				.map(String::toUpperCase)
				.forEach(System.out::println);
		System.out.println("------------");
		
		// c 라는 글자를  포함하는 언어를 대문자로 변경하여 리스트로 저장
		List<String> langListStartsWithC = langList.stream()
											.filter(x -> x.contains("c"))
											.map(String::toUpperCase)
											.collect(Collectors.toList());
		
		langListStartsWithC.stream().forEach(System.out::println);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
