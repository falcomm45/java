package _06_21;

public class Example01 {
	public static void main(String[] args) {
		MyFriendDetailInfo info = new MyFriendDetailInfo("ȫ�浿", 321, "�Ѿ�", "����");
		info.showInfo();
	}
}


class MyFriendInfo {
	
	String name;
	int age;
	
	MyFriendInfo(){}
	MyFriendInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}	
	
	public void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}
}

class MyFriendDetailInfo extends MyFriendInfo {
	
	String address;
	String telno;
	
	MyFriendDetailInfo(String name, int age, String address, String telno) {
		super(name, age);
		this.address = address;
		this.telno = telno;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("�ּ� : " + address);
		System.out.println("����ó : " + telno);
	}
}

