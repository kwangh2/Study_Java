package pack02.product;

import java.security.PublicKey;
import java.util.Scanner;

public class ProductAnswer {
	public void display(ProductDTO dto) {
//		System.out.println(dto.getNumber() + ". " + dto.getName() + " " + dto.getPrice() + "원");
	}

	public void displays(ProductDTO[] dtos) {
		for (int i = 0; i < dtos.length; i++) {
			display(dtos[i]);
		}
	}

	public ProductDTO[] selectRead() {
		ProductDTO[] dtos = new ProductDTO[5];

		dtos[0] = new ProductDTO(1, 15000, "스카프");
		dtos[1] = new ProductDTO(2, 1000, "마늘");
		dtos[2] = new ProductDTO(3, 66000, "커피");
		dtos[3] = new ProductDTO(4, 6000, "피");
		dtos[4] = new ProductDTO(5, 6600, "커");
		return dtos;
	}

	public ProductDTO[] delete(ProductDTO[] dtos) {
		int choice = userInputNum();
		dtos[choice - 1] = null;
		ProductDTO[] tempDtos = new ProductDTO[dtos.length - 1];
		int idx = 0;
		for (ProductDTO dto : dtos) {
			if (dto != null) {
				tempDtos[idx] = dto;
				idx++;
			}
		}
		return tempDtos;
	}
	public int userInputNum() {
		while (true) {
			System.out.println("삭제 상품 번호 입력");
			Scanner scan = new Scanner(
System.in
);
			try {
				int inputNum = Integer.parseInt(scan.nextLine());
				return inputNum;
			} catch (Exception e) {
				System.out.println("입력 오류");
			}
		}
	}
} 