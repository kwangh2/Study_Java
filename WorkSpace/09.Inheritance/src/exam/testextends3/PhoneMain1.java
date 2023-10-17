package exam.testextends3;

public class PhoneMain1 {
	public static void main(String[] args) {
		Dmbphone dmb = new Dmbphone("가로본능", "블랙", 12);
	System.out.println(dmb.model + " " + dmb.color + "준비완료");
	dmb.powerOn();
	dmb.bell();
	dmb.sendVoice("Hello");
	dmb.receiveVoice();
	dmb.hangUp();
	dmb.changeChannel(23);
	dmb.turnOnDmb();
	dmb.turnOff();
	dmb.powerOff();
	}
}
