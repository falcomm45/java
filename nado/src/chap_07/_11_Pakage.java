package chap_07;

import java.util.Random;

public class _11_Pakage {
	public static void main(String[] args) {
		// ��Ű�� (���� Ŭ����)
		Random random = new Random();
		System.out.println("���� ���� : " + random.nextInt()); // int �� ���� ������ ������ �� ��ȯ 
		System.out.println("���� ����  (����) : " + random.nextInt(10)); // 0 �̻� 10 �̸��� ������ �� ��ȯ
		System.out.println("���� �Ǽ� : " + random.nextDouble()); // 0.0 �̻� 1.0 �̸��� �Ǽ���
		// System.out.println("���� �Ǽ� (����) : " + random.nextDouble(10.0));
		
		// ���� 5.0 �̻� 10.0 �̸��� �Ǽ��� ����Ϸ���?
		double min = 5.0;
		double max = 10.0;
		System.out.println("���� �Ǽ� (����) : " + (min + (max - min)*random.nextDouble()));
		
		System.out.println("���� boolean : " + random.nextBoolean());
		
		// �ζ� ��ȣ �������� ��������? 1~45
		System.out.println("�ζ� ��ȣ : " + (random.nextInt(45)+1));
		// nextInt(45) = 0 �̻� 45 �̸��� ��
		// nextInt(45) + 1 = 1 �̻� 45 ������ ��
		
		// Math, Scanner, StringBuilder, StringBuffer, StringTokenizer
		// BigInteger, BigDecimal
		// LocalDate, LocalTime,  LocalDateTiem, DateTimeFormatter, ...
	}
}
