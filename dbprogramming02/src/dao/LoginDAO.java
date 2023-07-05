package dao; // ó���Ǿ��� �������� �ۼ��ϰ� �ϼ��Ǳ� ���� �����͸� JDBCUtil�� �޼ҵ带 ȣ���ؼ� �������� �ϼ��Ѵ�.

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import util.JDBCUtil;

public class LoginDAO {
	
	private static LoginDAO instance = null;
	
	private LoginDAO() {}
	
	public static LoginDAO getInstance() {
		if (instance == null) instance = new LoginDAO();
		return instance;
	}
	
	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public Map<String, Object> login(String id, String pw) {
		String sql = "select * from tbl_member ";
		sql += "where mid = ? and passwd = ? ";
		
		List<Object> param = new ArrayList<>();
		param.add(id);
		param.add(pw);
		return jdbc.selectOne(sql, param);
		
	}
	
	public Map<String, Object> select(String id) { // ȸ�� ���� ������ Ȯ���ϱ� ���� ������
		String sql = "SELECT * FROM TBL_MEMBER ";
		sql += "WHERE MID = ?";
		List<Object> param = new ArrayList<>();
		param.add(id);
		
		return jdbc.selectOne(sql, param);
	}
}
