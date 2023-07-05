package _06_26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class LottoProgram {
	
	public List<Integer> lotto() {
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		while (lotto.size() != 6) {
			lotto.add((int)(Math.random()*45)+1);
		}
		
		List<Integer> lottoList = new ArrayList<Integer>(lotto);
		Collections.sort(lottoList);
		return lottoList;
	}
	
	public static void main(String[] args) {
		LottoProgram lp = new LottoProgram();
		System.out.println(lp.lotto().toString());
	}
}
