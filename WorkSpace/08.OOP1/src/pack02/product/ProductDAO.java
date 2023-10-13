package pack02.product;

import java.util.Arrays;
import java.util.Scanner;

public class ProductDAO {
	public void display(ProductDTO dto) {
		System.out.println(dto.getGrade() + dto.getName() + dto.getPrice());
	}

	public void displays(ProductDTO[] dtos) {
		for (int i = 0; i < dtos.length; i++) {
			display(dtos[i]);
		}
	}

	// CRUD : 자료 조회, 추가, 수정, 삭제
	public ProductDTO[] selectRead() {
		ProductDTO[] dtos = new ProductDTO[3];
		ProductDTO dto = new ProductDTO(1, 3500, "mixCoffee");
		ProductDTO dto2 = new ProductDTO(2, 30000, "Cup");
		ProductDTO dto3 = new ProductDTO(3, 5000, "Tea");
		return dtos;
	}

	public void delete(ProductDTO[] dtos) {
		while (!userInput()) {
			System.out.println("다시입력하나?");
		}
		System.out.println("???");

//		int choice = userInput().inputnum;
//		dtos[choice - 1] = null;
		ProductDTO[] tempDtos = new ProductDTO[dtos.length];
		int idx = 0;
		for (ProductDTO dto : dtos) {
			if (dto != null) {
				tempDtos[idx] = dto;
				idx++;
			}
		}
	}

	public boolean userInput() {
		System.out.println("삭제 상품 번호 입력");
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				int inputNum = Integer.parseInt(sc.nextLine());
				return true;
			} catch (Exception e) {
				System.out.println("오류발생");
			} finally {
//			sc.close();//통신종료 
			}
			return false;
		}
	}
	public void find() {
		String str = new String(" s:t:r객체 ");
		//문자열의 길이 : 몇 글자 이상 입력을 받아야할때.
		System.out.println(str.length());
		//문자열의 시작값 startWith
		System.out.println(str.startsWith("s"));
		System.out.println(str.startsWith("a"));
		//내가 찾는 글자가 몇번쨰에 있는지 체크
		System.out.println(str.indexOf(':'));
		
		//원하는 글자 바꾸기
		System.out.println(str.replace(':', ' '));
		String[] strs = str.split(":");
		System.out.println(Arrays.toString(strs));
		//대문자 변환, 소문자 변환
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		//Trim()공백을 제거 -> DB
		System.out.println(str.trim());
		//subString(문자열자르기) : indexOf
		System.out.println(str.substring(4));
		System.out.println(str.substring(4,str.indexOf('r')+1));
		//문자열에 특정값 포함여부를 boolean해줌
		System.out.println(str.contains("객체"));
		System.out.println(str.contains("la"));
	}
}
