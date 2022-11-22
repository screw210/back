package test1;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//인스턴스 객체 생성
		test t1 = new test();
		t1.name = "캐스퍼";
		for(int i = 0; i < 10; i++) {
			t1.speedUP(); //100			
		}
		System.out.println(t1.name + "의 속도: " + t1.speed);
		
		test t2 = new test();
		t2.name = "그랜저";
			t2.speedUP(); t2.speedUP(); t2.speedUP();
			t2.speedDown();
			System.out.println(t2.name + "의 속도: " + t2.speed);
	}

}
