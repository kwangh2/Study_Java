package OOP;

public class CarMainb {
	public static void main(String[] args) {
		carDAO dao = new carDAO();
		carDTO dto1 = new carDTO("kona", "hyundai", "hybrid", 2500);
		carDTO dto2 = new carDTO("torres", "ssangyoung", "electric", 3800);
		carDTO dto3 = new carDTO("santafe", "hyundai", "diesel" , 4000);
		dao.displays(dto3);
	}
	
}
