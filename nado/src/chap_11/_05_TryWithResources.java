package chap_11;

import java.io.BufferedWriter;

public class _05_TryWithResources {
	public static void main(String[] args) {
		MyFileWriter writer1 = null;
		try {
			writer1 = new MyFileWriter();
			writer1.write("집에 가고싶다.");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				writer1.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("----------------");
		
		try(MyFileWriter writer2 = new MyFileWriter()) {
			writer2.write("가고싶다고요");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		BufferedWriter bw = null;
	}
}

class MyFileWriter implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("파일을 정상적으로 닫습니다.");
	}
	
	public void write(String line) {
		System.out.println("파일의 내용을 입력합니다.\n입력 내용 : " + line);
	}
	
}
