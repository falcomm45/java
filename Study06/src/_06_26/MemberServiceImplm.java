package _06_26;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberServiceImplm implements MemberService {

	ArrayList<Member> member = new ArrayList<>();
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void list() {
		System.out.println("-------회원 목록---------");
		if (member.size() == 0) {
			System.out.println("입력된 회원이 없습니다.");
			System.out.println("회원을 등록해주세요.");
			return;
		} else {
			for (int i = 0; i < member.size(); i++) {
				Member m = member.get(i);
				m.memberList();
			}
		}
	}

	@Override
	public void view() {
		System.out.println("--회원 정보 출력--");
		System.out.print("회원의 이름을 입력해주세요 : ");
		String name = sc.next();
		for (int i = 0; i < member.size(); i++) {
			if (member.get(i).getName().equals(name)) {
				member.get(i).memberList();
				return;
			}
		}
		System.out.println("입력하신 회원은 존재하지 않습니다.");
	}

	@Override
	public void insert() {
		System.out.println("--회원 등록--");
		System.out.print("회원의 이름을 입력해주세요 : ");
		String name = sc.next();
		System.out.print("회원의 나이를 입력해주세요 : ");
		int age = sc.nextInt();
		System.out.print("회원의 번호를 입력해주세요 : ");
		String phone = sc.next();
		member.add(new Member(name, age, phone));
	}

	@Override
	public void edit() {
		System.out.println("--회원 수정--");
		System.out.print("수정할 회원의 이름을 입력하세요 : ");
		String name = sc.next();
		for (int i = 0; i < member.size(); i++) {
			if(member.get(i).getName().equals(name)) {
				System.out.println(name + "님의 나이는 " + member.get(i).getAge() 
						+ "살, 번호는 " + member.get(i).getPhone() + "입니다.");
				System.out.print("나이 수정 : ");
				int newAge = sc.nextInt();
				System.out.print("번호 수정 : ");
				String newPhone = sc.next();
				member.remove(i);
				member.add(new Member(name, newAge, newPhone));
				return;
			}
		}
		System.out.println("입력하신 회원은 존재하지 않습니다.");
	}

	@Override
	public void delete() {
		System.out.println("--회원 삭제--");
		System.out.print("삭제할 회원의 이름을 입력하세요 : ");
		String name = sc.next();
		for (int i = 0; i < member.size(); i++) {
			if (member.get(i).getName().equals(name)) {
				member.remove(i);
				System.out.println(name + "회원님이 삭제되었습니다.");
				return;
			}
		}
		System.out.println("입력하신 회원은 존재하지 않습니다.");		
	}

	@Override
	public void exit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}

}
