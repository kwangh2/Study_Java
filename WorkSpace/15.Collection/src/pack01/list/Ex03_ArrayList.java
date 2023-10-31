package pack01.list;

import java.util.ArrayList;

public class Ex03_ArrayList {
	public static void main(String[] args) {
		ArrayList<DepartmentDTO> list = new ArrayList<>();
		list.add(new DepartmentDTO(1, 12, 13, "개발1팀"));
		list.add(new DepartmentDTO(2, 22, 23, "개발2팀"));
		list.add(new DepartmentDTO(3, 32, 33, "개발3팀"));
		list.add(new DepartmentDTO(4, 42, 43, "개발4팀"));
		
		list.remove(3);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getDepartmentName());
		}
	}
}
