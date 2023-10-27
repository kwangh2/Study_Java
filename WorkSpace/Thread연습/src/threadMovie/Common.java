package threadMovie;

import java.util.Scanner;

public class Common {
	SongDAO sDAO = new SongDAO();
	MovieDAO mDAO = new MovieDAO();
	Scanner sc = new Scanner(System.in);
	String btn;

	public void choice() {
		while(true) {
			System.out.println("-1 / 노래 / 영화");
			btn = sc.nextLine();
			if (btn.equals("-1")) {
				System.out.println("종료");
				break;
			} else if (btn.equals("노래")) {
				sDAO.downloadSong();
				
			} else if (btn.equals("영화")) {
				mDAO.downloadingMovie();
			}
		}
	}
}
