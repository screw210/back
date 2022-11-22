package test1;

import java.util.Scanner;

public class SquareTest {

	public static void main(String[] args) {
		Square Sq1 = new Square();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("세로 : ");
		Sq1.height = sc.nextInt();
		System.out.print("가로 : ");
		Sq1.width = sc.nextInt();
		System.out.println("사각형의 넓이는 " + Sq1.getArea() + "cm");
		System.out.println("사각형의 둘레는 " + Sq1.getround() + "cm");
	}

}
