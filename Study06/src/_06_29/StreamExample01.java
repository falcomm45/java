package _06_29;

import java.util.ArrayList;
import java.util.List;

public class StreamExample01 {
	public static void main(String[] args) {
		List<User> user = new ArrayList<>();

		user.add(new User("������", "�౸:��:�߱�", "�������� ���ƿ�"));
		user.add(new User("������", "����:�籸:�౸", "�����ϴµ� �ٱ� �Ⱦ�"));
		user.add(new User("�Ӹ��", "�ǾƳ�", "�Ҹ��� ���ƿ� �������Ƴʹ�����"));
		user.add(new User("�Ҹ���", "��������:����", "�����ϴ� �Ҹ��� ����"));
		user.add(new User("������", "����:�߱�", "��� ���ƿ�"));
		user.add(new User("������", "����:�౸:��", "���ߵ� ���� ��� ����"));

		int soccer = (int) user.stream().filter(x -> x.hobby.contains("�౸")).count();
		int basketball = (int) user.stream().filter(x -> x.hobby.contains("��")).count();
		int baseball = (int) user.stream().filter(x -> x.hobby.contains("�߱�")).count();
		int piano = (int) user.stream().filter(x -> x.hobby.contains("�ǾƳ�")).count();
		int sportDance = (int) user.stream().filter(x -> x.hobby.contains("��������")).count();
		int programing = (int) user.stream().filter(x -> x.hobby.contains("����")).count();
		int billiards = (int) user.stream().filter(x -> x.hobby.contains("�籸")).count();
		int golf = (int) user.stream().filter(x -> x.hobby.contains("����")).count();

		System.out.println(soccer);
		System.out.println(basketball);
		System.out.println(baseball);
		System.out.println(piano);
		System.out.println(sportDance);
		System.out.println(programing);
		System.out.println(billiards);
		System.out.println(golf);
		System.out.println();
		
		soccer = (int) user.stream().filter(x -> x.name.contains("��")).filter(x -> x.hobby.contains("�౸")).count();
		basketball = (int) user.stream().filter(x -> x.name.contains("��")).filter(x -> x.hobby.contains("��")).count();
		baseball = (int) user.stream().filter(x -> x.name.contains("��")).filter(x -> x.hobby.contains("�߱�")).count();
		piano = (int) user.stream().filter(x -> x.name.contains("��")).filter(x -> x.hobby.contains("�ǾƳ�")).count();
		sportDance = (int) user.stream().filter(x -> x.name.contains("��")).filter(x -> x.hobby.contains("��������")).count();
		programing = (int) user.stream().filter(x -> x.name.contains("��")).filter(x -> x.hobby.contains("����")).count();
		billiards = (int) user.stream().filter(x -> x.name.contains("��")).filter(x -> x.hobby.contains("�籸")).count();
		golf = (int) user.stream().filter(x -> x.name.contains("��")).filter(x -> x.hobby.contains("����")).count();
		
		System.out.println(soccer);
		System.out.println(basketball);
		System.out.println(baseball);
		System.out.println(piano);
		System.out.println(sportDance);
		System.out.println(programing);
		System.out.println(billiards);
		System.out.println(golf);
		System.out.println();
		
		
		int like = (int)user.stream().filter(x -> x.introduce.contains("����")).count();
		System.out.println(like);
	}
}

class User {
	String name;
	String hobby;
	String introduce;

	User(String name, String hobby, String introduce) {
		this.name = name;
		this.hobby = hobby;
		this.introduce = introduce;
	}

}