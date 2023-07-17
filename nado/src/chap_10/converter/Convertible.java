package chap_10.converter;

@FunctionalInterface // <= 함수형 인터페이스로 쓸꺼야
public interface Convertible {
	
	void convert(int USD);
	// void convert2(); FunctionalInterface 때문에 에러
	
}

