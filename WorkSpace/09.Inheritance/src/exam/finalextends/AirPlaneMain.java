package exam.finalextends;

public class AirPlaneMain {
	public static void main(String[] args) {
		SuperSonicAirPlane ssa = new SuperSonicAirPlane();
		ssa.takeoff();
		ssa.fly();
		ssa.flyMode = SuperSonicAirPlane.SUPERSONIC;
		ssa.land();
		
		int intValue =10;
		double doubleValue = intValue;
		//자동형변환
		doubleValue = 3.14;
		intValue = (int)doubleValue;//강제형변환 : 데이터 유실
		System.out.println(intValue);
	}
}
