package pack02.product;
//DTO : 객체의 속성 (데이터 베이스에 있는 데이터 타입에 맞춰서 데이터를 "운반")
//Data Transfer Object
public class ProductDTO {
	private int grade;
	private int price;
	private String name;
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ProductDTO(int grade, int price, String name) {
		super();
		this.grade = grade;
		this.price = price;
		this.name = name;
	}

	
}
