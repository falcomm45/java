package _06_19;

// ������ �����ϴ� Student Ŭ������ �ۼ��Ͻÿ�.
// String���� �а��� �������� �й��� �ʵ�� ����
// Student Ŭ������ main() �޼ҵ忡�� Student ��ü�� �����Ͽ� �а��� �й� �ʵ忡 ������ ���� �Է� �� ���

// ������ ������ Student Ŭ������ ������ �����ϵ��� ����� �߰��Ͽ� �ۼ��Ͻÿ�.
// �ʵ带 ��� private�� �ϰ�, getter�� setter�� �����ϰ�
// Student Ŭ������ main() �޼ҵ忡�� Student ��ü�� �����Ͽ� setter�� ����Ͽ� �а��� �й� �ʵ忡 ������ ���� �Է� �� ���


public class Example03 {
		public static void main(String[] args) {
			Student std = new Student();
			std.setDepartment("����ȭ�а��а�");
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
		System.out.println("�а� : " + department);
		System.out.println("�й� : " + studentId);
	}
	
	
}
