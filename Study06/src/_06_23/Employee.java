package _06_23;

public class Employee {
	private long empNo;
	private String name;
	private String dept;
	private String position;
	private int age;
	private boolean gender;
	private int annualSalary;
	private String telno;
	private String address;
	private boolean performance;
	
	Employee(long empNo, String name, String dept, String position) {
		this.empNo = empNo;
		this.name = name;
		this.dept = dept;
		this.position = position;
	}
	
	 void setAnnualSalary(int annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	int calcSalary() {
		return (int)(annualSalary/12*0.92);
	}
	
	 void setPerformance(boolean performance) {
		this.performance = performance;
	}
	
	int negoSalary() {
		if (performance) {
			annualSalary = (int)(annualSalary*1.025);
			return annualSalary;
		} else {
			return annualSalary;
		}
	}
	
	void printInfo() {
		System.out.println("��� : " + empNo);
		System.out.println("�̸� : " + name);
		System.out.println("�μ� : " + dept);
		System.out.println("���� : " + position);
		System.out.println("���� : " + annualSalary);
		System.out.println("�Ǽ��ɾ� : " + calcSalary());
	}
	
	public static void main(String[] args) {
		Employee emp = new Employee(15544887, "������", "������", "�븮");
		emp.setAnnualSalary(80000000);
		emp.calcSalary();
		emp.setPerformance(true);
		emp.negoSalary();
		emp.printInfo();
	}
}
