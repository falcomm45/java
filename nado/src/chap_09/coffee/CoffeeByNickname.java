package chap_09.coffee;

public class CoffeeByNickname {
	public String nickname;
	
	public CoffeeByNickname(String nickname) {
		this.nickname = nickname;
	}
	
	public void ready() {
		System.out.println("Ŀ�� �غ� �Ϸ� : " + nickname);
	}
}
