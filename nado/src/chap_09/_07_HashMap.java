package chap_09;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class _07_HashMap {
	public static void main(String[] args) {
		// �� (Key, Value)
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		// ������ �߰�
		map.put("���缮", 10);
		map.put("�ڸ��", 5);
		map.put("������", 3);
		map.put("������", 15);
		
		System.out.println("�� �� �� : " + map.size());
		System.out.println("--------------------");
		
		// ��ȸ
		System.out.println("���缮���� ����Ʈ : " + map.get("���缮"));
		System.out.println("�ڸ������ ����Ʈ : " + map.get("�ڸ��"));
		System.out.println("--------------------");
		
		// Ȯ��
		if (map.containsKey("������")) {
			int point = map.get("������");
			map.put("������", ++point);
			System.out.println("���� ����Ʈ : " + map.get("������"));
		} else {
			map.put("������", 1);
			System.out.println("�����ƴ� �ű� ��� (����Ʈ1)");
		}
		System.out.println("--------------------");

		// ����
		map.remove("���缮");
		System.out.println(map.get("���缮"));
		System.out.println("--------------------");
		
		// ��ü ����
		map.clear();
		if (map.isEmpty()) {
			System.out.println("���� �� �� : " + map.size());
			System.out.println("���� ���");
		}
		
		// �ٽ� �߰�
		map.put("���缮", 10);
		map.put("�ڸ��", 5);
		map.put("������", 3);
		map.put("������", 15);
		System.out.println("--------------------");

		// Key Ȯ�� / ���� ���� X, Key ���� �ߺ� ��� X
		for (String key : map.keySet()) {
			System.out.println(key);
		}
		System.out.println("--------------------");
		
		// Value Ȯ��
		for (int value : map.values()) {
			System.out.println(value);
		}
		System.out.println("--------------------");
		
		// Key & Value �Բ� Ȯ��
		for (String key : map.keySet()) {
			System.out.println("�� �̸� : " + key + "\t����Ʈ : " + map.get(key));	
		}
		System.out.println("--------------------");
		
		// �� : �ߺ� X, ���� ���� X
		// Value ���� ������ ������Ʈ�� ��
		map.put("������", 10);
		map.put("������", 70);
		map.put("������", 30);
		for (String key : map.keySet()) {
			System.out.println("�� �̸� : " + key + "\t����Ʈ : " + map.get(key));	
		}
		System.out.println("--------------------");
		
		// HashSet �� ���������� ������ �����ϱ� ���ؼ��� Linked ���
		HashMap<String, Integer> map2 = new LinkedHashMap<String, Integer>();
		

	}	
}
