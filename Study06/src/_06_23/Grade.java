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
		System.out.println("\t성적표");
		System.out.println("-------------");
		System.out.print("성적을 입력하세요\n국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		math = sc.nextInt();
		System.out.println("총점 : " + calcGrade());
		System.out.println("평균 : " + calcGrade()/3);
		
	}
}
