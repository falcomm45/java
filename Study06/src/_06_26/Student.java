package _06_26;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
	public static void main(String[] args) {
		ArrayList<Std> std = new ArrayList<>();
		
		std.add(new Std(1122222,"ȫ�浿", "������½"));
		std.add(new Std(1234123,"ȫ���", "������½"));
		std.add(new Std(1233344,"�̸��", "�ƹ�����"));
		std.add(new Std(2345566,"������", "�ƹ�����"));
		std.add(new Std(3443444,"�ڱ���", "���ҷ�?"));
		
		System.out.println("---------�Ϲ� for��---------");
		for (int i = 0; i < std.size(); i++) {
			Std s = std.get(i);
			s.profileInfo();
			// std.get(i).profileInfo();
		}
		
		System.out.println("---------���� for��---------");
		for (Std s : std) {
			s.profileInfo();
		}
		
		System.out.println("---------Iiterator---------");
		Iterator<Std> iter = std.iterator();
		while(iter.hasNext()) {
			Std s = iter.next();
			s.profileInfo();
		}
		
	}
}

//5. ArrayList���� Student��ü�� �й�, �̸�, �а�

//1) �Ϲ� for��  2) ���� for�� 3) Iterator�� ����ؼ� ����ϱ�
class Std {
	
	private int studentId;
	private String name;
	private String department;
	
	public Std(int studentId, String name, String department) {
		this.studentId = studentId;
		this.name = name;
		this.department = department;
	}
	
	public void profileInfo() {
		System.out.println("�й� : " + studentId + " || �̸� : " + name + " || �а� : " + department);
		System.out.println("---------------------------------------");
	}
	
	
	
	

}
