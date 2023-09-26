package pack03.exarray2;

public class Test02_Array {
	public static void main(String[] args) {
		String[] dogArr = {"강아지", "진돗개", "불독", "시츄"};
		String[] catArr = {"페르시안", "고양이", "노르웨이"};
		String[][] animalArr = new String[2][];
		animalArr[0] = dogArr;
		animalArr[1] = catArr;
		//String animalArr = {dogArr, catArr};
		for(int i = 0; i<dogArr.length; i++) {
			System.out.println(dogArr[i]);
		}
		System.out.println(dogArr[1]);
	}
}
