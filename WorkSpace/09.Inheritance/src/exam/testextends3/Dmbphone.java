package exam.testextends3;

public class Dmbphone extends Cellphone{
	//이미 기느잉 완성 되어있는 1세대(CellPhone)을 이용하여 방송기능이 추가 된 2세대 폰 구현
	int channel;

	public Dmbphone(String model, String color, int channel) {
		this.channel = channel;
		this.color = color;
		this.model = model;
	}
	
	public void turnOnDmb() {
		System.out.println("채널 " + channel + " 시청 시작 ");
	}
	public void turnOff() {
		System.out.println(channel + "채널 종료");
	}
	public void changeChannel(int channel) {
		this.channel = channel;
		System.out.println(channel + "변경");
	}
}
