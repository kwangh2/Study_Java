package pack01.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex01_ArrayList {
	public static void main(String[] args) {
//		String[] strArr = {"A","B","C","D","E"};
//		System.out.println(Arrays.toString(strArr));
//		String[] tempArr = new String[6];
//		tempArr = strArr;
//		strArr = new String[6];
//		strArr = tempArr;
//		strArr[5] = "F";
//		System.out.println(Arrays.toString(strArr));
	
	//배열은 사이즈를 미리 지정후 변경이 불가능 -> 데이터 추가&삭제 시 불편한점이 많음
	//List <- Interface
//	List<E>  E<= Element(요소) extends Object (객체 형태로 초기화 가능) 클래스 타입만 가능! 기본형태 데이터 타입 xx
	List<String> list = new ArrayList<>();
	list.add("A");
	list.add("b");
	list.add("c");
	list.add("d");
	list.add("e");
	System.out.println("리스트 크기" + list.size());
	System.out.println("리스트 [0] : " + list.get(0));
	for (int i = 0; i < list.size(); i++) {
		System.out.print(list.get(i)+ ",");
	}

	}
}
