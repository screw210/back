package ex2;
//1.int형, 배열 요소 갯수가 100개면 배열을 선언하라.
//2.(초기화) for 문을 이용하여 배열의 값을 배정하라.
//3.더하는 식은 한 번만 사용한다.
public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = new int[100];
		int sum = 0;
		for(int i = 0; i <= number.length; i++) {
			number[i] = i;
			if( number[i] % 2 == 0) {
				number[i] = -number[i];
			}
			sum += number[i];
			System.out.println(number[i]);
		}
		System.out.println(sum);
	}

}
