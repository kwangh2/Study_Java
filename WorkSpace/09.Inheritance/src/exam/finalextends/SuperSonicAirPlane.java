package exam.finalextends;

public class SuperSonicAirPlane extends AirPlane {
//	public static final double PI = 3.14;
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	@Override
		public void fly() {
		if(flyMode == NORMAL) {
			super.fly();
		}else if(flyMode == SUPERSONIC) {
			System.out.println("음속 비행");
		}
			
		}
}
