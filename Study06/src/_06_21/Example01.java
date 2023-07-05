package _06_21;

public class Example01 {
	public static void main(String[] args) {
		MyFriendDetailInfo info = new MyFriendDetailInfo("홍길동", 321, "한양", "없음");
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
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
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
		System.out.println("주소 : " + address);
		System.out.println("연락처 : " + telno);
	}
}

