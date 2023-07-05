package _06_19;

// 다음을 만족하는 Student 클래스를 작성하시오.
// String형의 학과와 정수형의 학번을 필드로 선언
// Student 클래스의 main() 메소드에서 Student 객체를 생성하여 학과와 학번 필드에 적당한 값을 입력 후 출력

// 위에서 구현한 Student 클래스를 다음을 만족하도록 기능을 추가하여 작성하시오.
// 필드를 모두 private로 하고, getter와 setter를 구현하고
// Student 클래스의 main() 메소드에서 Student 객체를 생성하여 setter를 사용하여 학과와 학번 필드에 적당한 값을 입력 후 출력


public class Example03 {
		public static void main(String[] args) {
			Student std = new Student();
			std.setDepartment("정밀화학공학과");
			std.setStudentId(112275);
			std.print();
		}
	
}

class Student {
	
	private String department;
	private int studentId;
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public int getStudentId() {
		return studentId;
	}
		
	void print() {
		System.out.println("학과 : " + department);
		System.out.println("학번 : " + studentId);
	}
	
	
}
