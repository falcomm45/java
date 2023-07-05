package chap_06;

public class _03_Return {
	// 호텔 전화번호
	public static String getPhoneNumber() {
		String phoneNumber = "02-123-4567";
		return phoneNumber;
	}
	// 호텔 주소
	public static String getAddress() {
		String address = "서울 강서구";
		return address;
	}
	// 호텔 액티비티
	public static String getActivities() {
		String activities = "볼링장, 탁구장, 노래방";
		return activities;
	}
	
	
	public static void main(String[] args) {
		// 반환값, Return
		String phoneNumber = getPhoneNumber();
		System.out.println("호텔 전화번호 : " + phoneNumber);
		String address = getAddress();
		System.out.println("호텔 주소 : " + address);
		String activities = getActivities();
		System.out.println("호텔 액티비티 : " + activities);
		
	}
}
