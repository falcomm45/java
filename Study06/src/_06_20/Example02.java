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
			System.out.println("����");
		} else {
			System.out.println(work + "�Դϴ�.");
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
		System.out.println("�̹��� ������ �Է� ���α׷�.");
		while (true) {
			System.out.print("����(�Է�:1, ����:2, ������:3)");
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
		System.out.print("��¥(1~30)? ");
		int d = sc.nextInt();
		d--;
		System.out.print("���� : ");
		String w = sc.next();
		days[d].set(w);
		return;
	}

	public void view() {
		System.out.print("��¥(1~30)? ");
		int d = sc.nextInt();
		d--;
		System.out.println(d+1 + "���� �� ���� " + days[d].get() + "�Դϴ�.");
		return;
	}

	public void finish() {
		System.out.println("���α׷��� �����մϴ�.");
		sc.close();
	}

}