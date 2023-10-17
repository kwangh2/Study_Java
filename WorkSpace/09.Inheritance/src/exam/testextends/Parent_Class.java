package exam.testextends;
//
public class Parent_Class {
	//Parent_class 멤버 : 필드 (속성) , '인스턴스 멤버'
	public String parent_field1 = "PUBLIC 출력";
	String parent_field2="DEFAULT";
	private String parent_field3 = "PRIVATE";
	
	public String getParent_field3() {
		return parent_field3;
	}

	public void setParent_field3(String parent_field3) {
		this.parent_field3 = parent_field3;
	}

	public void parentMethod() {
		String localVariable = "지역변수";
		System.out.println("부모클래스의 인스턴스 멤버(메소드) ");
	}
}
