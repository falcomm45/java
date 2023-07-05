package _06_20;

public class Computer {
	int index;
	int memory;
	
	public Computer (int index, int memory) {
		this.index = index;
		this.memory = memory;
	}
	
	public void print() {
		for (Os myRes : Os.values()) {
			if (myRes.ordinal() == index) {
				System.out.println("�ü�� : " + myRes + ", ���θ޸� : " + memory);
			}
		}	
	}
	
	
	public static void main(String[] args) {
		Computer pc = new Computer(0,16);
		Computer apple = new Computer(1,32);
		Computer galaxy = new Computer(2,16);
		
		pc.print();
		apple.print();
		galaxy.print();
		
		
	}
	
}



enum Os {
	
	������7(16),
	����OS(32),
	�ȵ���̵�(16);
	
	private final int memory;
	
	Os(int memory) {
		this.memory = memory;
	}
	
	public int getMemory() {
		return memory;
	}
}
