package pack04.lamda;

//FunctionalInterface : 구현해야할 메소드(추상) 1개만 정의된 인터페이스
// 2개 이상은  람다식 표현 불가

// Listner
@FunctionalInterface
public interface LamdaInter {
	//함수형 , 객체지향(OOP)
	//함수  vs Method
	//근본적으로는 동일 -> 함수는 일반용어 : 메소드는 객체지향언어
	//함수는 클래스로부터 독립적 vs 메소드는 종속적
	// 코틀린(JavaBase)언어 vs Java(Lamda 표현식)
	void method(Object o);
}
