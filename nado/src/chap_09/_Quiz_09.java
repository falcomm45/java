package chap_09;

import java.util.ArrayList;

// ArrayList �� �̿��Ͽ� �л��� ���α׷��� ��� �ڰ��� ��� ������ �����ϰ�,
// �ڹ� �ڰ����� ������ �л� �̸��� ����Ͻÿ�
// �л� �̸� �� �ڰ��� ��� ������ ���� Student Ŭ���� ����
// �л� 1�δ� ���� �ڰ����� 1���� ����
// ��� Ŭ������ �ϳ��� ���Ͽ� ����
// ���缮 ���̽�
// �ڸ�� �ڹ�
// ������ �ڹ�
// ����ȣ C
// ������ ���̽�

public class _Quiz_09 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		Student s1 = new Student("���缮", "���̽�");
		Student s2 = new Student("�ڸ��", "�ڹ�");
		Student s3 = new Student("������", "�ڹ�");
		Student s4 = new Student("����ȣ", "C");
		Student s5 = new Student("������", "���̽�");

		list.add(new Student("���缮", "���̽�"));
		list.add(new Student("�ڸ��", "�ڹ�"));
		list.add(new Student("������", "�ڹ�"));
		list.add(new Student("����ȣ", "C"));
		list.add(new Student("������", "���̽�"));
		
		for(Student s : list) {
			if (s.certificate.equals("�ڹ�")) {
				System.out.println(s.name);
			}
		}
		
		System.out.println("�ڹ� �ڰ����� ������ �л�");
		System.out.println("-----------------");
				
		for (Student s : list) {
			if (s.certificate.equals("�ڹ�")) {
				System.out.println(s.name);
			}
		}
	}
}

class Student {

	public String name;
	public String certificate;

	Student(String name, String certificate) {
		this.name = name;
		this.certificate = certificate;
	}

}
