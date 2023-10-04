package pack02.trycatch;

public class Ex03_TryCatchOrder {
	public static void main(String[] args) {
		try {
//			String str = null;
//			System.out.println(str.length());
//			System.out.println(0/0);
			String str2 = "abc";
			Double.parseDouble(str2);
		}catch(NumberFormatException e) {
			System.out.println("숫자가 아닌값을 숫자변수로 전환");
		}
		catch (ArithmeticException e) {
			System.out.println("0으로 나눠서 오류");
		} catch (NullPointerException e) {
			System.out.println("nullpointer오류");
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		}
	}
}
