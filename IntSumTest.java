package exercise;

public class IntSumTest {

	public static void main(String[] args) {
		
		IntSum i1 = new IntSum(3, 5);
		System.out.println(i1.toString());
		
		IntSum i2 = new IntSum(5, 4, 2);
		System.out.println(i2.toString());
		
		IntSum i3 = new IntSum(5, 4, 2, 9);
		System.out.println(i3.toString());
	}

}
