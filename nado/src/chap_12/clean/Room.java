package chap_12.clean;

public class Room {
	
	public int number = 1;
	
	synchronized public void clean(String name) {
		// 流盔 1: 3锅规 没家 肯丰
		System.out.println(name + " : " + number + "锅 规 没家 吝");
		number++;
	}
}
