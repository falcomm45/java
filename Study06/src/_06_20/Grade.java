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
		System.out.print("수학점수 : ");
		int scorem = sc.nextInt();
		System.out.print("과학점수 : ");
		int scores = sc.nextInt();
		System.out.print("영어점수 : ");
		int scoree = sc.nextInt();
		
		Grade grade = new Grade(scorem, scores,scoree);
		System.out.println(grade.average());
		
	}
	
}
