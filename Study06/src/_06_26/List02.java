package _06_26;

import java.util.ArrayList;

public class List02 {
	public static void main(String[] args) {
		Student2 ss = new Student2(1001, "Lee");
		ss.addSubject("국어", 100);
		ss.addSubject("수학", 50);
		Student2 sss = new Student2(1002, "Kim");
		sss.addSubject("국어", 70);
		sss.addSubject("수학", 85);
		sss.addSubject("영어", 100);
		
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
            System.out.println("학생 "+name+"의 "+s.getSubName()+" 과목 성적은 "+s.getScore()+"입니다.");
        }
        System.out.println("학생 "+name+"의 총점은 "+total+" 입니다.");
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
