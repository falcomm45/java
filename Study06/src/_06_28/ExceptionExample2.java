package _06_28;

public class ExceptionExample2 {
	public static void main(String[] args) {
		throw new UnsupportedFuctionException("지원하지 않는 기능입니다.");
	}
}


class UnsupportedFuctionException extends RuntimeException{
	
	private final int ERR_CODE = 100;
	
	UnsupportedFuctionException(String message){
		super(message);
	}
	
	public int getErrorCode() {
		return ERR_CODE;
	}
	
	@Override
	public String getMessage() {
		return "[" + ERR_CODE + "]" + super.getMessage();
	}
	
}


// 2347