package _06_26;

import java.util.HashSet;
import java.util.Iterator;

public class Set01 {
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		set.add("����");
		set.add("���");
		set.add("��");
		set.add("�Ѷ��");
		set.add("���θӽ���");
		
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
	}
}
