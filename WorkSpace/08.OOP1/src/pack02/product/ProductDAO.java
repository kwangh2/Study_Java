package pack02.product;

import java.util.Scanner;

public class ProductDAO {
	public void display(ProductDTO dto) {
		System.out.println(dto.getGrade()+dto.getName()+dto.getPrice());
	}
	public void displays(ProductDTO[] dtos) {
		for (int i = 0; i < dtos.length; i++) {
			display(dtos[i]);
		}
	}
}
