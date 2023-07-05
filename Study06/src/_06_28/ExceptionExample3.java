package _06_28;

public class ExceptionExample3 {
	public static void main(String[] args) {
		Login li = new Login();
		
		try {
			li.login("Asdf", "455543");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			li.login("falcomm", "3245545");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
}

class NotExistIDException extends Exception {
	
	NotExistIDException() {}
	
	NotExistIDException(String message){
		super(message);
	}
	
}

class WrongPasswordException extends Exception {
	
	WrongPasswordException() {}
	
	WrongPasswordException(String message) {
		super(message);
	}
}


class Login {
	
	private String id = "falcomm";
	
	private String password = "12345";
	
	
	public void login(String id, String password) throws Exception {
		if (!this.id.equals(id)) {
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}
		
		if (!this.password.equals(password)) {
			throw new WrongPasswordException("비밀번호가 다릅니다.");
		}
		
	}
}
