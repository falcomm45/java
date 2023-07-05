package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {

	public static void main(String[] args) {

		// ��Ʈ�� ����

		// Arrays.stream �� �̿��Ͽ� ����
		int[] scores = { 100, 95, 90, 85, 80 };

		IntStream scoreStream = Arrays.stream(scores);

		String[] langs = { "python", "java", "java script", "c", "c++", "c#" };

		Stream<String> langStream = Arrays.stream(langs);

		// Collection.stream() �� �̿��Ͽ� ����
		List<String> langList = new ArrayList<>();
//		langList.add("python");
//		langList.add("java");

		// ����Ʈ�� ���� �ѹ��� ����
		langList = Arrays.asList("python", "java", "java script", "c", "c++", "c#");
		System.out.println(langList.size());
		// ����Ʈ�� ��Ʈ������
		Stream<String> langListStream = langList.stream();
		// Stream.of() �� �̿��Ͽ� ����
		// ��Ʈ���� �����ϸ鼭 ���� ����
		Stream<String> langListOfStream = Stream.of("python", "java", "java script", "c", "c++", "c#");

		System.out.println("---------------------------------------------------------------");

		// ��Ʈ�� ���
		// �߰� ���� (Intermediate Operation) : filter, map, sorted, distinct, skip, ...
		// ���� ���� (Terminal Operation) : count, min, max, sum, forEach, anyMatch,
		// allMatch, ...

		// 90�� �̻��� ������ ���
		Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
		// Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);

		System.out.println("------------");
		
		// 90�� �̻��� ����� ��
		//double count = Arrays.stream(scores).filter(x -> x >= 90).count();
		int count = (int)Arrays.stream(scores).filter(x -> x >= 90).count();
		System.out.println(count);
		System.out.println("------------");
		
		// 90�� �̻��� �������� ��
		int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
		System.out.println(sum);
		System.out.println("------------");
		
		// 90�� �̻��� �������� ����
		Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);
		System.out.println("------------");

		// "python", "java", "java script", "c", "c++", "c#"
		// c �� �����ϴ� ���ڿ�
		Arrays.stream(langs).filter(x -> x.startsWith("c")).forEach(System.out :: println);
		System.out.println("------------");
		
		// java �����ϴ� ���
		Arrays.stream(langs).filter(x -> x.contains("java")).forEach(System.out::println);
		System.out.println("------------");
		
		// 4���� ������ ���ڿ��� �����ؼ� ���
		Arrays.stream(langs).filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
		System.out.println("------------");
		langList.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
		System.out.println("------------");
		
		// 4���� ������ ���ڿ� �߿��� c��� ���ڸ� �����ϴ� ���ڿ�
		langList.stream()
				.filter(x -> x.length() <= 4)
				.filter(x -> x.contains("c"))
				.forEach(System.out::println);
		System.out.println("------------");
		
		// 4���� ������ ���ڿ� �� c ��� ���ڸ� �����ϴ� ���ڿ��� �ϳ��� �ִ��� ����
		boolean anyMatch = langList.stream()
				.filter(x -> x.length() <= 4)
				.anyMatch(x -> x.contains("c"));
		System.out.println(anyMatch);
		System.out.println("------------");
		
		// 4���� ������ ���ڿ��� ��� c ��� ���ڸ� �����ϴ��� ����
		boolean allMatch = langList.stream()
				.filter(x -> x.length() <= 4)
				.allMatch(x -> x.contains("c"));
		System.out.println(allMatch);
		System.out.println("------------");
		
		// 4���� ������ ��� �� c ��� ���ڸ� �����ϴ� ��� �ڿ� (�������) ��� ���ڸ� �Բ� ���
		// map 
		langList.stream()
				.filter(x -> x.length() <= 4)
				.filter(x -> x.contains("c"))
				.map(x -> x + " �������")
				.forEach(System.out::println);
		System.out.println("------------");
		
		// c ��� ���ڸ� �����ϴ� �� �빮�ڷ� ���
		langList.stream()
				.filter(x -> x.contains("c"))
				//.map(x -> x.toUpperCase())
				.map(String::toUpperCase)
				.forEach(System.out::println);
		System.out.println("------------");
		
		// c ��� ���ڸ�  �����ϴ� �� �빮�ڷ� �����Ͽ� ����Ʈ�� ����
		List<String> langListStartsWithC = langList.stream()
											.filter(x -> x.contains("c"))
											.map(String::toUpperCase)
											.collect(Collectors.toList());
		
		langListStartsWithC.stream().forEach(System.out::println);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
