package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import util.JDBCUtil;

public class MemberDAO {
	
	private static MemberDAO instance = null;
	
	private MemberDAO() {}
	
	public static MemberDAO getInstance() {
		if (instance == null) instance = new MemberDAO();
		return instance;
	}
	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public int signUp(String nm, String tel, String pw) {
		String sql = "insert into tbl_member (MID, MNAME, TEL_NO, PASSWD, MILEAGE)";
		sql += "values (fn_create_new_mid('2023'), ?, ?, ?, 0)";
		
		List<Object> param = new ArrayList<>();
		param.add(nm);
		param.add(tel);
		param.add(pw);
		
		return jdbc.update(sql, param);
	}
	
	public int update(String str, String id) {
		if (str.length() != 0) {
		String sql = "UPDATE TBL_MEMBER SET ";
		sql += str;
		sql += " WHERE MID = '" + id + "'";
		return jdbc.update(sql);
		} else {
			return 0;
		}
	}
	
	public Map<String, Object> searchOne(String id) {
		String sql = "SELECT * FROM TBL_MEMBER WHERE MID = '"+id+"'";
		return jdbc.selectOne(sql);
		
	}
}
