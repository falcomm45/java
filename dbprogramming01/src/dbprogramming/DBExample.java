package dbprogramming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DBExample {
	Scanner sc = new Scanner(System.in);

	public static Connection conn = null;

	public static void main(String[] args) {
		DBExample db = new DBExample();
		db.init();

	}
	
	// select �� ��ȸ�� ������ �����;� �ϹǷ� pstmt.executeQuery �� ���� ResultSet rs�� �Է½�Ű��
	// rs.next(), rs.getString(�÷���) ���� �ش簪�� ��ȯ
	// insert, update, delete �� ����,����,���� �� ��(row)�� ������ �����ϹǷ�
	// pstmt.executeUpdate �� ������ ���Ϲ���. ���� 0�̸� ����

	public void init() {
		DBExample db = new DBExample();
		System.out.println("=====DB ����=====");
		while (true) {
			System.out.println("1. SELECT | 2. INSERT | 3. UPDATE | 4. DELETE | 5.EXIT");
			System.out.print("�޴� ���� : ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.print("���� ���� : ");
				db.connect();
				db.select();
				break;
			case 2: 
				System.out.print("���� ���� : ");
				db.connect();
				int result = db.insert();
				if (result > 0) {
					System.out.println("�ڷᰡ ���������� �ԷµǾ����ϴ�");
				} else {
					System.out.println("�ڷ��Է¿� �����߽��ϴ�.");
				}
				break;
			case 3: 
				System.out.print("���� ���� : ");
				db.connect();
				int rs = db.update();
				if (rs > 0) {
					System.out.println("���� ���� �Ϸ�");
				} else {
					System.out.println("���� ���� ����");
				}
				break;
			case 4: 
				System.out.print("���� ���� : ");
				db.connect();
				int del = db.delete();
				if (del>0) {
					System.out.println("���� ���� �Ϸ�");
				} else {
					System.out.println("���� ���� ����");
				}
				break;
			case 5:
				System.out.println("���α׷��� �����մϴ�.");
				sc.close();
				return;
			default:
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
				continue;
			}
		}

	}
	

	public void connect() {

		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		String user = "pc27";

		String password = "java";

		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println("DB ���� ����");
			e.printStackTrace();
		}
		System.out.println("DB ���� ����");
	}

	public void select() {

		Statement stmt = null; // ����

		PreparedStatement pstmt = null; // ����

		ResultSet rs = null;
		
		try {
			System.out.print("��ȸ �� ȸ����ȣ �Է� : ");
			String sql = "select * from tbl_member where mid = ? ";
			pstmt = conn.prepareStatement(sql); // ���� ��ü ����
			pstmt.setString(1, sc.next());		 // ? �� tid ����ֱ� (?�� �ε�����,���� ����) => sql�� �ϼ���Ű��
			
			rs = pstmt.executeQuery();      // �����Ű�� ��ɾ� executeQuery -> select �� ����
											// executeUpdate -> DML ���
											// ResultSet rs�� pstmt�� executeQuery �� ������ �Է�
			// mem_id, mem_name, mem_hp, mem_add1, mem_mileage
			int count = 0;
			while (rs.next()) { // rs�� �� ������ getString(�÷���)���� �����´�
				String mid = rs.getString("mid"); // �÷��� or �ø�index �Է� ����
				String pw = rs.getString("passwd");
				String name = rs.getString("mname");
				String mhp = rs.getString("tel_no");
				int mileage = rs.getInt("mileage");
				count++;
				System.out.println(count + ". " + mid + "\t" + pw + "\t" + name + "\t" + mhp + "\t" + mileage);
				System.out.println("-----------------------------------------------------");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try { rs.close(); } catch(Exception e) {}
			if(pstmt != null) try { pstmt.close(); } catch(Exception e) {}
			if(conn != null) try { conn.close(); } catch(Exception e) {}
		}
	}
	
	public int insert() {

		PreparedStatement pstmt = null;
		int result = 0;
		System.out.print("ȸ����ȣ : ");
		String tid = sc.next();

		System.out.print("�̸� : ");
		String tnm = sc.next();

		System.out.print("����ó : ");
		String thp = sc.next();
		try {
		String sql = "insert into tbl_member (mid, mname, tel_no, mileage) ";
		sql += "values(?, ?, ?, 0)";
		
		pstmt = conn.prepareStatement(sql);

		pstmt.setString(1, tid);
		pstmt.setString(2, tnm);
		pstmt.setString(3, thp);

		result = pstmt.executeUpdate(); // insert update delete �� ���� ���� ��ȯ��
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;

	}
	
	public int update() {
		
		PreparedStatement pstmt = null;
		int result = 0;
		System.out.print("������ ȸ�� ��ȣ : ");
		String tid = sc.next();
		
		System.out.print("��ȭ��ȣ : ");
		String thp = sc.next();
		
		System.out.print("���ϸ��� : ");
		int tmile = sc.nextInt();
		
		try {
		StringBuffer sql = new StringBuffer("update tbl_member \n");
		sql.append("set tel_no = ? \n");
		sql.append("\t , mileage = ?\n");
		sql.append("\twhere mid = ? ");
		String sqlStr = sql.toString();
		
		
		
		pstmt = conn.prepareStatement(sqlStr); // ���� PreparedStatement �� sql ������ �Է����ش�
		pstmt.setString(1, thp); // ? �ε��� ��ġ�� �ش� ���� �Է�
		pstmt.setInt(2, tmile);
		pstmt.setString(3, tid);
		
		result = pstmt.executeUpdate(); // executeUpdate �� ������ ����
		
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int delete() {
		PreparedStatement pstmt = null;
		int result = 0;
		System.out.print("���� �� ȸ�� ��ȣ : ");
		try {
		String sql = "delete from tbl_member where mid = ? ";
		pstmt = conn.prepareStatement(sql);
		
		pstmt.setInt(1, sc.nextInt());
		
		result = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return result;
		
	}
}
