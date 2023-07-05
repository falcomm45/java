package _06_26;

import java.util.ArrayList;
import java.util.List;

public class List01 {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getTitle() + " - " + list.get(i).getContent());
		}
		System.out.println("---------------");
		for (Board b : list) {
			System.out.println(b.getTitle() + " - " + b.getContent());
		}
		
	}
}

class Board {
	private String title;
	private String content;
	
	public Board(String title, String content)  {
		this.title = title;
		this.content = content;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}
}

class BoardDao {
	
	ArrayList<Board> list = new ArrayList<>();
	
	ArrayList<Board> getBoardList(){
		list.add(new Board("力格1", "郴侩 1"));
		list.add(new Board("力格2", "郴侩 2"));
		list.add(new Board("力格3", "郴侩 3"));
		
		return list;
	}
}


