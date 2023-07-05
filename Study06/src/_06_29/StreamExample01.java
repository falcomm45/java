package _06_29;

import java.util.ArrayList;
import java.util.List;

public class StreamExample01 {
	public static void main(String[] args) {
		List<User> user = new ArrayList<>();

		user.add(new User("김프로", "축구:농구:야구", "구기종목 좋아요"));
		user.add(new User("정프로", "개발:당구:축구", "개발하는데 뛰긴 싫어"));
		user.add(new User("앙몬드", "피아노", "죠르디가 좋아요 좋아좋아너무좋아"));
		user.add(new User("죠르디", "스포츠댄스:개발", "개발하는 죠르디 좋아"));
		user.add(new User("박프로", "골프:야구", "운동이 좋아요"));
		user.add(new User("정프로", "개발:축구:농구", "개발도 좋고 운동도 좋아"));

		int soccer = (int) user.stream().filter(x -> x.hobby.contains("축구")).count();
		int basketball = (int) user.stream().filter(x -> x.hobby.contains("농구")).count();
		int baseball = (int) user.stream().filter(x -> x.hobby.contains("야구")).count();
		int piano = (int) user.stream().filter(x -> x.hobby.contains("피아노")).count();
		int sportDance = (int) user.stream().filter(x -> x.hobby.contains("스포츠댄스")).count();
		int programing = (int) user.stream().filter(x -> x.hobby.contains("개발")).count();
		int billiards = (int) user.stream().filter(x -> x.hobby.contains("당구")).count();
		int golf = (int) user.stream().filter(x -> x.hobby.contains("골프")).count();

		System.out.println(soccer);
		System.out.println(basketball);
		System.out.println(baseball);
		System.out.println(piano);
		System.out.println(sportDance);
		System.out.println(programing);
		System.out.println(billiards);
		System.out.println(golf);
		System.out.println();
		
		soccer = (int) user.stream().filter(x -> x.name.contains("정")).filter(x -> x.hobby.contains("축구")).count();
		basketball = (int) user.stream().filter(x -> x.name.contains("정")).filter(x -> x.hobby.contains("농구")).count();
		baseball = (int) user.stream().filter(x -> x.name.contains("정")).filter(x -> x.hobby.contains("야구")).count();
		piano = (int) user.stream().filter(x -> x.name.contains("정")).filter(x -> x.hobby.contains("피아노")).count();
		sportDance = (int) user.stream().filter(x -> x.name.contains("정")).filter(x -> x.hobby.contains("스포츠댄스")).count();
		programing = (int) user.stream().filter(x -> x.name.contains("정")).filter(x -> x.hobby.contains("개발")).count();
		billiards = (int) user.stream().filter(x -> x.name.contains("정")).filter(x -> x.hobby.contains("당구")).count();
		golf = (int) user.stream().filter(x -> x.name.contains("정")).filter(x -> x.hobby.contains("골프")).count();
		
		System.out.println(soccer);
		System.out.println(basketball);
		System.out.println(baseball);
		System.out.println(piano);
		System.out.println(sportDance);
		System.out.println(programing);
		System.out.println(billiards);
		System.out.println(golf);
		System.out.println();
		
		
		int like = (int)user.stream().filter(x -> x.introduce.contains("좋아")).count();
		System.out.println(like);
	}
}

class User {
	String name;
	String hobby;
	String introduce;

	User(String name, String hobby, String introduce) {
		this.name = name;
		this.hobby = hobby;
		this.introduce = introduce;
	}

}