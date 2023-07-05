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
		// 거래자가 근무하는 모든 도시를 중복없이 나열하시오
		List<String> tran = transactions.stream()
					.map(Transaction::getTrader)
					.map(Trader::getCity)
					.distinct()
					.collect(Collectors.toList());
		System.out.println(tran);
		
		// 케임브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오
		tran = transactions.stream()
					.map(Transaction::getTrader)
					.filter(x -> x.getCity() == "Cambridge")
					.map(Trader::getName)
					.sorted()
					.distinct()
					.collect(Collectors.toList());
		System.out.println(tran);
		
		// 모든 거래자의 이름을 알파벳순으로 정리해서 반환하시오
		tran = transactions.stream()
					.map(Transaction::getTrader)
					.map(Trader::getName)
					.sorted()
					.distinct()
					.collect(Collectors.toList());
		System.out.println(tran);
		
		// 밀라노에 거래자가 있는가?
		boolean result = transactions.stream()
					.anyMatch(x -> x.getTrader().getCity().contains("Milano"));
		System.out.println(result);
		
		// 케임브리지에 거주하는 거래자의 모든 트랜잭션값을 출력하시오
		List<Integer> val = transactions.stream()
					.filter(x -> x.getTrader().getCity().equals("Cambridge"))
					.map(Transaction::getValue)
					.collect(Collectors.toList());
		System.out.println(val);
		
		// 전체 트랜잭션 중 최댓값은 얼마인가?
		Optional<Integer> res = transactions.stream()
					.map(Transaction::getValue)
					.max(Comparator.comparing(x->x));
		System.out.println(res);
		
		// 전체 트랜잭션 중 최솟값은 얼마인가?
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