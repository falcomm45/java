package _06_26;

import java.util.ArrayList;
import java.util.Collections;

public class LottoArray {
	
	
	public String getLotto() {
		ArrayList<Integer> lotto = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			int temp = (int)(Math.random()*45)+1;
			if (lotto.contains(temp)) {
				i--;
			} else {
				lotto.add(temp);
			}
		}
		
		Collections.sort(lotto);
		return lotto.toString();
	}
	
	public static void main(String[] args) {
		LottoArray la = new LottoArray();
		System.out.println(la.getLotto());
	}
}
