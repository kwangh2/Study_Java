package pack02.product;

import java.util.Scanner;

public class ProductMain {
	public static void main(String[] args) {
//		dto.setGrade(123);
////		dto.price = 5000;
//		dto.setName("asd");
//		dto.setPrice(105000);
//		System.out.println(dto.getName() + dto.getPrice());
////		System.out.println(dto.grade + " . " + dto.name + " . " + dto.price );
//		Scanner sc = new Scanner(System.in);
		ProductDAO dao = new ProductDAO();
		ProductDTO dto = new ProductDTO(100, 3500, "mixCoffee");
		ProductDTO dto2 = new ProductDTO(152, 30000, "Cup");
		ProductDTO dto3 = new ProductDTO(162, 5000, "Tea");
		ProductDTO[] dtos = new ProductDTO[3];		
		dao.display(dto);
		dtos[0] = dto;
		dtos[1] = new ProductDTO(152, 30000, "Cup");
		dtos[2] = new ProductDTO(162, 5000, "Tea");
//		for (int i=0 ; i<dtos.length; i++) {
//			dao.display(dtos[i]);
//		}
		dao.displays(dtos);
	}
}
