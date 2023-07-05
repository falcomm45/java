package _06_26;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberServiceImplm implements MemberService {

	ArrayList<Member> member = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void list() {
		System.out.println("-------ȸ�� ���---------");
		if (member.size() == 0) {
			System.out.println("�Էµ� ȸ���� �����ϴ�.");
			System.out.println("ȸ���� ������ּ���.");
			return;
		} else {
			for (int i = 0; i < member.size(); i++) {
				Member m = member.get(i);
				m.memberList();
			}
		}
	}

	@Override
	public void view() {
		System.out.println("--ȸ�� ���� ���--");
		System.out.print("ȸ���� �̸��� �Է����ּ��� : ");
		String name = sc.next();
		for (int i = 0; i < member.size(); i++) {
			if (member.get(i).getName().equals(name)) {
				member.get(i).memberList();
				return;
			}
		}
		System.out.println("�Է��Ͻ� ȸ���� �������� �ʽ��ϴ�.");
	}

	@Override
	public void insert() {
		System.out.println("--ȸ�� ���--");
		System.out.print("ȸ���� �̸��� �Է����ּ��� : ");
		String name = sc.next();
		System.out.print("ȸ���� ���̸� �Է����ּ��� : ");
		int age = sc.nextInt();
		System.out.print("ȸ���� ��ȣ�� �Է����ּ��� : ");
		String phone = sc.next();
		member.add(new Member(name, age, phone));
	}

	@Override
	public void edit() {
		System.out.println("--ȸ�� ����--");
		System.out.print("������ ȸ���� �̸��� �Է��ϼ��� : ");
		String name = sc.next();
		for (int i = 0; i < member.size(); i++) {
			if(member.get(i).getName().equals(name)) {
				System.out.println(name + "���� ���̴� " + member.get(i).getAge() 
						+ "��, ��ȣ�� " + member.get(i).getPhone() + "�Դϴ�.");
				System.out.print("���� ���� : ");
				int newAge = sc.nextInt();
				System.out.print("��ȣ ���� : ");
				String newPhone = sc.next();
				member.remove(i);
				member.add(new Member(name, newAge, newPhone));
				return;
			}
		}
		System.out.println("�Է��Ͻ� ȸ���� �������� �ʽ��ϴ�.");
	}

	@Override
	public void delete() {
		System.out.println("--ȸ�� ����--");
		System.out.print("������ ȸ���� �̸��� �Է��ϼ��� : ");
		String name = sc.next();
		for (int i = 0; i < member.size(); i++) {
			if (member.get(i).getName().equals(name)) {
				member.remove(i);
				System.out.println(name + "ȸ������ �����Ǿ����ϴ�.");
				return;
			}
		}
		System.out.println("�Է��Ͻ� ȸ���� �������� �ʽ��ϴ�.");		
	}

	@Override
	public void exit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}

}
