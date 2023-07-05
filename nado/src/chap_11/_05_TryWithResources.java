package chap_11;

import java.io.BufferedWriter;

public class _05_TryWithResources {
	public static void main(String[] args) {
		MyFileWriter writer1 = null;
		try {
			writer1 = new MyFileWriter();
			writer1.write("���� ����ʹ�.");
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
			writer2.write("����ʹٰ��");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		BufferedWriter bw = null;
	}
}

class MyFileWriter implements AutoCloseable {

	@Override
	public void close() throws Exception {
		System.out.println("������ ���������� �ݽ��ϴ�.");
	}
	
	public void write(String line) {
		System.out.println("������ ������ �Է��մϴ�.\n�Է� ���� : " + line);
	}
	
}
