package pack02.product;

import java.util.Scanner;

public class ProductMain {
	public static void main(String[] args) {
		ProductDAO dao = new ProductDAO();
		ProductDTO dto = new ProductDTO(0, 0, null);
		
//		dao.userInput();
		dao.find();
	}
}
