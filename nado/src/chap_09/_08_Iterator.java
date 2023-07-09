package chap_09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
// import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class _08_Iterator {
	public static void main(String[] args) {
		// ���ͷ�����

		List<String> list = new ArrayList<>();
		// List<String> list2 = new LinkedList<>();

		list.add("���缮");
		list.add("(�� �� ����)");
		list.add("������");
		list.add("(�� �� ����)");
		list.add("��ȣ��");
		list.add("(�� �� ����)");
		list.add("�ڸ��");
		list.add("(�� �� ����)");
		list.add("����ȣ");

		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("--------------------");

		Iterator<String> it = list.iterator();

		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());

		System.out.println("--------------------");

		it = list.iterator(); // Ŀ���� ó�� ��ġ�� �̵�
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("--------------------");

		it = list.iterator(); // Ŀ���� ó�� ��ġ�� �̵�
		while (it.hasNext()) {
			String s = it.next();
			if (s.contains("�� �� ����")) {
				it.remove(); // ����
			}
		}
		it = list.iterator(); // Ŀ���� ó�� ��ġ�� �̵�
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("--------------------");
		
		
		HashSet<String> set = new HashSet<>();
		set.add("���缮");
		set.add("�ڸ��");
		Iterator<String> itSet = set.iterator();
		
		// HashSet �� ���� ���� X
		while(itSet.hasNext()) {
			System.out.println(itSet.next());
		}
		System.out.println("--------------------");

		HashMap<String, Integer> map = new HashMap<>();
		map.put("���缮", 10);
		map.put("�ڸ��", 6);
		
		// map.iterator() �������� ����
		
		Iterator<String> itMapKey = map.keySet().iterator();
		while(itMapKey.hasNext()) {
			System.out.println(itMapKey.next());
		}
		System.out.println("--------------------");
		
		Iterator<Integer> itMapValue = map.values().iterator();
		while(itMapValue.hasNext()) {
			System.out.println(itMapValue.next());
		}
		System.out.println("--------------------");
		
		Iterator<Map.Entry<String, Integer>> itMap = map.entrySet().iterator();
		while(itMap.hasNext()) {
			System.out.println(itMap.next());
		}
		System.out.println("--------------------");
		
		
	}
}
