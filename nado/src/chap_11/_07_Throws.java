
package chap_11;

import java.io.FileWriter;
import java.io.IOException;

public class _07_Throws {
	// 예외 미루기
	// 메소드를 작성할때 예외를 처리하지 않고 메소드가 실행될때 예외를 처리하도록 예외를 미룬다?
	public static void main(String[] args) {
		try {
			writeFile();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("메인 메소드에서 해결");
		}
	}
	
	public static void writeFile() throws IOException {
//		try {
//			FileWriter writer = new FileWriter("text.txt");
//			throw new IOException("파일 쓰기에 실패");
//		} catch (IOException e) {
//			e.printStackTrace();
//			System.out.println("writeFile 메소드에서 자체 해결");
//		}
		
		FileWriter writer = new FileWriter("text.txt");
		throw new IOException("파일 쓰기에 실패");
	}
}
