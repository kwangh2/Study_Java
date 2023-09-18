
public class exam {
	public static void main(String[] args) {
		int x= 10;
		int y = 10;
		int z ;
		x++;
		++x;
		--y;
		y--;
		z = x++;
		
		z = ++x;
		z = ++x + --y;
		
		System.out.println(y);
		System.out.println(z);
	}
}
