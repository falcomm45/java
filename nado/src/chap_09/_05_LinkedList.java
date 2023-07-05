package chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
	public static void main(String[] args) {
		// ��ũ�� ����Ʈ
		LinkedList<String> list = new LinkedList<>();
		
		// ������ �߰�
		list.add("���缮");
		list.add("����ȣ");
		list.add("�ڸ��");
		list.add("��ȣ��");
		list.add("������");
		
		// ������ ��ȸ
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		System.out.println("------------------------");
		// �߰�
		list.addFirst("������");
		for (String s : list) {
			System.out.println(s);
		}
		
		System.out.println("------------------------");

		list.addLast("����ö");
		for (String s : list) {
			System.out.println(s);
		}
		
		System.out.println("------------------------");
		
		System.out.println("�л� �߰� �� (index 1) : " + list.get(1));
		list.add(1, "�迵ö");
		System.out.println("�л� �߰� �� (index 2) : " + list.get(1));
		System.out.println("�л� �߰� �� (index 2) : " + list.get(2));
		
		System.out.println("------------------------");

		// ����
		System.out.println("���� �л� �� (���� ��) : " + list.size());
		list.remove(list.size()-1);
		System.out.println("���� �л� �� (���� ��) : " + list.size());
		System.out.println("------------------------");

		// ó�� �л��� ������ �л� ����
		System.out.println("���� �л� �� (���� ��) : " + list.size());
		for (String s : list) {
			System.out.println(s);
		}
		list.removeFirst(); // ó�� ������ ����
		list.removeLast(); // ������ ������ ����
		System.out.println("���� �л� �� (���� ��) : " + list.size());
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("------------------------");

		// ����
		list.set(0, "�̼���");
		System.out.println(list.get(0));
		
		// Ȯ��
		System.out.println(list.indexOf("��ȣ��"));
		if (list.contains("��ȣ��")) {
			System.out.println("���� ��û ����");
		} else {
			System.out.println("���� ��û ����");
		}
		System.out.println("------------------------");

		// ��ü ����
		list.clear();
		if (list.isEmpty()) {
			System.out.println("�л� �� : " + list.size());
			System.out.println("����Ʈ�� ������ϴ�.");
		}
		System.out.println("------------------------");

		// ���ο� �б�
		list.add("���缮");
		list.add("����ȣ");
		list.add("�ڸ��");
		list.add("��ȣ��");
		list.add("������");
		
		Collections.sort(list);
		for (String s : list) {
			System.out.println(s);
		}
	}
}
