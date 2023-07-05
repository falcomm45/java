package chap_09;

public class _03_WrapperClass {
	public static void main(String[] args) {
		// ���� (Wrapper) Ŭ����
		// int double float char �⺻ �ڷ����� ��ü���·� ����� ����� �� �ְ� ���ش�
		// Integer Double Float Character
		
		Integer i = 123; // int i = 123;
		Double d = 1.0; // double d = 1.0;
		Character c = 'a'; // char c = 'a';
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(c);
		
		System.out.println("---------------");
		
		System.out.println(i.intValue());
		System.out.println(d.intValue());
		System.out.println(c.charValue());
		
		System.out.println("---------------");

		String s = i.toString();
		System.out.println(s);
	}
}