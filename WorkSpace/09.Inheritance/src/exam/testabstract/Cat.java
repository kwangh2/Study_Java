package exam.testabstract;

public class Cat extends Animal{

	
	@Override
	public void breathe() {
		System.out.println("고양이가 숨을쉽니다.");
		
	}

	@Override
	public int eat(String food) {
		System.out.println(food + "를 고양이가 먹음");
		return 10;
	}
	
}
