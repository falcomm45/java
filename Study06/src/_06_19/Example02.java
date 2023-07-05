package _06_19;

// -day, month, year변수는 private으로 선언합니다.
// -각 변수의 getter, setter를 public으로 구현합니다.
// -MyDate(int day, int month, int year) 생성자를 만듭니다.
// -public boolean isVaild() 메서드를 만들어 날짜가 유효한지 확인합니다.
// -MyDateTest 클래스에서 생성한 MyDate 날짜가 유효한지 확인합니다.

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