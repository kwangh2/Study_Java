package threadRacing;

import java.util.Random;

public class horse1 extends Thread {
	DTO dto = new DTO();
	@Override
	public void run() {
		while (dto.running1 < 100) {
			Random random = new Random();
			dto.running1 = random.nextInt(10)+1;
			System.out.println("1번마 "+ dto.running1 + "% 완주 ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
