package _06_20;

import java.util.Scanner;

public class Example02 {
	public static void main(String[] args) {
		MonthSchedule sc = new MonthSchedule(30);
		sc.run();
	}
}

class Day {
	private String work;

	public void set(String work) {
		this.work = work;
	}

	public String get() {
		return work;
	}

	public void show() {
		if (work == null) {
			System.out.println("없음");
		} else {
			System.out.println(work + "입니다.");
		}
	}
}

class MonthSchedule {
	Scanner sc = new Scanner(System.in);

	Day days[];

	MonthSchedule(int day) {
		this.days = new Day[day];
		for (int i = 0; i < days.length; i++) {
			days[i] = new Day();
		}
	}

	public void run() {
		System.out.println("이번달 스케쥴 입력 프로그램.");
		while (true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3)");
			int d = sc.nextInt();
			switch (d) {
			case 1:
				input();
				break;
			case 2:
				view();
				break;
			case 3: {
				finish();
				return;
			}
			}
		}
	}

	public void input() {
		System.out.print("날짜(1~30)? ");
		int d = sc.nextInt();
		d--;
		System.out.print("할일 : ");
		String w = sc.next();
		days[d].set(w);
		return;
	}

	public void view() {
		System.out.print("날짜(1~30)? ");
		int d = sc.nextInt();
		d--;
		System.out.println(d+1 + "일의 할 일은 " + days[d].get() + "입니다.");
		return;
	}

	public void finish() {
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}

}