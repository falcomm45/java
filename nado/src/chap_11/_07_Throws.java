
package chap_11;

import java.io.FileWriter;
import java.io.IOException;

public class _07_Throws {
	// ���� �̷��
	// �޼ҵ带 �ۼ��Ҷ� ���ܸ� ó������ �ʰ� �޼ҵ尡 ����ɶ� ���ܸ� ó���ϵ��� ���ܸ� �̷��?
	public static void main(String[] args) {
		try {
			writeFile();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("���� �޼ҵ忡�� �ذ�");
		}
	}
	
	public static void writeFile() throws IOException {
//		try {
//			FileWriter writer = new FileWriter("text.txt");
//			throw new IOException("���� ���⿡ ����");
//		} catch (IOException e) {
//			e.printStackTrace();
//			System.out.println("writeFile �޼ҵ忡�� ��ü �ذ�");
//		}
		
		FileWriter writer = new FileWriter("text.txt");
		throw new IOException("���� ���⿡ ����");
	}
}
