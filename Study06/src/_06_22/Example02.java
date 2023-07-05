package _06_22;

import java.lang.Character.Subset;

public class Example02 {
	public static void main(String[] args) {
		Example03 ex = new Example03();
	}
}

class Example03 {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 0; i < (int)(Math.log10(n)+1); i++) {
			answer += (int)(String.valueOf(n).charAt(i)-'0');
		}
       
        return answer;
    }
}
