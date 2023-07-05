package _06_19;

// -day, month, year������ private���� �����մϴ�.
// -�� ������ getter, setter�� public���� �����մϴ�.
// -MyDate(int day, int month, int year) �����ڸ� ����ϴ�.
// -public boolean isVaild() �޼��带 ����� ��¥�� ��ȿ���� Ȯ���մϴ�.
// -MyDateTest Ŭ�������� ������ MyDate ��¥�� ��ȿ���� Ȯ���մϴ�.

public class Example02 {
	public static void main(String[] args) {
		MyDate date = new MyDate(2023,6,19);
		boolean result = date.isVaild();
		System.out.println(result);
		
	}
}

class MyDate {
	
	private int year;
	
	private int month;
	
	private int day;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getDay() {
		return day;
	}
	
	public MyDate(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	public boolean isVaild() {
		int thisYear = 2023;
		int thisMonth = 6;
		int today = 19;
		boolean result = ((thisYear==year) && (thisMonth == month) && (today == day));
		return result;
	}
}