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
	// �̱��� ��ü ����
	private static JDBCUtil instance = null; // ��ü ����

	private JDBCUtil() {}

	public static JDBCUtil getInstance() {
		if (instance == null)
			instance = new JDBCUtil();
		return instance;
	}
	// ����
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
		List<Map<String, Object>> list = null; // ��ȯ�� MapŸ���� list�� �����.

		try {
			conn = DriverManager.getConnection(url, user, password); // db ����
			pstmt = conn.prepareStatement(sql); // parameter�� ���޹��� sql������ pstmt�� �Է�
			rs = pstmt.executeQuery(); // ResultSet�� ���� �������� �Է�
			// �÷��� �? �÷��� ���̺��� ��?
			ResultSetMetaData rsmd = rs.getMetaData(); 
			// ResultSetMetaData Ÿ������ ����� -> �÷��� ����,  �̸��� �˱� ���ؼ�
			int columnCount = rsmd.getColumnCount(); // �÷��� ���� ���ϱ�
			
			while(rs.next()) {
				if (list == null) list = new ArrayList<Map<String, Object>>();
				Map<String, Object> row = new HashMap<String, Object>();
				
				for (int i = 0; i < columnCount; i++) {
					String key = rsmd.getColumnLabel(i+1); // �÷����� Ű��
					Object value = rs.getObject(i+1); // �÷��� �����͸� �����
					row.put(key, value);
				} // �� ������� �����͸� row �� ����
				list.add(row); // �ѻ������ �����͸� ������   row�� ����Ʈ�� �Է¹���
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
