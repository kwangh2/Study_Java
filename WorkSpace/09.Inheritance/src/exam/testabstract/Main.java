package exam.testabstract;

public class Main {
//	public abstract void method(); abstract라는 추상 클래스 명시가 있는 클래스만 메소드선언이 가능함
//	abstract 는 구현을 『강제』한다
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.breathe();
		Animal animal = new Dog();
		animal.breathe();
		animal.eat("츄르");
		
	}
}
