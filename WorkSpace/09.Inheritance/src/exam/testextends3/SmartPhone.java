package exam.testextends3;

public class SmartPhone extends Dmbphone{

	String InternetSpeed;
	//부모클래스가 먼저 생성이 되는데 dmbphone은 3개의 파라메터를 입력받는 생성자 메소드가 존재
	//따라서 dmbphone이 생성되기위한 String x 2 , int x 1 이 반드시 필요함
	public SmartPhone(String model, String color, int channel , String internetSpeed) {
		super(model, color, channel);
		this.InternetSpeed = internetSpeed;
	}
	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		//super.powerOn(); 부모 클래스에있는 메소드를 그대로사용
		System.out.println("홀드 버튼으로 전원 ON");
	}
	public void onInternet() {
		System.out.println(InternetSpeed + "속로로 웹툰봄");
	}
}
