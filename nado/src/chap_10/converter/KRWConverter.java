package chap_10.converter;

public class KRWConverter implements Convertible {

	@Override
	public void convert(int USD) {
		// 1�޷� = 1400��
		System.out.println(USD + "�޷� = " + (USD * 1400) + "��");
	}

}
