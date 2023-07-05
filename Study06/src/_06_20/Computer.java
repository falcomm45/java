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
				System.out.println("운영체제 : " + myRes + ", 메인메모리 : " + memory);
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
	
	윈도우7(16),
	애플OS(32),
	안드로이드(16);
	
	private final int memory;
	
	Os(int memory) {
		this.memory = memory;
	}
	
	public int getMemory() {
		return memory;
	}
}
