package chap_11;

// 발생 가능 문제의 2가지 조건 : 상품 구매 시간, 상품 매진
// 각 문제에 대한 사용자 정의 예외 클래스 작성
// 에러 코드에 따른 의도적 예외 발생 및 예외 처리
// 0 에러없음 (상품 구매를 완료하였습니다)		-
// 1 판매 시간 아님 상품 구매 가능 시간이 아닙니다.	상품 구매는 20시부터 가능합니다
// 2 매진 해당 상품은 매진되었습니다.			다음 기회에 이용해주세요
// 		객채생성메세지					예외처리메세지
public class _Quiz_11 {

	public static void main(String[] args) {
		sale();
	}

	public static void sale() {
		int errorCode = 2;
		try {
			if (errorCode == 0) {
				System.out.println("상품 구매를 완료하였습니다.");
			} else if(errorCode == 1) {
				throw new TimeYetException("상품 구매 가능 시간이 아닙니다.");
			} else {
				throw new SoldOutException("해당 상품은 매진되었습니다.");
			}
		} catch (TimeYetException e) {
			System.out.println(e.getMessage());
			System.out.println("상품 구매는 20시부터 가능합니다.");
		} catch (SoldOutException e) {
			System.out.println(e.getMessage());
			System.out.println("다음 기회에 이용해주세요.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class TimeYetException extends Exception {
	public TimeYetException(String message) {
		super(message);
	}
}

class SoldOutException extends Exception {
	public SoldOutException(String message) {
		super(message);
	}
}
