package Test;
//초기화
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[5];
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		//자동 초기화 : 0
		double[] b = new double[4];
		for(int i = 0; i<b.length; i++) {
			System.out.println(b[i]);
		}
	}

}
