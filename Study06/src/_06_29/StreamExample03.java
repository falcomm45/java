package _06_29;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamExample03 {
	public static void main(String[] args) throws IOException {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milano");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");

		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), 
				new Transaction(alan, 2012, 950));
		// �ŷ��ڰ� �ٹ��ϴ� ��� ���ø� �ߺ����� �����Ͻÿ�
		List<String> tran = transactions.stream()
					.map(Transaction::getTrader)
					.map(Trader::getCity)
					.distinct()
					.collect(Collectors.toList());
		System.out.println(tran);
		
		// ���Ӻ긮������ �ٹ��ϴ� ��� �ŷ��ڸ� ã�Ƽ� �̸������� �����Ͻÿ�
		tran = transactions.stream()
					.map(Transaction::getTrader)
					.filter(x -> x.getCity() == "Cambridge")
					.map(Trader::getName)
					.sorted()
					.distinct()
					.collect(Collectors.toList());
		System.out.println(tran);
		
		// ��� �ŷ����� �̸��� ���ĺ������� �����ؼ� ��ȯ�Ͻÿ�
		tran = transactions.stream()
					.map(Transaction::getTrader)
					.map(Trader::getName)
					.sorted()
					.distinct()
					.collect(Collectors.toList());
		System.out.println(tran);
		
		// �ж�뿡 �ŷ��ڰ� �ִ°�?
		boolean result = transactions.stream()
					.anyMatch(x -> x.getTrader().getCity().contains("Milano"));
		System.out.println(result);
		
		// ���Ӻ긮���� �����ϴ� �ŷ����� ��� Ʈ����ǰ��� ����Ͻÿ�
		List<Integer> val = transactions.stream()
					.filter(x -> x.getTrader().getCity().equals("Cambridge"))
					.map(Transaction::getValue)
					.collect(Collectors.toList());
		System.out.println(val);
		
		// ��ü Ʈ����� �� �ִ��� ���ΰ�?
		Optional<Integer> res = transactions.stream()
					.map(Transaction::getValue)
					.max(Comparator.comparing(x->x));
		System.out.println(res);
		
		// ��ü Ʈ����� �� �ּڰ��� ���ΰ�?
		res = transactions.stream()
					.map(Transaction::getValue)
					.min(Comparator.comparing(x->x));
		System.out.println(res);

				
		
	}
}

class Trader {
	private final String name;
	private final String city;

	public Trader(String n, String c) {
		this.name = n;
		this.city = c;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "trader:" + this.name + " in " + this.city;
	}
}

class Transaction {
	private final Trader trader;
	private final int year;
	private final int value;

	public Transaction(Trader trader, int year, int value) {
		this.trader = trader;
		this.year = year;
		this.value = value;
	}

	public Trader getTrader() {
		return trader;
	}

	public int getYear() {
		return year;
	}

	public int getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Transaction{" + "trader=" + trader + ", year=" + year + ", value=" + value + '}';
	}
}