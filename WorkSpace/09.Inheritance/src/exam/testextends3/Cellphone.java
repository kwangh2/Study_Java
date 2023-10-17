package exam.testextends3;

import java.util.Random;

public class Cellphone {
	//기본 기능들을 가지고 있는 최상위 부모 클래스
	//필드(인스턴스멤버)
	public String model , color; //핸드폰 기종,색상
	
	//기능(인스턴스멤버)
	public void powerOn() {
		System.out.println("종료 버튼 눌러서 전원 on");
	}
	public void powerOff() {
		System.out.println("종료 버튼 눌러서 전원 off");
	}
	public void bell() {
		System.out.println("전화 와서 벨울임(소리)");
	}
	public void hangUp() {
		System.out.println("통화 종료");
	}
	public void receiveVoice() {
		System.out.println("상대방 : " + new Random().nextInt(123456)+1);
	}
	public void sendVoice(String voice) {
		System.out.println("나 : " + voice);
	}
}
