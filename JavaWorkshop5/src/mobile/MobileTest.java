package mobile;

public class MobileTest {

	public static void main(String[] args) {
		// 각각의 Mobile 객체 생성
		MobileTest mTest = new MobileTest();
		Ltab lt = new Ltab("Ltab", 500, "AP-01");
		Otab ot = new Otab("Otab", 1000, "AND-20");
		
		// 생성된 객체의 정보 출력
		printInfo(lt, ot);
		
		// 각각의 Mobile 객체에 10분씩 충전
		lt.charge(10);
		ot.charge(10);
		
		// 10분 충전 후 객체 정보 출력
		System.out.println("10분 충전");
		printInfo(lt, ot);
		
		// 각각의 Mobile 객체에 5분씩 통화
		lt.operate(5);
		ot.operate(5);
		
		// 5분 통화 후 객체 정보 출력
		System.out.println("5분 통화");
		printInfo(lt, ot);
	}
	
	public static void printInfo(Ltab lt, Otab ot) {
		System.out.println("Mobile\t\tBattery\t\tOS\n"
						 + "---------------------------------------");
		System.out.printf("%s%n%s%n%n", lt, ot);
	}

}
