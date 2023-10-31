package test01.board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardDAO {
	Scanner sc = new Scanner(System.in);
	List<BoardDTO> write = new ArrayList<>();
	int num;

	public void mainScreen() {
		while (true) {
			System.out.println("작성-1 , 삭제-2 , 검색-3");
			String temp = sc.nextLine();
			if (temp.equals("1")) {
				writing();
			} else if (temp.equals("2")) {
				delete();
			} else if (temp.equals("3")) {
				search();
			} else if(temp.equals("4")) {
				for (int i = 0; i < write.size(); i++) {
					System.out.print(write.get(i).getTitle());
					System.out.print(write.get(i).getWriter());
					System.out.print(write.get(i).getContent());
					System.out.println(write.get(i).getNumId());
				}
			
			}else{
				System.out.println("유효한 값이 아닙니다.");
			}
		}

	}

	public void writing() {

		System.out.println("제목 // 작성자 // 내용을 입력해주세요 ");
		write.add(new BoardDTO(sc.nextLine(), sc.nextLine(), sc.nextLine(), num));
		++num;
		mainScreen();
	}

	public void delete() {
		System.out.println("지울 글 번호 입력");
		String temp = sc.nextLine();
		int num = Integer.parseInt(temp);
		write.remove(num);
		mainScreen();
	}

	public void search() {
		System.out.println("검색");
		String str = sc.nextLine();
		for (int i = 0; i < write.size(); i++) {
			if (write.get(i).getTitle().equals(str) == true) {
				System.out.println(write.get(i).getTitle().equals(str));
			}else {
				System.out.println("해당제목없음.");
			}
		}
		mainScreen();
	}
}
