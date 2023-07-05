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
	
	LoginDAO dao = LoginDAO.getInstance(); // LoginDao �̱��������� ��ü ����
	
	Map<String, Object> result = null;
	
	public void login() {
		System.out.println("\t[�α���]");
		while(true) {
			System.out.print("���̵� : ");
			String id = sc.next();
			
			System.out.print("�н����� : ");
			String pw = sc.next();
			
			result = dao.login(id,pw);
			
			if (result != null) {
				System.out.println(result.get("MNAME") + "�� ȯ���մϴ�.");
				break;
			}
			
		}
	}
	
	public Map<String, Object> isDuplicate(String id) { // ȸ�� ���� ������ Ȯ���ϱ� ���ؼ�
		return dao.select(id);
	}
}
