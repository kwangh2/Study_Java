package exam.array;

public class Ex01_Array {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,6,7,8,0};
		int[] numbers2 = new int[10];
		for (int i = 0; i<numbers2.length; i++) {
			for(int j = 0; j<numbers.length; j++) {
				if(i==numbers[j]) {
					numbers2[i] = 1;
				}
			}
		} 
	}
}
