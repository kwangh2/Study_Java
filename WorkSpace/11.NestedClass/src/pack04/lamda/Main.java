package pack04.lamda;

public class Main {
	public static void main(String[] args) {
		//1. () 파라메터부 
		//2. -> 
		//3. {}
		LamdaInter lamda = new LamdaInter() {
			
			@Override
			public void method(Object o) {
				System.out.println("람다 메소드" +o );
			}
		};
	
		lamda.method("");
		
		//인터페이스의 구조를 정확히 모르는 사람은 해독하는게 힘듬 (가독성x , 코드가 줄어듬)
		lamda = (j)->{
			System.out.println("람다 메소드23" + j);
		};
		
		lamda.method("dd");
		//자료구조 . forEach ( dto -> 코드부)
		
	}
}
