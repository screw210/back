package poly;

class Test{			//같은 이름이니까 오버로딩
	int number;
	public void show() {							//두 개의 public 다형성
		System.out.println("내번호 : " + number);
	}
	public void show(String name) {
		System.out.println("내이름 : " + name);
	}
}

public class overloadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test();
		t1.number = 1;
		t1.show();
		t1.show("이진선");
	}
													//한 클래스 안에서 매개변수가 다른 행동을 한다.
}