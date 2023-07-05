package _06_26;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// HashSet�� Student ��ü�� �����Ϸ��� �մϴ�. 
// �й��� ������ ������ Student��� �����ϰ� �ߺ� ������ ���� �ʵ��� �ϰ� �ͽ��ϴ�. 
// Student Ŭ�������� �������ؾ� �ϴ� hashCode()�� equals() �޼ҵ��� ������ ä��������. 
// Student�� �ؽ��ڵ�� �й��̶�� �����մϴ�.


public class Set02 {
	public static void main(String[] args) {
        Set<Students> set = new HashSet<Students>();
 
        set.add(new Students(1, "ȫ�浿"));
        set.add(new Students(2, "�ſ��"));
        set.add(new Students(1, "���ο�")); //�й��� �����Ƿ� ������� ����
        
 
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
