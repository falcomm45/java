package service;

import java.util.Map;
import java.util.Scanner;

import dao.LoginDAO;

public class LoginService {
	Scanner sc = new Scanner(System.in);

	private static LoginService instance = null;
	
	private LoginService() {}
	
	public static LoginService getInstance() {
		if (instance == null) instance = new LoginService();
		return instance;
	}
	
	LoginDAO dao = LoginDAO.getInstance(); // LoginDao 싱글톤패턴의 객체 생성
	
	Map<String, Object> result = null;
	
	public void login() {
		System.out.println("\t[로그인]");
		while(true) {
			System.out.print("아이디 : ");
			String id = sc.next();
			
			System.out.print("패스워드 : ");
			String pw = sc.next();
			
			result = dao.login(id,pw);
			
			if (result != null) {
				System.out.println(result.get("MNAME") + "님 환영합니다.");
				break;
			}
			
		}
	}
	
	public Map<String, Object> isDuplicate(String id) { // 회원 정보 유무를 확인하기 위해서
		return dao.select(id);
	}
}
