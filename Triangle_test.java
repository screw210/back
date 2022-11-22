package test1;

public class Triangle_test {

	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.base = 7;
		t1.height = 9;
		System.out.println("삼각형의 넓이 : " + t1.getArea());
	}

}
