package _06_19;
// 쇼핑몰에 주문이 들어왔습니다. 주문 내용은 다음과 같습니다.

// 주문번호 : 201907210001
// 주문자 아이디 : abc123
// 주문 날짜 : 2019년 7월 21일
// 주문자 이름 : 홍길순
// 주문 상품 번호 : PD-345-12
// 배송 주소 : 서울시 영등포구 여의도동 20번지

// 위 주문 내용을 구현할 수 있는 클래스를 만들고 인스턴스로 생성한 후 위와 같은 형식으로 출력해보세요.


public class Example01 {
	public static void main(String[] args) {
		Order order = new Order("201907210001", "abc123", "2019년 7월 21일", "홍길순", "PD-345-12", "서울시 영등포구 여의도동 20번지");
		order.order();
	}

}

class Order {
	
	private String orderNumber;
	
	private String id;
	
	private String orderDate;
	
	private String name;
	
	private String productNumber;
	
	private String address;
	
	public Order(String orderNumber, String id, String orderDate, String name, String productNumber, String address) {
		this.orderNumber = orderNumber;
		this.id = id;
		this.orderDate = orderDate;
		this.name = name;
		this.productNumber = productNumber;
		this.address = address;
	}
	
	
	
	public void order () {
		System.out.println("주문 번호 : " + orderNumber);
		System.out.println("주문자 아이디 : " + id);
		System.out.println("주문 날짜 : " + orderDate);
		System.out.println("주문자 이름 : " + name);
		System.out.println("주문 상품 번호 : " + productNumber);
		System.out.println("배송 주소 : " + address);
	}
	
}
