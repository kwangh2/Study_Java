package OOP;

public class carDTO {
	private String model, company, type;
	private int price;
	public carDTO(String model, String company, String type, int price) {
		super();
		this.model = model;
		this.company = company;
		this.type = type;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	};
	
}
