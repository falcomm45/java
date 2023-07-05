package _06_22;

import java.util.Arrays;

public class Example {
	
	public static void main(String[] args) {
		Example ex = new Example();
		System.out.println(Arrays.toString(ex.solution(6)));
		
	}
	
	public int[] solution(int n) {
        int[] answer = new int[22];
        answer[0] = n;
        for (int i = 1; i < answer.length; i++) {
			answer[i] = n%2 == 0 ? n/2 : n*3+1;
			n = answer[i];
			if (n == 1) {
				break;
			}
		}       
        return answer;
    }
}
