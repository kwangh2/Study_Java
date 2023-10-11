package OOP;

public class carDAO {
	public void displays(carDTO dto) {
		System.out.println(dto.getCompany() + dto.getModel() + dto.getPrice() + dto.getType());
	}
}
