
package chap_07;

public class _18_Enum {
	public static void main(String[] args) {
		// ������ (Enum)
		// �޷� : JAN, FAB, MAR, ...
		// �� ������ : S, M, L, XL, ...
		// OS ���� : WIN10, WIN11, MACOS, LINUX, ...
		// �ػ� : HD, FHD, QHD, UHD, ...
		
		Resolution resolution = Resolution.HD;
		System.out.println(resolution);
		
		resolution = Resolution.FHD;
		System.out.println(resolution);
		
		System.out.print("������ ��ȭ ǰ�� : ");
		switch (resolution) {
		case HD : 
			System.out.println("�Ϲ�ȭ��");
			break;
		case FHD : 
			System.out.println("��ȭ��");
			break;
		case UHD : 
			System.out.println("�ʰ�ȭ��");
			break;
		}
		
		resolution = Resolution.valueOf("UHD");
		System.out.println(resolution);
		
		System.out.println("--------------------------");
		
		for(Resolution myRes : Resolution.values()) {
			System.out.println(myRes.name() + " : " + myRes.ordinal());
		}
		
		System.out.println("--------------------------");
		
		for (Resolution myRes : Resolution.values()) {
			System.out.println(myRes.name() + " : " + myRes.getWidth());
		}
	}
}

enum Resolution {
	
	HD(1280), FHD(1920), UHD(3840);
	
	private final int width;
	
	Resolution (int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}
}
