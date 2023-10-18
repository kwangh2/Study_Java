package exam.changetp3;

public class ObjectMain {
	public static void main(String[] args) {
		Object obj = "문자열";
		String str = (String) obj;
		System.out.println(str.length() + str);
		obj = 10;
		int num = (int) obj;
		System.out.println(num);
//		obj = 10;
//		obj = new Child();	
	}
	public void method(Object obj) {
		
	}
//자바의 모든 클래스는 Object를 통해 만들어졌다.

}
