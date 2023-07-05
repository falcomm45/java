package chap_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
	public static void main(String[] args) {
		// �÷��� �����ӿ�ũ (List, Set, Map)
		ArrayList<String> list = new ArrayList<>();
		
		// ������ �߰�
		list.add("���缮");
		list.add("������");
		list.add("����ȣ");
		list.add("�ڸ��");
		list.add("��ȣ��");
		
		// ������ ��ȸ (�ε��� ����)
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		
		System.out.println("-------------------");
		
		// ������ ����
		System.out.println("��û �л� �� (���� ��) : " + list.size());
		list.remove(3); // list.remove("�ڸ��");
		System.out.println("��û �л� �� (���� ��) : " + list.size());
		System.out.println(list.get(3));
		
		System.out.println("-------------------");

		System.out.println("���� �л� �� (���� ��) : " + list.size());
		list.remove(list.size() - 1);
		System.out.println("���� �л� �� (���� ��) : " + list.size());
		
		System.out.println("-------------------");

		// ��ȸ
		for (String s : list) {
			System.out.println(s);
		}
		
		System.out.println("-------------------");
		
		// ����
		System.out.println("������ �絵 �� : " + list.get(0));
		list.set(0, "�̼���");
		System.out.println("������ �絵 �� : " + list.get(0));
		System.out.println("-------------------");

		// Ȯ��
		System.out.println(list.indexOf("������")); // �ε�����
		// ������ 5�� ���� ���ԵǾ��°�?
		if(list.contains("������")) {
			System.out.println("���� ��û ����");
		} else {
			System.out.println("���� ��û ����");
		}
		System.out.println("-------------------");

		// ��ü ����
		list.clear();
		if (list.isEmpty()) {
			System.out.println("�л��� : " + list.size());
			System.out.println("����Ʈ�� ������ϴ�.");
		} 
		
		// ���� �б� ���� ���� ����
		list.add("���缮");
		list.add("������");
		list.add("����ȣ");
		list.add("�ڸ��");
		list.add("��ȣ��");
		System.out.println("-------------------");

		// ����
		Collections.sort(list);
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println(list.get(0));
	}		
}
