package chap_06;

public class _03_Return {
	// ȣ�� ��ȭ��ȣ
	public static String getPhoneNumber() {
		String phoneNumber = "02-123-4567";
		return phoneNumber;
	}
	// ȣ�� �ּ�
	public static String getAddress() {
		String address = "���� ������";
		return address;
	}
	// ȣ�� ��Ƽ��Ƽ
	public static String getActivities() {
		String activities = "������, Ź����, �뷡��";
		return activities;
	}
	
	
	public static void main(String[] args) {
		// ��ȯ��, Return
		String phoneNumber = getPhoneNumber();
		System.out.println("ȣ�� ��ȭ��ȣ : " + phoneNumber);
		String address = getAddress();
		System.out.println("ȣ�� �ּ� : " + address);
		String activities = getActivities();
		System.out.println("ȣ�� ��Ƽ��Ƽ : " + activities);
		
	}
}
