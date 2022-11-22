package Test;

public class ArrayExam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[3];
		a[0] = a[0] + 1; //a[0]의 값은 0. 즉, 0 + 1
		a[1] = a[1] + 2; //a[1]의 값은 0. 즉, 0 + 2
		a[2] = a[2] + 3; //a[2]의 값은 0. 즉, 0 + 3 처음 배열을 선언하면 자동으로 값을 초기화 해주기 때문이다.
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] =" + a[i]);
		}
	}

}
