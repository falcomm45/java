package _06_26;

public class Member {
	
	private String name;
	private int age;
	private String phone;
	
	public Member(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void memberList() {
		System.out.println(name + "회원 || " + age + "살 || " + phone + "번");
	}
}
