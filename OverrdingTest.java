package poly;

class Mom{
	int money;
	public void shopping() {
		System.out.println("알뜰쇼핑을 합니다.");
	}
}
class Me extends Mom{
	String name;
	public void shopping() {
		System.out.println("메이크업 제품을 마음껏 삽니다.");
	}
}

public class OverrdingTest {
	public static void main(String[] args) {
		Me m1 = new Me();
		m1.name = "이현진";
		m1.shopping();
	}

}
