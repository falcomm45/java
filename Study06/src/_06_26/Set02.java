package _06_26;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// HashSet에 Student 객체를 저장하려고 합니다. 
// 학번이 같으면 동일한 Student라고 가정하고 중복 저장이 되지 않도록 하고 싶습니다. 
// Student 클래스에서 재정의해야 하는 hashCode()와 equals() 메소드의 내용을 채워보세요. 
// Student의 해시코드는 학번이라고 가정합니다.


public class Set02 {
	public static void main(String[] args) {
        Set<Students> set = new HashSet<Students>();
 
        set.add(new Students(1, "홍길동"));
        set.add(new Students(2, "신용권"));
        set.add(new Students(1, "조민우")); //학번이 같으므로 저장되지 않음
        
 
        Iterator<Students> iterator = set.iterator();
        while (iterator.hasNext()) {
            Students student = iterator.next();
            System.out.println(student.getStdId() + " : " + student.getName());
        }
    }
}


class Students {
	private int stdId;
	private String name;
	
	public Students (int stdId, String name) {
		this.stdId = stdId;
		this.name = name;
	}
	
	public int getStdId() {
		return stdId;
	}
	
	public String getName() {
		return name;
	}
	
	public int hasCode() {
		return stdId;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Students) {
			Students student = (Students)obj;
			if (student.stdId == stdId) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	
	
}
