import java.util.Arrays;
import java.util.Scanner;

public class BJ3003_chess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] chessF = { 1, 1, 2, 2, 2, 8 }; // 체스말
		int[] chessD = new int[chessF.length];// 동수말
		int[] chessGap = new int[chessF.length];// 동수말
		for (int i = 0 ; i < chessF.length; i++) {
			chessD[i] = sc.nextInt();
			chessGap[i] =  chessF[i] - chessD[i];
		}// 동수 말 입력
		System.out.println(Arrays.toString(chessGap));
	}
}
