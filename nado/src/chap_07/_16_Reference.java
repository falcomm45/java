package chap_07;

import chap_07.camera.Camera;

public class _16_Reference {
	public static void main(String[] args) {
		// ����
		// �⺻ �ڷ��� (Primitive Data Types) : int, float, double, long, boolean ....
		int[] i = new int[3];
		System.out.println(i[0]); // 0
		
		double[] d = new double[3];
		System.out.println(d[0]); // 0.0
		
		// ���� �ڷ��� (Non-Primitive Data Types) : String, Object(Camera, FactoryCam, SpeedCam) ...
		String[] s = new String[3];
		System.out.println(s[0]); // null
		
		Camera[] c = new Camera[3];
		System.out.println(c[0] == null); // true
		
		/////////////////////////////////////////////
		System.out.println("---------------------------------");
		int a = 10;
		int b = 20;
		b = a;
		System.out.println(a);
		System.out.println(b);
		
		b = 30;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("---------------------------------");
		
		Camera c1 = new Camera();
		Camera c2 = new Camera();
		c1.name = "ī�޶�1";
		c2.name = "ī�޶�2";
		System.out.println(c1.name);
		System.out.println(c2.name);
		c2 = c1;
		System.out.println(c1.name);
		System.out.println(c2.name);
		c2.name = "���峭 ī�޶�";
		System.out.println(c1.name);
		System.out.println(c2.name);
		System.out.println("---------------------------------");
		changeName(c2);
		System.out.println(c1.name);
		System.out.println(c2.name);
		

	}
	
	public static void changeName(Camera camera) {
		camera.name = "�߸��� ī�޶�";
	}
}
