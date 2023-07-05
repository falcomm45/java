package _06_21;

public class Example02 {

}
class Pen {
	private int amount;
	
	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}




class SharpPencil extends Pen { // »þÇÁÆæ½½
	private int width; // ÆæÀÇ ±½±â
}

class Ballpen extends Pen{ // º¼Ææ
	private String color; // º¼ÆæÀÇ »ö

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}

class FountainPen extends Ballpen{ // ¸¸³âÇÊ

	public void refill(int n) {
		setAmount(n);
	}
}
