package _06_23;

import java.util.Scanner;

public class Grade {
	
	public static void main(String[] args) {
		Grade g = new Grade();
		g.printGrade();
	}
	
	private int kor;
	
	private int eng;
	
	private int math;
	
	Scanner sc = new Scanner(System.in);
	
	int calcGrade() {
		return  kor + eng + math;
	}
	
	void printGrade() {
		System.out.println("\t����ǥ");
		System.out.println("-------------");
		System.out.print("������ �Է��ϼ���\n���� : ");
		kor = sc.nextInt();
		System.out.print("���� : ");
		eng = sc.nextInt();
		System.out.print("���� : ");
		math = sc.nextInt();
		System.out.println("���� : " + calcGrade());
		System.out.println("��� : " + calcGrade()/3);
		
	}
}
