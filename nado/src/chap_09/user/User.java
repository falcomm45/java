package chap_09.user;

public class User {
	
	public String name;
	
	public User(String name) {
		this.name = name;
	}
	
	public void addPoint() {
		System.out.println(name + "��, ����Ʈ �����Ǿ����ϴ�.");
	}
}
