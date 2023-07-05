package dao; // 처리되어질 쿼리문을 작성하고 완성되기 위한 데이터를 JDBCUtil의 메소드를 호출해서 쿼리문을 완성한다.

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
	
	public Map<String, Object> select(String id) { // 회원 정보 유무를 확인하기 위한 쿼리문
		String sql = "SELECT * FROM TBL_MEMBER ";
		sql += "WHERE MID = ?";
		List<Object> param = new ArrayList<>();
		param.add(id);
		
		return jdbc.selectOne(sql, param);
	}
}
