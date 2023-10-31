package pack02.map;

import java.util.HashMap;

public class Ex01_Map {
	public static void main(String[] args) {
		//HashMap<Key extends Object , Value extends Object>
		//key : 데이터를 식별하기위한 식별자 , value : 데이터
		// HashMap은 데이터를 Key로 관리함 (index)
		// key는 동일한 데이터 입력 x 
		// put 데이터 넣기
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "임꺽정");
		map.put(1, "이몽룡");
		System.out.println(map.get(1));
		System.out.println(map.size());
	}
}
