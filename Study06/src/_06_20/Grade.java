package _06_20;

import java.util.Scanner;

public class Grade {
	
	int math;
	int science;
	int english;
	
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}
	
	double average() {
		return (double)(math+science+english)/(double)3;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� : ");
		int scorem = sc.nextInt();
		System.out.print("�������� : ");
		int scores = sc.nextInt();
		System.out.print("�������� : ");
		int scoree = sc.nextInt();
		
		Grade grade = new Grade(scorem, scores,scoree);
		System.out.println(grade.average());
		
	}
	
}
