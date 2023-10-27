package threadMovie;

import java.util.Scanner;

public class MovieDAO extends Thread {
	Scanner sc = new Scanner(System.in);
	MovieDTO dto = new MovieDTO();

	@Override
	public void run() {
		while (dto.downlaoding != 100) {
			System.out.println(dto.movieName + " - " + dto.downlaoding + "% 다운로드중");
			dto.downlaoding += 10;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(dto.movieName + " 다운로드 완료 ");
		dto.downlaoding = 0;
	}

	public void downloadingMovie() {
		System.out.println("영화제목 입력");
		dto.movieName = sc.nextLine();
		start();
	}
}
