package _06_26;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {
	public static void main(String[] args) {
		ArrayList<Std> std = new ArrayList<>();
		
		std.add(new Std(1122222,"홍길동", "동에번쩍"));
		std.add(new Std(1234123,"홍길순", "서에번쩍"));
		std.add(new Std(1233344,"이명박", "아버지를"));
		std.add(new Std(2345566,"문재인", "아버지라"));
		std.add(new Std(3443444,"박근혜", "못불러?"));
		
		System.out.println("---------일반 for문---------");
		for (int i = 0; i < std.size(); i++) {
			Std s = std.get(i);
			s.profileInfo();
			// std.get(i).profileInfo();
		}
		
		System.out.println("---------향상된 for문---------");
		for (Std s : std) {
			s.profileInfo();
		}
		
		System.out.println("---------Iiterator---------");
		Iterator<Std> iter = std.iterator();
		while(iter.hasNext()) {
			Std s = iter.next();
			s.profileInfo();
		}
		
	}
}

//5. ArrayList안의 Student객체의 학번, 이름, 학과

//1) 일반 for문  2) 향상된 for문 3) Iterator를 사용해서 출력하기
class Std {
	
	private int studentId;
	private String name;
	private String department;
	
	public Std(int studentId, String name, String department) {
		this.studentId = studentId;
		this.name = name;
		this.department = department;
	}
	
	public void profileInfo() {
		System.out.println("학번 : " + studentId + " || 이름 : " + name + " || 학과 : " + department);
		System.out.println("---------------------------------------");
	}
	
	
	
	

}
