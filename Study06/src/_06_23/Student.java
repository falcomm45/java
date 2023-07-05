package _06_23;

public class Student {
	private String dept;
	
	private int sid;
	
	Student(String dept, int sid) {
		this.dept = dept;
		this.sid = sid;
	}
	
	void setDept(String dept) {
		this.dept = dept;
	}
	
	String getDept() {
		return dept;
	}
	
	void setSid(int sid) {
		this.sid = sid;
	}
	
	int getSid() {
		return sid;
	}
	
	void printInfo() {
		System.out.println("학과 : " + dept);
		System.out.println("학번 : " + sid);
	}
	
	public static void main(String[] args) {
		Student std = new Student("정밀화학공학", 112275);
		std.printInfo();
		System.out.println("---------------");
		std.setDept("화학공정전공");
		std.setSid(114578);
		std.printInfo();
		
	}
	
}
