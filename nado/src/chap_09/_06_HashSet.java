
package chap_09;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
	public static void main(String[] args) {
		// ��Ʈ
		HashSet<String> set = new HashSet<>();
		
		// ������ �߰�
		set.add("����");
		set.add("����");
		set.add("����");
		set.add("�ұ�");
		set.add("����");
		set.add("����");
		set.add("����");
		set.add("����");
		set.add("����");
		
		System.out.println("�� ���� ��ǰ �� : " + set.size());
		
		for (String s : set) {
			System.out.println(s);
		}
		System.out.println("------------------");
		
		// Ȯ��
		if (set.contains("����")) {
			System.out.println("���� �緯 ���");
		}
		System.out.println("------------------");
		
		// ����
		System.out.println("�� ���� ��ǰ �� (���� ���� ��) : " + set.size());
		set.remove("����");
		System.out.println("�� ���� ��ǰ �� (���� ���� ��) : " + set.size());
		System.out.println("------------------");

		// ��ü ����
		set.clear();
		if (set.isEmpty()) {
			System.out.println("���� ���� ��ǰ �� : " + set.size());
			System.out.println("������ ���");
		}
		
		// ��Ʈ : �ߺ� ��� X, ���� ���� X
		HashSet<Integer> intSet = new HashSet<>();
		// ���� ������ ���ؼ��� LinkedHashSet ���
		HashSet<Integer> intSet2 = new LinkedHashSet<>();	
		intSet.add(1);
		intSet.add(13);
		intSet.add(5);
		intSet2.add(1);
		intSet2.add(13);
		intSet2.add(5);
		
		for (Integer i : intSet) {
			System.out.println(i);
		}
		System.out.println("------------------");

		for (Integer i : intSet2) {
			System.out.println(i);
		}
		
	}
}
