package service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import dao.MemberDAO;

public class MemberService {
	// 싱글톤
	
	// 회원 모두 조회(searchAll)
	// 회원 삭제(delete)
	private static MemberService instance = null;
	
	private MemberService() {}
	
	private static Scanner sc = new Scanner(System.in);
	
	public static MemberService getInstance() {
		if (instance == null) instance = new MemberService();
		return instance;
	}
	
	
	MemberDAO dao = MemberDAO.getInstance();
	
	// 신규 입력(signUp)
	public void signUp() {
		int result = 0;
		
		System.out.println("\t[신규 가입]");
		System.out.print("회원명 : ");
		String nm = sc.next();
		System.out.print("연락처  : ");
		String tel = sc.next();
		System.out.print("비밀번호 : ");
		String pw = sc.next();
		System.out.print("저장하시겠습니까?  (y/n)");
		String flag = sc.next();
		
		if(flag.equalsIgnoreCase("y")) { // 대소문자 상관없는 equals
			result = dao.signUp(nm, tel, pw);
		}
		
		if(result != 0) {
			System.out.println(nm + "회원님의 자료가 입력되었습니다.");
		} else {
			System.out.println(nm + "회원님의 자료 입력이 취소되었습니다.");
		}
	}
	
	// 정보 변경(update)
	public void update() {
		
		int result = 0;
		String id = "";
		String name = "";
		String telno = "";
		int mile = 0;
		String passwd = "";
		String flag = "";
		String str = "";
		
		System.out.println("\t[정보 변경]");
		
		while(true) {
			System.out.print("회원 번호 : ");
			id = sc.next();
			LoginService loginService = LoginService.getInstance();
			Map<String, Object> map = loginService.isDuplicate(id);
			if (map == null) {
				System.out.println(id + "회원님의 정보가 없습니다.");
			} else {
				break;
			}
		}
		
		System.out.print("이름을 변경하시겠습니까? (y/n)");
		flag = sc.next();
		if (flag.equalsIgnoreCase("y")) {
			System.out.print("이름 : ");
			name = sc.next();
			str += "MNAME = '" + name + "', ";
		}
		
		System.out.print("마일리지를 변경하시겠습니까? (y/n)");
		flag = sc.next();
		if (flag.equalsIgnoreCase("y")) {
			System.out.print("마일리지 : ");
			mile = Integer.parseInt(sc.next());
			str += "MILEAGE = '" + mile + "', ";
		}
		
		System.out.print("연락처를 변경하시겠습니까? (y/n)");
		flag = sc.next();
		if(flag.equalsIgnoreCase("y")) {
			System.out.print("전화번호 : ");
			telno = sc.next();
			str += "TEL_NO = '" + telno + "', ";
		}
		
		System.out.print("비밀번호를 변경하시겠습니까? (y/n)");
		flag = sc.next();
		if (flag.equalsIgnoreCase("y")) {
			System.out.print("비밀번호 : ");
			passwd = sc.next();
			str += "PASSWD = '" + passwd + "', ";
		}
		
		int length = str.length();
		if (length != 0) {
		str = str.substring(0,length-2);
		}
		result = dao.update(str, id);
		
		if (result != 0) {
			System.out.println("회원정보 수정이 완료되었습니다.");
		} else {
			System.out.println("회원정보 수정이 취소되었습니다.");
		}
	}


	// 회원별 정보 검색(searchOne)
	public void searchOne() {
		String id = "";
		Map<String, Object> row = new HashMap<String, Object>();

		System.out.println("\t[회원정보 조회]");
		while (true) {
			System.out.print("조회 할 회원번호 : ");
			id = sc.next();
			LoginService loginService = LoginService.getInstance();
			Map<String, Object> map = loginService.isDuplicate(id);
			if (map == null) {
				System.out.println("잘못된 회원번호입니다. 다시 입력하세요");
			} else {
				break;
			}
		}
			
			row = dao.searchOne(id);
			
			System.out.println("MID\tMNAME\t   TEL_NO\tMILEAGE\t\tPASSWD");
			

			System.out.println(row.get("MID")+"\t"+row.get("MNAME")+"\t"+row.get("TEL_NO")+"\t"+row.get("MILEAGE")+"\t"+row.get("PASSWD"));
		
		
		
	}

}
