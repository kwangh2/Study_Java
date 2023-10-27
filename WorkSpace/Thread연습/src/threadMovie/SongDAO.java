package threadMovie;

import java.util.Scanner;

public class SongDAO extends Thread {
	Scanner sc = new Scanner(System.in);
	SongDTO dto = new SongDTO();
	@Override
	public void run() {
		while(dto.downloadSong != 100) {
			System.out.println(dto.songName + " - " + dto.downloadSong + "% 다운로드 중");
			dto.downloadSong += 10;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(dto.songName + " 다운로드 완료");
		dto.downloadSong = 0;
	}
	
	public void downloadSong() {
		System.out.println("다운로드할 음악을 입력해주세요");
		dto.songName = sc.nextLine();	
		start();
	}
	
	
}
