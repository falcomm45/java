package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JDBCUtil {
	// 싱글톤 객체 생성
	private static JDBCUtil instance = null; // 객체 변수

	private JDBCUtil() {}

	public static JDBCUtil getInstance() {
		if (instance == null)
			instance = new JDBCUtil();
		return instance;
	}
	// 까지
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "pc27";
	private String password = "java";

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private Statement stmt = null;
	private ResultSet rs = null;
	

	public List<Map<String, Object>> selectAll(String sql) {
		// "select * from tbl_member"
		// "select * from tbl_member where mid = '23010'"
		List<Map<String, Object>> list = null; // 반환할 Map타입의 list를 만든다.

		try {
			conn = DriverManager.getConnection(url, user, password); // db 연결
			pstmt = conn.prepareStatement(sql); // parameter로 전달받은 sql문장을 pstmt에 입력
			rs = pstmt.executeQuery(); // ResultSet에 쿼리 실행결과를 입력
			// 컬럼이 몇개? 컬럼의 레이블값이 뭐?
			ResultSetMetaData rsmd = rs.getMetaData(); 
			// ResultSetMetaData 타입으로 만들기 -> 컬럼의 갯수,  이름을 알기 위해서
			int columnCount = rsmd.getColumnCount(); // 컬럼의 갯수 구하기
			
			while(rs.next()) {
				if (list == null) list = new ArrayList<Map<String, Object>>();
				Map<String, Object> row = new HashMap<String, Object>();
				
				for (int i = 0; i < columnCount; i++) {
					String key = rsmd.getColumnLabel(i+1); // 컬럼명을 키로
					Object value = rs.getObject(i+1); // 컬럼의 데이터를 밸류로
					row.put(key, value);
				} // 한 사람분의 데이터를 row 에 저장
				list.add(row); // 한사람씩의 데이터를 저장한   row를 리스트에 입력받음
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) try {rs.close();} catch(Exception e) {}
			if (pstmt != null) try {pstmt.close();} catch(Exception e) {}
			if (conn != null) try {conn.close();} catch(Exception e) {}
		}
		return list;
	}
	
	public List<Map<String, Object>> selectAll(String sql, List<Object> param) {
		
		List<Map<String,Object>> list = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			
			for (int i = 0; i < param.size(); i++) {
				pstmt.setObject(i+1, param.get(i));
			}
			
			rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			
			while(rs.next()) {
				if (list == null) list = new ArrayList<Map<String, Object>>();
				Map<String, Object> row = new HashMap<>();
				
				for (int i = 0; i < columnCount; i++) {
					String key = rsmd.getColumnLabel(i+1);
					Object value = rs.getObject(i+1);
					row.put(key, value);
				}
				list.add(row);
			}		
		} catch(SQLException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) try {rs.close();} catch(Exception e) {}
			if (pstmt != null) try {pstmt.close();} catch(Exception e) {}
			if (conn != null) try {conn.close();} catch(Exception e) {}
		}
		return list;
	}

	public Map<String, Object> selectOne(String sql) {
		
		Map<String, Object> row = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			
			while(rs.next()) {
				if(row == null) row = new HashMap<>();
				for (int i = 0; i < columnCount; i++) {
					String key = rsmd.getColumnLabel(i+1);
					Object value = rs.getObject(i+1);
					row.put(key, value);
				}
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) try {rs.close();} catch(Exception e) {}
			if (pstmt != null) try {pstmt.close();} catch(Exception e) {}
			if (conn != null) try {conn.close();} catch(Exception e) {}
		}
		return row;
	}
	
	public Map<String, Object> selectOne(String sql, List<Object> param) {
		Map<String, Object> row = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
			pstmt = conn.prepareStatement(sql);
			
			for (int i = 0; i < param.size(); i++) {
				pstmt.setObject(i+1, param.get(i));
			}
			
			rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			
			while(rs.next()) {
				row = new HashMap<>();
				for (int i = 0; i < columnCount; i++) {
					String key = rsmd.getColumnLabel(i+1);
					Object value = rs.getObject(i+1);
					row.put(key, value);
				}
			}
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) try {rs.close();} catch(Exception e) {}
			if (pstmt != null) try {pstmt.close();} catch(Exception e) {}
			if (conn != null) try {conn.close();} catch(Exception e) {}
		}
		return row;
	}

	public int update(String sql) {
		// sql : "delete from tbl_member"
		// sql : "delete from tbl_member where mid = '23011'"
		// sql : "update tbl_member set mileage = mileage*1.1"
		
		int result = 0;
		try {
		conn = DriverManager.getConnection(url, user, password);
		pstmt = conn.prepareStatement(sql);
		result = pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) try {rs.close();} catch(Exception e) {}
			if (pstmt != null) try {pstmt.close();} catch(Exception e) {}
			if (conn != null) try {conn.close();} catch(Exception e) {}
		}
		return result;	
	}
	
	public int update(String sql, List<Object> param) {
		int result = 0;
		try {
		conn = DriverManager.getConnection(url, user, password);
		pstmt = conn.prepareStatement(sql);
		for (int i = 0; i < param.size(); i++) {
			pstmt.setObject(i+1, param.get(i));
		}
		
		result = pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) try {rs.close();} catch(Exception e) {}
			if (pstmt != null) try {pstmt.close();} catch(Exception e) {}
			if (conn != null) try {conn.close();} catch(Exception e) {}
		}
		return result;	
	}
}
