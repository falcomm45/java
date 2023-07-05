package service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import dao.MemberDAO;

public class MemberService {
	// �̱���
	
	// ȸ�� ��� ��ȸ(searchAll)
	// ȸ�� ����(delete)
	private static MemberService instance = null;
	
	private MemberService() {}
	
	private static Scanner sc = new Scanner(System.in);
	
	public static MemberService getInstance() {
		if (instance == null) instance = new MemberService();
		return instance;
	}
	
	
	MemberDAO dao = MemberDAO.getInstance();
	
	// �ű� �Է�(signUp)
	public void signUp() {
		int result = 0;
		
		System.out.println("\t[�ű� ����]");
		System.out.print("ȸ���� : ");
		String nm = sc.next();
		System.out.print("����ó  : ");
		String tel = sc.next();
		System.out.print("��й�ȣ : ");
		String pw = sc.next();
		System.out.print("�����Ͻðڽ��ϱ�?  (y/n)");
		String flag = sc.next();
		
		if(flag.equalsIgnoreCase("y")) { // ��ҹ��� ������� equals
			result = dao.signUp(nm, tel, pw);
		}
		
		if(result != 0) {
			System.out.println(nm + "ȸ������ �ڷᰡ �ԷµǾ����ϴ�.");
		} else {
			System.out.println(nm + "ȸ������ �ڷ� �Է��� ��ҵǾ����ϴ�.");
		}
	}
	
	// ���� ����(update)
	public void update() {
		
		int result = 0;
		String id = "";
		String name = "";
		String telno = "";
		int mile = 0;
		String passwd = "";
		String flag = "";
		String str = "";
		
		System.out.println("\t[���� ����]");
		
		while(true) {
			System.out.print("ȸ�� ��ȣ : ");
			id = sc.next();
			LoginService loginService = LoginService.getInstance();
			Map<String, Object> map = loginService.isDuplicate(id);
			if (map == null) {
				System.out.println(id + "ȸ������ ������ �����ϴ�.");
			} else {
				break;
			}
		}
		
		System.out.print("�̸��� �����Ͻðڽ��ϱ�? (y/n)");
		flag = sc.next();
		if (flag.equalsIgnoreCase("y")) {
			System.out.print("�̸� : ");
			name = sc.next();
			str += "MNAME = '" + name + "', ";
		}
		
		System.out.print("���ϸ����� �����Ͻðڽ��ϱ�? (y/n)");
		flag = sc.next();
		if (flag.equalsIgnoreCase("y")) {
			System.out.print("���ϸ��� : ");
			mile = Integer.parseInt(sc.next());
			str += "MILEAGE = '" + mile + "', ";
		}
		
		System.out.print("����ó�� �����Ͻðڽ��ϱ�? (y/n)");
		flag = sc.next();
		if(flag.equalsIgnoreCase("y")) {
			System.out.print("��ȭ��ȣ : ");
			telno = sc.next();
			str += "TEL_NO = '" + telno + "', ";
		}
		
		System.out.print("��й�ȣ�� �����Ͻðڽ��ϱ�? (y/n)");
		flag = sc.next();
		if (flag.equalsIgnoreCase("y")) {
			System.out.print("��й�ȣ : ");
			passwd = sc.next();
			str += "PASSWD = '" + passwd + "', ";
		}
		
		int length = str.length();
		if (length != 0) {
		str = str.substring(0,length-2);
		}
		result = dao.update(str, id);
		
		if (result != 0) {
			System.out.println("ȸ������ ������ �Ϸ�Ǿ����ϴ�.");
		} else {
			System.out.println("ȸ������ ������ ��ҵǾ����ϴ�.");
		}
	}


	// ȸ���� ���� �˻�(searchOne)
	public void searchOne() {
		String id = "";
		Map<String, Object> row = new HashMap<String, Object>();

		System.out.println("\t[ȸ������ ��ȸ]");
		while (true) {
			System.out.print("��ȸ �� ȸ����ȣ : ");
			id = sc.next();
			LoginService loginService = LoginService.getInstance();
			Map<String, Object> map = loginService.isDuplicate(id);
			if (map == null) {
				System.out.println("�߸��� ȸ����ȣ�Դϴ�. �ٽ� �Է��ϼ���");
			} else {
				break;
			}
		}
			
			row = dao.searchOne(id);
			
			System.out.println("MID\tMNAME\t   TEL_NO\tMILEAGE\t\tPASSWD");
			

			System.out.println(row.get("MID")+"\t"+row.get("MNAME")+"\t"+row.get("TEL_NO")+"\t"+row.get("MILEAGE")+"\t"+row.get("PASSWD"));
		
		
		
	}

}
