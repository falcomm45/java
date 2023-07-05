package _06_26;

import java.util.ArrayList;

public class List02 {
	public static void main(String[] args) {
		Student2 ss = new Student2(1001, "Lee");
		ss.addSubject("����", 100);
		ss.addSubject("����", 50);
		Student2 sss = new Student2(1002, "Kim");
		sss.addSubject("����", 70);
		sss.addSubject("����", 85);
		sss.addSubject("����", 100);
		
		ss.showStudentInfo();
		System.out.println("--------------");
		sss.showStudentInfo();
	}
}

class Student2 {
	private int studentId;
	private String name;
	
	ArrayList<Subject> sub = new ArrayList<>();
	
	public Student2(int studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}
	
	public void addSubject(String subName, int score) {
		Subject sub = new Subject();
		sub.setSubName(subName);
		sub.setScore(score);
		this.sub.add(sub);
	}
	
	public void showStudentInfo() {
        int total = 0;
        for(Subject s : sub) {
            total += s.getScore();
            System.out.println("�л� "+name+"�� "+s.getSubName()+" ���� ������ "+s.getScore()+"�Դϴ�.");
        }
        System.out.println("�л� "+name+"�� ������ "+total+" �Դϴ�.");
    }
	
	
}

class Subject {
	private String subName;
	private int score;
	
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
}
