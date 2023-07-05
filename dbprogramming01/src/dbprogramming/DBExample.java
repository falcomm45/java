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
	
	// select 는 조회된 값들을 가져와야 하므로 pstmt.executeQuery 로 값을 ResultSet rs에 입력시키고
	// rs.next(), rs.getString(컬럼명) 으로 해당값을 반환
	// insert, update, delete 는 삽입,변경,삭제 된 행(row)의 갯수만 리턴하므로
	// pstmt.executeUpdate 로 정수를 리턴받음. 값이 0이면 실패

	public void init() {
		DBExample db = new DBExample();
		System.out.println("=====DB 관리=====");
		while (true) {
			System.out.println("1. SELECT | 2. INSERT | 3. UPDATE | 4. DELETE | 5.EXIT");
			System.out.print("메뉴 선택 : ");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.print("연결 여부 : ");
				db.connect();
				db.select();
				break;
			case 2: 
				System.out.print("연결 여부 : ");
				db.connect();
				int result = db.insert();
				if (result > 0) {
					System.out.println("자료가 정상적으로 입력되었습니다");
				} else {
					System.out.println("자료입력에 실패했습니다.");
				}
				break;
			case 3: 
				System.out.print("연결 여부 : ");
				db.connect();
				int rs = db.update();
				if (rs > 0) {
					System.out.println("정보 수정 완료");
				} else {
					System.out.println("정보 수정 실패");
				}
				break;
			case 4: 
				System.out.print("연결 여부 : ");
				db.connect();
				int del = db.delete();
				if (del>0) {
					System.out.println("정보 삭제 완료");
				} else {
					System.out.println("정보 삭제 실패");
				}
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				return;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
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
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}
		System.out.println("DB 연결 성공");
	}

	public void select() {

		Statement stmt = null; // 정적

		PreparedStatement pstmt = null; // 동적

		ResultSet rs = null;
		
		try {
			System.out.print("조회 할 회원번호 입력 : ");
			String sql = "select * from tbl_member where mid = ? ";
			pstmt = conn.prepareStatement(sql); // 명렁어 객체 생성
			pstmt.setString(1, sc.next());		 // ? 에 tid 집어넣기 (?의 인덱스값,넣을 변수) => sql을 완성시키기
			
			rs = pstmt.executeQuery();      // 실행시키는 명령어 executeQuery -> select 문 실행
											// executeUpdate -> DML 명령
											// ResultSet rs에 pstmt로 executeQuery 한 값들을 입력
			// mem_id, mem_name, mem_hp, mem_add1, mem_mileage
			int count = 0;
			while (rs.next()) { // rs에 들어간 값들을 getString(컬럼명)으로 가져온다
				String mid = rs.getString("mid"); // 컬럼명 or 컬림index 입력 가능
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
		System.out.print("회원번호 : ");
		String tid = sc.next();

		System.out.print("이름 : ");
		String tnm = sc.next();

		System.out.print("연락처 : ");
		String thp = sc.next();
		try {
		String sql = "insert into tbl_member (mid, mname, tel_no, mileage) ";
		sql += "values(?, ?, ?, 0)";
		
		pstmt = conn.prepareStatement(sql);

		pstmt.setString(1, tid);
		pstmt.setString(2, tnm);
		pstmt.setString(3, thp);

		result = pstmt.executeUpdate(); // insert update delete 된 행의 수가 반환됨
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
		System.out.print("수정할 회원 번호 : ");
		String tid = sc.next();
		
		System.out.print("전화번호 : ");
		String thp = sc.next();
		
		System.out.print("마일리지 : ");
		int tmile = sc.nextInt();
		
		try {
		StringBuffer sql = new StringBuffer("update tbl_member \n");
		sql.append("set tel_no = ? \n");
		sql.append("\t , mileage = ?\n");
		sql.append("\twhere mid = ? ");
		String sqlStr = sql.toString();
		
		
		
		pstmt = conn.prepareStatement(sqlStr); // 먼저 PreparedStatement 에 sql 문장을 입력해준다
		pstmt.setString(1, thp); // ? 인덱스 위치에 해당 값을 입력
		pstmt.setInt(2, tmile);
		pstmt.setString(3, tid);
		
		result = pstmt.executeUpdate(); // executeUpdate 로 정수값 리턴
		
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
		System.out.print("삭제 할 회원 번호 : ");
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
