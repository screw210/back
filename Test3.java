package Test;
//초기화(사용자가 특정한 값으로 초기화)
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[3];
		score[0] = 90;
		score[1] = 88;
		score[2] = 56;
		
		double[] b = new double[] {3.5, 6.7, 2.0};
		for(int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		String[] s = {"I", "am", "a", "girl"};
		for(int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
		} System.out.println();
		
		int[] a = {1, 2, 3};
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
		String st[] = new String[3];
		for(int i = 0; i < st.length; i++) {
			System.out.println(st[i]);
		}
	}

}
